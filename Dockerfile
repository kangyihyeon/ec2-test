# Dockerfile

# java 11
FROM openjdk:11-jdk

# application port
EXPOSE 8080

# JAR_FILE configuration
ARG JAR_FILE=./build/libs/test-0.0.1-SNAPSHOT.jar

# application file
COPY ${JAR_FILE} app.jar

# system entry point
ENTRYPOINT ["java","-jar","/app.jar"]





