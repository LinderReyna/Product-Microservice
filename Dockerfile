FROM eclipse-temurin:11-jdk
MAINTAINER jossemar.com
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} product-microservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/product-microservice-0.0.1-SNAPSHOT.jar"]