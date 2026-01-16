# fullstack-cafe-management-system

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.9-green)

A full-stack cafe management system built with Spring Boot, React, MySQL, and FastAPI for learning purposes.
This project demonstrates a full-stack workflow including backend API development, database integration, and frontend UI.


## Tech Stack
- Backend: Java Spring Boot
- Frontend: React
- Database: MySQL
- Microservice: FastAPI
- Tools: VS Code, GitHub, Gradle, REST Client

## Features (MVP)
- Menu management (Add, Update, Delete, View items)
- Order management (Create orders, view order history)
- RESTful APIs for backend communication
- Simple React UI for cafe operations
- Health check API to verify backend

## Project Structure
fullstack-cafe-management-system/
│
├── backend-springboot/ # Spring Boot backend
│ ├── src/
│ │ └── main/java/com/cafe/backend/
│ │ ├── controller/ # REST API controllers
│ │ ├── model/ # Entities (Menu, Orders, etc.)
│ │ └── BackendApplication.java
│ └── build.gradle.kts # Gradle build file
│
├── frontend-react/ # React frontend (to be added)
├── backend-fastapi/ # FastAPI microservice (Python)
├── database/ # SQL scripts and sample data
├── .vscode/ # Project-specific VS Code settings
│ └── settings.json # Java auto-build + format on save
├── README.md # Project documentation
└── LICENSE # MIT license

## Getting Started

### Prerequisites
- Java 21
- Node.js & npm
- MySQL
- VS Code

### Run Backend
1. Open VS Code terminal in `backend-springboot/backend`
2. Run:
    ./gradlew bootRun   # On Windows: .\gradlew.bat bootRun
3. Open browser:
    http://localhost:8080/health
