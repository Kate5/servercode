#!/bin/sh
JAVA_ARGS="-Djava.net.preferIPv4Stack=true -Duser.timezone=UTC -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5006 -Dfile.encoding=UTF-8 -XX:+HeapDumpOnOutOfMemoryError"
java $JAVA_ARGS  -cp "*:../libs/*" com.backendless.coderunner.CodeRunnerLoader $@