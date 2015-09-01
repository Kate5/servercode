@echo off

title Backendless CodeRunner

echo Starting CodeRunner

java -Duser.timezone=UTC -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 -Dfile.encoding=UTF-8 -cp "*;../libs/*" com.backendless.coderunner.CodeRunnerLoader deploy
