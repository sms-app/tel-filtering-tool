FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} tel-filtering-tool-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/tel-filtering-tool-0.0.1-SNAPSHOT.jar"]