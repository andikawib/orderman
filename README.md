# Order Management Web Application

## 📌 Project Overview
This project is a small order management web application designed to handle the core lifecycle of customer orders. It allows users to:
* Create an order
* Update an order
* View order details
* List orders with pagination
* Cancel an order

## 🛠️ Tech Stack
* **Backend:** Java with Spring Boot
* **Frontend:** VueJS (Embedded in static resources)
* **Database:** In-memory H2 database

## 🚀 Setup and Execution
Both the backend and frontend are configured to run locally on a single port for ease of evaluation.

1. **Build and Run:** Open a terminal in the project root and run:
   ```bash
   ./mvnw spring-boot:run

2. **Access the Application:**
    * **Main UI:** http://localhost:8080
    * **API Documentation (Swagger):** http://localhost:8080/swagger-ui.html
    * **Database Console:** http://localhost:8080/h2-console
        * **JDBC URL:** jdbc:h2:mem:orderdb
        * **User:** sa | **Password:** password

## 🏗️ Architecture & Structure
This project prioritizes clarity and structure over completeness:
* **Controller:** Handles REST API endpoints and request mapping.
* **Service:** Manages business logic and order state transitions.
* **Entity:** JPA models for in-memory data persistence.
* **Global Exception Handler:** Centralized management of application errors.

## ⚖️ Trade-offs and Decisions
To remain within the 3–5 hour time limit, the following decisions were made:
* **Static Frontend:** The VueJS frontend is served from static resources to simplify local execution without a separate Node.js setup.
* **In-Memory Storage:** H2 was chosen for zero-configuration setup and to meet the requirement for simple file or in-memory storage.
* **Data Models:** JPA Entities were used directly in controllers to maximize development speed while maintaining a clean package structure.

## 📈 Future Improvements
Given more time, the following improvements would be implemented:
* Add Unit and Integration tests.
* Implement DTOs (Data Transfer Objects) for better abstraction between layers.
* Add Input Validation and Spring Security for role-based access.