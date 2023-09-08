# Microservice Sample Project

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Microservices](#microservices)
    - [API Gateway](#api-gateway)
    - [User Service](#user-service)
    - [Authentication Service](#authentication-service)
- [Testing](#testing)
- [Documentation](#documentation)
- [Deployment](#deployment)

## Introduction

Welcome to the Microservice Sample Project! This project serves as a foundation for building microservice-based
applications with a focus on scalability, security, and modularity. It provides essential components like API Gateway,
User Service, and Authentication Service.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- **Java Development Kit (JDK)**: Version 17 or higher.
- **Integrated Development Environment (IDE)**: We recommend using IntelliJ IDEA or Eclipse.
- **Database**: Set up a compatible database system (e.g., MySQL, PostgreSQL) for user data storage.
- **Docker**: Required for containerization and deployment.

## Project Structure

The project is organized as follows:

- `api-gateway/`: API Gateway microservice.
- `user-service/`: User Service microservice.
- `auth-service/`: Authentication Service microservice.

## Getting Started

Follow these steps to set up the development environment and run the project locally:

1. **Clone this repository:**

   ```shell
   git clone https://github.com/yourusername/microservice-sample.git
   ```

2. **Set Up Your Database**

    - Create a database schema for the microservices.
    - Configure database connection properties in the `application.yml` or `application.properties` files for each
      microservice.

3. **Run Each Microservice:**

    - Navigate to the root directory of each microservice (`api-gateway`, `user-service`, and `auth-service`).
    - Follow the instructions provided in their respective README files to start the services.

## Microservices

### API Gateway

The API Gateway is responsible for routing requests to the appropriate microservice and securing the APIs.

- **Configuration:**

  Add routing rules in the `application.yml` file.

- **Security:**

  Implement JWT token validation for security.

### User Service

The User Service manages user data, including CRUD operations for managing user information.

- **Endpoints:**

    - `/api/users`: Retrieve a list of users.
    - `/api/users/{id}`: Retrieve a specific user by ID.
    - ...

  Detailed API documentation is available in the User Service directory.

### Authentication Service

The Authentication Service handles user authentication and JWT token generation.

- **Endpoints:**

    - `/auth/login`: Authenticate a user and issue a JWT token.

  Detailed API documentation is available in the Authentication Service directory.

## Testing

To run tests for the microservices, use the following commands:

### Run tests for User Service

```shell
   cd user-service
   mvn test
   ```

### Run tests for Authentication Service

```shell
cd auth-service
mvn test
```

## Documentation

API documentation is generated using Swagger and can be accessed at http://localhost:8080/swagger-ui.html for each
microservice.

## Deployment

For deployment, we recommend using Docker Compose to orchestrate the microservices and any required dependencies. A
sample Docker Compose configuration file is provided in the project.

To deploy the entire application, run:

````shell
docker-compose up
````

For production deployment, consider using container orchestration platforms like Kubernetes.
