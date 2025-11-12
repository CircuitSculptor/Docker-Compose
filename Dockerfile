# Build stage (optional if you build jar on host; here we copy the jar only)
FROM eclipse-temurin:25-jre AS runtime
WORKDIR /app

# Copy the fat jar built by Maven
COPY target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]