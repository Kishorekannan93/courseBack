# Use OpenJDK 17 as base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the project files
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src/ src/

# Give execution permission to Maven Wrapper
RUN chmod +x mvnw

# Build the application
RUN ./mvnw package -DskipTests

# Run the application
CMD ["java", "-jar", "target/*.jar"]
