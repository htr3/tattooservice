#!/bin/sh
export MAVEN_PROJECTBASEDIR=${MAVEN_BASEDIR:-"$PWD"}
export MAVEN_OPTS="-Xmx1024m"
exec "$MAVEN_PROJECTBASEDIR/.mvn/wrapper/maven-wrapper.jar" "$@"