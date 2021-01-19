FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar azuretesthome.jar
ENTRYPOINT ["java", "-jar", "/azuretesthome.jar"]
