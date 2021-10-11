FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 14000
ARG JAR_FILE=target/Task-Management-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} Task-Management.jar
ENTRYPOINT ["java","-jar","/Task-Management.jar"]


