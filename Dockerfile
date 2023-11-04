FROM eclipse-temurin:18-jdk-alpine
VOLUME /tmp
#ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005
COPY build/libs/*-RELEASE.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
