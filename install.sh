#!/bin/bash
sudo apt-get update -y
sudo apt install git maven ant vim openjdk-8-jdk -y
sudo update-alternatives --set java $(sudo update-alternatives --list java | grep "java-8")

export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
echo export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64 >> ~/.bashrc


sudo apt-get install unzip autoconf libtool g++ make -y
mkdir $HOME/anduril-dep
DEP=$HOME/anduril-dep # modify this path to where you want the dependencies installed
cd $DEP
wget https://github.com/OrderLab/Anduril/raw/main/systems/protobuf-2.5.0.zip
unzip protobuf-2.5.0.zip
cd protobuf-2.5.0/
autoreconf -f -i -Wall,no-obsolete
./configure --prefix=$DEP/protobuf-build
make -j4
make install
export PATH=$DEP/protobuf-build/bin:$PATH
echo "export PATH=$DEP/protobuf-build/bin:\$PATH" >> ~/.bashrc
protoc --version
