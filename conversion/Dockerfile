# syntax=docker/dockerfile:1
FROM openjdk:11
ARG JAVA_FILE=target/conversion.jar
COPY ${JAVA_FILE} conversion.jar
EXPOSE 8084
ENTRYPOINT ["java","-jar","conversion.jar"]