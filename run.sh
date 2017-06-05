#!/bin/bash

cd $1
mvn clean package
java -Xmx4g -Xms4g -jar target/$1-1.0-SNAPSHOT.jar
