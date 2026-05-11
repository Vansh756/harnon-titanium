#!/bin/sh

# Gradle wrapper

dirname="$(dirname "$0")"

if [ -n "$JAVA_HOME" ]; then
    JAVACMD="$JAVA_HOME/bin/java"
else
    JAVACMD=java
fi

exec "$JAVACMD" -Xmx4096m -Dfile.encoding=UTF-8 -jar "$dirname/gradle/wrapper/gradle-wrapper.jar" "$@"
