phegon-hotel-booking-and-management/
├── docker-compose.yml
├── nginx/
│   └── default.conf
│
├── auth-service/
│   ├── Dockerfile
│   ├── pom.xml
│   └── src/
│       └── main/java/com/phegondev/authservice/
│           ├── controller/AuthController.java
│           ├── dto/LoginRequest.java
│           ├── entity/User.java
│           ├── exception/OurException.java
│           ├── repo/UserRepository.java
│           ├── security/
│           │   ├── CorsConfig.java
│           │   ├── JWTAuthFilter.java
│           │   └── SecurityConfig.java
│           ├── service/
│           │   ├── CustomUserDetailsService.java
│           │   └── impl/UserService.java
│           ├── interfac/IUserService.java
│           ├── utils/JWTUtils.java
│           └── AuthServiceApplication.java
│       └── resources/application.properties
│
├── user-service/
│   ├── Dockerfile
│   ├── pom.xml
│   └── src/
│       └── main/java/com/phegondev/userservice/
│           ├── controller/UserController.java
│           ├── dto/UserDTO.java
│           ├── entity/User.java
│           ├── repo/UserRepository.java
│           ├── service/
│           │   └── impl/UserService.java
│           ├── interfac/IUserService.java
│           └── UserServiceApplication.java
│       └── resources/application.properties
│
├── booking-service/
│   ├── Dockerfile
│   ├── pom.xml
│   └── src/
│       └── main/java/com/phegondev/bookingservice/
│           ├── controller/BookingController.java
│           ├── dto/BookingDTO.java
│           ├── entity/Booking.java
│           ├── repo/BookingRepository.java
│           ├── service/
│           │   └── impl/BookingService.java
│           ├── interfac/IBookingService.java
│           └── BookingServiceApplication.java
│       └── resources/application.properties
│
├── room-service/
│   ├── Dockerfile
│   ├── pom.xml
│   └── src/
│       └── main/java/com/phegondev/roomservice/
│           ├── controller/RoomController.java
│           ├── dto/RoomDTO.java
│           ├── entity/Room.java
│           ├── repo/RoomRepository.java
│           ├── service/
│           │   ├── impl/RoomService.java
│           │   └── MinioService.java
│           ├── interfac/IRoomService.java
│           └── RoomServiceApplication.java
│       └── resources/application.properties
│
├── redis/          # Redis config (nếu cần thêm script hoặc custom)
│
├── minio/          # Minio config (nếu cần init)
│
└── frontend/       # React Frontend (gọi qua nginx /api/)


