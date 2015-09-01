#!/bin/sh
java -Duser.timezone=UTC -Dfile.encoding=UTF-8 -XX:+HeapDumpOnOutOfMemoryError -cp "*":"../libs/*" com.backendless.coderunner.CodeRunnerLoader deploy $@