#base image
FROM openjdk:8-alpine

MAINTAINER Towfeeq
WORKDIR /app
COPY target/helloWorld-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["java","-jar","helloWorld-0.0.1-SNAPSHOT.jar"]