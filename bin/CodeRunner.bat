@echo off

title Backendless CodeRunner

echo Starting CodeRunner

java -Djava.net.preferIPv4Stack=true -Duser.timezone=UTC -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 -Dfile.encoding=UTF-8 -XX:+HeapDumpOnOutOfMemoryError -cp "*;../libs/*" com.backendless.coderunner.CodeRunnerLoader

pause
