FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/room-service-1.0.0.jar room-service-1.0.0.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "room-service-1.0.0.jar"]
