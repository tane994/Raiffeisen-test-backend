# Raiffeisen Note App Backend

This project is a Spring Boot-based backend for the Raiffeisen Note App, providing RESTful API endpoints for managing notes.

## Tech Stack

- Java 17
- Spring Boot 3.3.4
- Spring Data JPA
- H2 Database
- Maven
- Lombok

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.example.raiffeisen_backend
│   │       ├── note
│   │       │   ├── config
│   │       │   │   └── NoteConfig.java
│   │       │   ├── controller
│   │       │   │   └── NoteController.java
│   │       │   ├── dto
│   │       │   │   └── NoteUpdateDTO.java
│   │       │   ├── model
│   │       │   │   └── Note.java
│   │       │   ├── repository
│   │       │   │   └── NoteRepository.java
│   │       │   └── service
│   │       │       └── NoteService.java
│   │       └── RaiffeisenBackendApplication.java
│   └── resources
│       └── application.properties
└── test
    └── java
        └── com.example.raiffeisen_backend
            └── RaiffeisenBackendApplicationTests.java
```

## Setup and Installation

1. Ensure you have JDK 17 and Maven installed.
2. Clone the repository:
   ```
   git clone https://github.com/tane994/Raiffeisen-test-backend.git
   ```
3. Navigate to the project directory:
   ```
   cd Raiffeisen-test-backend
   ```
4. Build the project:
   ```
   mvn clean install
   ```

## Running the Application

1. Start the application:
   ```
   mvn spring-boot:run
   ```
2. The server will start on `http://localhost:8081`

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | /api/v1/notes | Retrieve all notes |
| POST   | /api/v1/notes | Create a new note |
| PUT    | /api/v1/notes/{id} | Update an existing note |
| DELETE | /api/v1/notes/{id} | Delete a note |


## Architecture

The Raiffeisen Note App follows a client-server architecture. Here's an overview of the system:

![Architecture - Raiffeisen Note App](https://github.com/user-attachments/assets/2f116ef5-cb8d-4416-8348-c3b9c8e0de1a)


- **Client Side**: The frontend built with React (see frontend repository).
- **API Layer**: Implemented using Spring Boot, handling HTTP requests (GET, POST, PUT, DELETE).
- **Service Layer**: Contains the business logic of the application.
- **Data Access Layer**: Uses Spring Data JPA to manage data persistence and retrieval.
- **Database**: H2 in-memory database (configurable to other databases).

This backend repository implements the API Layer, Service Layer, and Data Access Layer of the architecture.

## Database Configuration

The application uses an H2 in-memory database by default. Database settings can be found in `src/main/resources/application.properties`.

To access the H2 console:
1. Go to `http://localhost:8081/h2-console`
2. JDBC URL: `jdbc:h2:mem:notesdb`
3. User Name: `user`
4. Password: `password`

## Sample Data

The `NoteConfig` class provides sample data that's loaded when the application starts. You can modify or remove this as needed.

## Cross-Origin Resource Sharing (CORS)

CORS is configured to allow requests from `http://localhost:5173`. If your frontend runs on a different port, update the `@CrossOrigin` annotation in `NoteController.java`.

## Building for Production

To build a production-ready JAR file:

```
mvn clean package
```

The JAR will be created in the `target` directory.

## Testing

Run tests using:

```
mvn test
```
