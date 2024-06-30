# API to Manage Tasks (CRUD)

API to manage tasks (CRUD)

## Technologies

- Spring Boot
- Spring MVC
- Spring Data JPA
- SpringDoc OpenAPI 3
- MySQL

## Adopted Practices

- SOLID, DRY, YAGNI, KISS
- REST API
- Queries with Spring Data JPA
- Dependency Injection
- Error response handling
- Automatic Swagger generation with OpenAPI 3

## How to Run

1. Clone the git repository
2. Build the project:

   ```bash
   $ ./mvnw clean package

   ```

3. Run the application:
   ```bash
   $ java -jar target/todolist-0.0.1-SNAPSHOT.jar
   ```

The API can be accessed at `localhost:8080`. Swagger can be viewed at `localhost:8080/swagger-ui.html`.
