FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/auth-service-1.0.0.jar auth-service-1.0.0.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "auth-service-1.0.0.jar"]
