# Use OpenJDK 17 as the base image
FROM openjdk:17-jdk-slim

# Set the maintainer label
LABEL maintainer="vilasjdhv639"

# Copy the JAR file from the build context to the container
COPY target/SpringJenkin-0.0.1-SNAPSHOT.jar SpringJenkin-1.0.0.jar

# Expose the application port
EXPOSE 8081

# Command to run the application
ENTRYPOINT ["java", "-jar", "/SpringJenkin-1.0.0.jar"]
