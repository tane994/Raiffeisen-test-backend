# # Raiffeisen Note App Backend

This project is a Spring Boot-based backend for a note-taking application. It provides RESTful API endpoints for creating, reading, updating, and deleting notes.

## Prerequisites

Before you begin, ensure you have met the following requirements:

* You have installed Java Development Kit (JDK) 11 or later
* You have installed Maven
* You have a Windows/Linux/Mac machine

## Installing Raiffeisen Note App Backend

To install the Raiffeisen Note App Backend, follow these steps:

1. Clone the repository:
   ```
   git clone https://github.com/tane994/Raiffeisen-test-backend.git
   ```
2. Navigate to the project directory:
   ```
   cd Raiffeisen-test-backend
   ```
3. Build the project:
   ```
   mvn clean install
   ```

## Using Raiffeisen Note App Backend

To use the Raiffeisen Note App Backend, follow these steps:

1. Start the application:
   ```
   mvn spring-boot:run
   ```
2. The server will start running on `http://localhost:8081`

## API Endpoints

* GET `/api/v1/notes`: Retrieve all notes
* POST `/api/v1/notes`: Create a new note
* PUT `/api/v1/notes/{id}`: Update an existing note
* DELETE `/api/v1/notes/{id}`: Delete a note

## Architecture

The Raiffeisen Note App follows a client-server architecture. Here's an overview of the system:

![Architecture - Raiffeisen Note App](https://github.com/user-attachments/assets/2f116ef5-cb8d-4416-8348-c3b9c8e0de1a)


- **Client Side**: The frontend built with React (see frontend repository).
- **API Layer**: Implemented using Spring Boot, handling HTTP requests (GET, POST, PUT, DELETE).
- **Service Layer**: Contains the business logic of the application.
- **Data Access Layer**: Uses Spring Data JPA to manage data persistence and retrieval.
- **Database**: H2 in-memory database (configurable to other databases).

This backend repository implements the API Layer, Service Layer, and Data Access Layer of the architecture.

## Database

This project uses an H2 in-memory database by default. If you want to use a different database, update the `application.properties` file with your database configuration.
