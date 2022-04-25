# syntax=docker/dockerfile:1
FROM openjdk:11
ARG JAVA_FILE=target/company.jar
COPY ${JAVA_FILE} company.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","company.jar"]