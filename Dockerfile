# Use a base image with Maven and OpenJDK 21
FROM maven:3.9.6-eclipse-temurin-21 AS builder

# Set the working directory inside the container
WORKDIR /app

# Copy the application's source code into the container
COPY . .

# Build the application without running tests
RUN mvn clean package -DskipTests

# Use a smaller JDK image for the final image
FROM eclipse-temurin:21-jre-jammy

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from the builder stage into the final image and rename it
COPY --from=builder /app/target/food-delivery-api-1.0.0-SNAPSHOT.jar food-delivery-api.jar

# Command to run the application
CMD ["java", "-jar", "food-delivery-api.jar"]
