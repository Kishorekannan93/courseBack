# Use OpenJDK 21 as base image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the project files
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src/ src/

# Give execution permission to Maven Wrapper
RUN chmod +x mvnw

# Build the application
RUN ./mvnw package -DskipTests && cp target/*.jar app.jar

# Expose application port (optional, change if needed)
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
