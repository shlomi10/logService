FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/shuffle-log*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
