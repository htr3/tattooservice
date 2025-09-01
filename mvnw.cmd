@echo off
set MAVEN_PROJECTBASEDIR=%MAVEN_BASEDIR%
if "%MAVEN_BASEDIR%"=="" set MAVEN_PROJECTBASEDIR=%CD%
set MAVEN_OPTS=-Xmx1024m
java -jar "%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.jar" %*