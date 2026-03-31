# Use lightweight JDK
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy jar
COPY target/place-service-0.0.1-SNAPSHOT.jar app.jar

# Run app
ENTRYPOINT ["java", "-jar", "app.jar"]