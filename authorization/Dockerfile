# syntax=docker/dockerfile:1
FROM openjdk:11
ARG JAVA_FILE=target/authorization.jar
COPY ${JAVA_FILE} authorization.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","authorization.jar"]