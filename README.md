
# Employee Management

## Overview
The Employee Management System is a web application built using Java, Spring Boot, MongoDB and Thymeleaf. This application allows for the management of employee information including creating, reading, updating, and deleting employee records. 

## Table of Contents
+ Introduction
+ Features
+ Technologies Used
+ Prerequisites
+ Installation
+ Usage
+ FrontEnd
+ Acknowledgements

### Introduction
The Employee Management System is a web application that provides an interface to manage employee data. It uses Spring Boot for the backend, Thymeleaf for the frontend, and MongoDB as the database.

### Features
+ **Add Employee**: Register a new employee with details like Employee ID, Name, Email, Job Location, Department, and Address.
+ **View Employees**: Display all registered employees in a tabular format.
+ **Update Employee**: Edit existing employee details.
+ **Delete Employee**: Remove an employee from the system.
+ **Search Employee**: Find employees by their Employee ID.
+ **Responsive Frontend**: User-friendly and responsive UI built with Thymeleaf.

### Technologies Used
+ backend
  - Spring Boot
  - Lombok
+ Frontend
  - Thymeleaf
+ Database 
  - MongoDB  
+ Build Tool 
  - Maven    

### Prerequisites
+ Java 17
+ Maven
+ MongoDB Atlas or local MongoDB instance

### Installation
1. Clone the repository:

git clone:

 `https://github.com/your-username/Employee-Management.git`

2. Configure MongoDB: 
Update the MongoDB URI in **application.yml**:
```
spring:
  data:
    mongodb:
      uri: "your-mongodb-uri"
```
3. Build and Run the application:
```
mvn clean install
mvn spring-boot:run
```

### Usage
+ **Access the application**: 
  
  Open your browser and go to `http://localhost:8080`.

+ **Home Page**: 
  
  You will see options to add staff, display staff details, and search for staff by ID.
+ **Add Staff**: 
  
  Fill in the form to register a new employee.
+ **Display Staff Details**: 
  
  View the list of all employees with options to update or delete each entry.
+ **Search**: 
  
  Enter an Employee ID to find specific employee details.

## FrontEnd
To see the FrontEnd part I have shared the screenshots as well.

### Acknowledgements
***Special thanks to the Spring Boot, Thymeleaf, and MongoDB communities for their excellent documentation and support.***

---
Happy Coding!