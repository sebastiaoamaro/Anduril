#!/bin/bash
set -euo pipefail

sudo apt-get update -y
sudo apt-get install -y git maven ant vim openjdk-8-jdk openjdk-17-jdk

# Keep Java 8 as the default (original behavior)
sudo update-alternatives --set java "$(sudo update-alternatives --list java | grep 'java-8' | head -n1)"

export JAVA_HOME_8=/usr/lib/jvm/java-8-openjdk-amd64
export JAVA_HOME_17=/usr/lib/jvm/java-17-openjdk-amd64

# Default to Java 8 in interactive shells
export JAVA_HOME="$JAVA_HOME_8"

{
  echo "export JAVA_HOME_8=/usr/lib/jvm/java-8-openjdk-amd64"
  echo "export JAVA_HOME_17=/usr/lib/jvm/java-17-openjdk-amd64"
  echo "export JAVA_HOME=\$JAVA_HOME_8"
  echo "export PATH=\$JAVA_HOME/bin:\$PATH"
  echo "use_java8()  { export JAVA_HOME=\$JAVA_HOME_8;  export PATH=\$JAVA_HOME/bin:\$(echo \$PATH | tr ':' '\n' | grep -v '/usr/lib/jvm/java-' | paste -sd: -); java -version; }"
  echo "use_java17() { export JAVA_HOME=\$JAVA_HOME_17; export PATH=\$JAVA_HOME/bin:\$(echo \$PATH | tr ':' '\n' | grep -v '/usr/lib/jvm/java-' | paste -sd: -); java -version; }"
} >> ~/.bashrc

sudo apt-get install -y unzip autoconf libtool g++ make
mkdir -p "$HOME/anduril-dep"
DEP=$HOME/anduril-dep # modify this path to where you want the dependencies installed
cd "$DEP"
wget -q https://github.com/OrderLab/Anduril/raw/main/systems/protobuf-2.5.0.zip
unzip -o protobuf-2.5.0.zip
cd protobuf-2.5.0/
autoreconf -f -i -Wall,no-obsolete
./configure --prefix="$DEP/protobuf-build"
make -j4
make install

export PATH="$DEP/protobuf-build/bin:$PATH"
echo "export PATH=$DEP/protobuf-build/bin:\$PATH" >> ~/.bashrc
protoc --version
