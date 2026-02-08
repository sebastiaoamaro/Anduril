#!/usr/bin/env bash
/vagrant/auxiliary_scripts/change_java.sh 8

cd /vagrant/rw/Anduril/ground_truth/zookeeper-4203
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )"

zk_dir="${SCRIPT_DIR}/../../systems/zookeeper-4203"
btm_dir="${SCRIPT_DIR}/none"
target="$zk_dir"/zookeeper-server/target
classes_dir="$target/classes"
#runtime_classes_dir="$SCRIPT_DIR/runtime-classes"
testclasses_dir="$target/test-classes"
jars="."
for i in $target/lib/*.jar; do jars="$i:$jars"; done
for i in `find $HOME/.m2/repository/org/jboss/byteman/ -name "*.jar"`; do jars="$i:$jars"; done
for i in `find $JAVA_HOME -name "*.jar"`; do jars="$i:$jars"; done
testcase="org.apache.zookeeper.server.quorum.LeaderLeadingStateTest"
byteman=""
for i in `find $HOME/.m2/repository/org/jboss/byteman/byteman/*/**.jar`; do byteman=$i; done

mkdir -p $SCRIPT_DIR/build
for i in 1 2 3; do
  rm -rf /tmp/zookeeper$i
done

exec -a "$0" java \
-cp $btm_dir:$classes_dir:$testclasses_dir:$jars \
org.junit.runner.JUnitCore $testcase > output.log
#java \
#-cp $btm_dir:$classes_dir:$testclasses_dir:$jars \
#org.junit.runner.JUnitCore $testcase
