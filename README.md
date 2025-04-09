# My First AI Project

A Spring Boot 3 POC project demonstrating Java 17 features and best practices.

## Technology Stack

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- Spring Security
- Swagger/OpenAPI
- Thymeleaf
- Lombok
- JUnit 5 Jupiter

## High Level Design

### Architecture Overview

This application follows a layered architecture pattern with the following components:

1. **Presentation Layer (REST Controllers)**
   - Handles HTTP requests and responses
   - Uses DTOs for data transfer
   - Implements global exception handling

2. **Service Layer**
   - Contains business logic
   - Implements transaction management
   - Performs data transformations

3. **Data Access Layer**
   - Manages database operations through repositories
   - Implements JPA entities
   - Handles data persistence

### Design Principles

- SOLID Principles
- DRY (Don't Repeat Yourself)
- KISS (Keep It Simple, Stupid)
- YAGNI (You Ain't Gonna Need It)
- OWASP Security Best Practices

## Project Structure

```
com.bounteous/
├── config/         # Configuration classes
├── controller/     # REST Controllers
├── dto/           # Data Transfer Objects
├── entity/        # JPA Entities
├── repository/    # Data Access Layer
├── service/       # Business Logic Layer
│   └── impl/     # Service Implementations
└── exception/     # Custom Exceptions
```

## API Documentation

### Response Format

All API responses follow a standard format:

```json
{
  "result": "SUCCESS/ERROR",
  "message": "Description of the result",
  "data": {
    // Response payload (if any)
  }
}
```

### HTTP Status Codes

- 200: Success
- 201: Created
- 400: Bad Request
- 401: Unauthorized
- 403: Forbidden
- 404: Not Found
- 500: Internal Server Error

## Getting Started

### Prerequisites

- JDK 17
- Gradle 8.x
- Your favorite IDE (IntelliJ IDEA recommended)

### Building the Project

```bash
./gradlew clean build
```

### Running the Application

```bash
./gradlew bootRun
```

The application will start on `http://localhost:8080`

## Testing

Run the tests using:

```bash
./gradlew test
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.