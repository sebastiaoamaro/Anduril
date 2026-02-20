#!/bin/bash
set -euo pipefail

sudo apt-get update -y
sudo apt-get install -y \
  git maven ant vim \
  openjdk-8-jdk openjdk-17-jdk \
  unzip autoconf libtool g++ make \
  wget ca-certificates

JAVA_HOME_8=/usr/lib/jvm/java-8-openjdk-amd64
JAVA_HOME_17=/usr/lib/jvm/java-17-openjdk-amd64

# Keep Java 8 as the system default (java + javac)
sudo update-alternatives --set java  "$(sudo update-alternatives --list java  | grep 'java-8'  | head -n1)"
sudo update-alternatives --set javac "$(sudo update-alternatives --list javac | grep 'java-8'  | head -n1)"

# Persist helpers, but DO NOT force JAVA_HOME/bin at the front of PATH globally.
{
  echo ""
  echo "# Anduril Java helpers (installed by rw/Anduril/install.sh)"
  echo "export JAVA_HOME_8=${JAVA_HOME_8}"
  echo "export JAVA_HOME_17=${JAVA_HOME_17}"
  echo ""
  echo "use_java() {"
  echo "  local v=\"\$1\""
  echo "  local jhome=\"\""
  echo "  if [ \"\$v\" = \"8\" ]; then jhome=\"\$JAVA_HOME_8\"; fi"
  echo "  if [ \"\$v\" = \"17\" ]; then jhome=\"\$JAVA_HOME_17\"; fi"
  echo "  if [ -z \"\$jhome\" ]; then echo \"Usage: use_java {8|17}\"; return 2; fi"
  echo "  export JAVA_HOME=\"\$jhome\""
  echo "  export PATH=\"\$JAVA_HOME/bin:\$(echo \"\$PATH\" | tr ':' '\\n' | grep -v '^/usr/lib/jvm/java-' | paste -sd: -)\""
  echo "  command -v sudo >/dev/null 2>&1 && sudo update-alternatives --set java  \"\$JAVA_HOME/bin/java\"  >/dev/null 2>&1 || true"
  echo "  command -v sudo >/dev/null 2>&1 && sudo update-alternatives --set javac \"\$JAVA_HOME/bin/javac\" >/dev/null 2>&1 || true"
  echo "  java -version"
  echo "}"
  echo "use_java8()  { use_java 8; }"
  echo "use_java17() { use_java 17; }"
} >> ~/.bashrc

# Build protobuf dependency (protobuf 2.5.0)
mkdir -p "$HOME/anduril-dep"
DEP="$HOME/anduril-dep"
cd "$DEP"

wget -q https://github.com/OrderLab/Anduril/raw/main/systems/protobuf-2.5.0.zip
unzip -o protobuf-2.5.0.zip
cd protobuf-2.5.0/
autoreconf -f -i -Wall,no-obsolete
./configure --prefix="$DEP/protobuf-build"
make -j"$(nproc || echo 4)"
make install

# Make protoc available in BOTH interactive and non-interactive shells.
# - ~/.bashrc is NOT sourced by `vagrant ssh -c ...` (non-interactive).
# - ~/.profile is sourced for login shells, and we can also use /etc/profile.d.
PROTOC_BIN_DIR="$DEP/protobuf-build/bin"

# 1) Per-user: login shells
if ! grep -qs "$PROTOC_BIN_DIR" "$HOME/.profile" 2>/dev/null; then
  {
    echo ""
    echo "# Anduril protobuf (installed by rw/Anduril/install.sh)"
    echo "export PATH=\"$PROTOC_BIN_DIR:\$PATH\""
  } >> "$HOME/.profile"
fi

# 2) Per-user: interactive shells (kept for convenience)
if ! grep -qs "$PROTOC_BIN_DIR" "$HOME/.bashrc" 2>/dev/null; then
  {
    echo ""
    echo "# Anduril protobuf (installed by rw/Anduril/install.sh)"
    echo "export PATH=\"$PROTOC_BIN_DIR:\$PATH\""
  } >> "$HOME/.bashrc"
fi

# 3) System-wide (covers many non-interactive invocations depending on shell/tooling)
sudo tee /etc/profile.d/anduril-protoc.sh >/dev/null <<EOF
# Anduril protobuf (installed by rw/Anduril/install.sh)
export PATH="$PROTOC_BIN_DIR:\$PATH"
EOF
sudo chmod 644 /etc/profile.d/anduril-protoc.sh

# Verify both current process and a login shell see protoc
export PATH="$PROTOC_BIN_DIR:$PATH"
command -v protoc
protoc --version
bash -lc 'command -v protoc && protoc --version'
