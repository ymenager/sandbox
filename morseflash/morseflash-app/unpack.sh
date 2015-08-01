#!/bin/bash

export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home
cd ..
mvn clean package
cd morseflash-app/target
rm -rf verify-jar
rm -rf verify-apk
mkdir -p verify-jar
mkdir -p verify-apk
cd verify-jar
unzip -qq ../morseflash-app_obfuscated.jar
cd ../verify-apk
unzip -qq ../morseflash-app.apk
