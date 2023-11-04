FROM eclipse-temurin:18-jdk-alpine
VOLUME /tmp
COPY build/libs/*-RELEASE.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
