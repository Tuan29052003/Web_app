FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/booking-service-1.0.0.jar booking-service-1.0.0.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "booking-service-1.0.0.jar"]
