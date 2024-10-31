FROM openjdk:23-jdk-oracle
ARG JAR_FILE=target/showcase-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]