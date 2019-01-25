#!/bin/sh
mvn clean package -U -DskipTests=true
cd target
chmod 777 app-tests.jar
cp app-tests.jar ../
java -jar app-tests.jar