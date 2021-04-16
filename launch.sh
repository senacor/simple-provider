#!/bin/bash
export
JAVA_OPTS=$(eval echo $JAVA_OPTS)
JAVA_OPTS="$JAVA_OPTS -XshowSettings:vm"
JAVA_OPTS="$JAVA_OPTS -XX:+UseContainerSupport"
JAVA_OPTS="$JAVA_OPTS -XX:InitialRAMPercentage=60.0"
JAVA_OPTS="$JAVA_OPTS -XX:MaxRAMPercentage=60.0"
JAVA_OPTS="$JAVA_OPTS -XX:+UseG1GC"
JAVA_OPTS="$JAVA_OPTS -XX:+ExitOnOutOfMemoryError"
JAVA_OPTS="$JAVA_OPTS -Dfile.encoding=UTF-8"

echo JAVA_OPTS: $JAVA_OPTS
echo Starting: "java $JAVA_OPTS -jar /app/com.senacor.ci.simple-provider.jar"

exec java $JAVA_OPTS -Dfile.encoding=UTF-8 -jar /app/com.senacor.ci.simple-provider.jar