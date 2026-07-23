# Venus Cafe Management System

## Project Overview
Venus Cafe Management System is a full-stack application for managing cafe operations including authentication, menu management, customers, dining tables, orders, payments, and reporting. The backend is built with Java 21, Spring Boot 3, Spring Security, JWT, JPA, and MySQL. The frontend is built with React, Vite, React Router, Axios, and Context API.

## Features
- Authentication with JWT and BCrypt
- Role-based access for Admin, Manager, and Cashier
- Category and menu management
- Customer management
- Table status management
- Order creation with multiple items
- Payment processing for Cash, Card, and QR Payment
- Dashboard and sales overview

## Technology Stack
- Backend: Java 21, Spring Boot 3.3, Spring Data JPA, Spring Security, Lombok, MySQL
- Frontend: React 18, Vite, React Router, Axios, CSS

## Installation Guide
1. Install Java 21 and Node.js 20+
2. Create a MySQL database named `cafe_management`
3. Update credentials in `backend/src/main/resources/application.properties`
4. Run backend:
   - `cd backend`
   - `./gradlew.bat bootRun`
5. Run frontend:
   - `cd frontend`
   - `npm install`
   - `npm run dev`

## Database Setup
- MySQL connection is configured in the backend properties file.
- Hibernate will create/update the schema automatically.

## Backend Setup
The backend exposes REST endpoints under `/api`.

## Frontend Setup
The frontend uses Vite and communicates with the backend through `/api`.

## Running Instructions
- Backend: http://localhost:8080
- Frontend: http://localhost:3000

## API Documentation
See [docs/api.md](docs/api.md) for endpoint details.

## Run Guide
See [docs/run-guide.md](docs/run-guide.md) for step-by-step startup instructions.

## Future Improvements
- Add invoice PDF export
- Add reporting charts
- Add audit logs
- Add image upload to object storage
