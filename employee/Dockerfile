# syntax=docker/dockerfile:1
FROM openjdk:11
ARG JAVA_FILE=target/employee.jar
COPY ${JAVA_FILE} employee.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","employee.jar"]