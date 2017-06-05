#!/bin/bash

app=$1
version=1.0-SNAPSHOT

cd $app

if [ "$app" == "jfinal3" ]; then
    mvn clean jetty:run
else
    mvn clean package
    if [ "$app" == "blade2" ]; then
        java -Xmx4g -Xms4g -jar target/dist/$app-$version/$app-$version.jar
    else
        java -Xmx4g -Xms4g -jar target/$app-$version.jar
    fi
fi