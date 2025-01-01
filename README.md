# Student Management System (Spring Boot)

This is a simple **Student Management System** built with **Spring Boot**. The system provides **CRUD (Create, Read, Update, Delete)** operations for managing student records such as name, roll number, class, and marks. The application uses a **MySQL** database and can be tested using **Postman**.

## Features
- **Create**: Add a new student record.
- **Read**: Retrieve all students or search for a student by ID.
- **Update**: Update the details of an existing student.
- **Delete**: Delete a student record.
  
## Technologies Used
- **Backend**: Spring Boot
- **Database**: MySQL (configured in `application.properties`)
- **API Testing**: Postman

## Endpoints

- **POST** `/students` - Add a new student.
    - **Request Body**:  
    ```json
    {
        "id": 001,
        "name": "John Doe",
        "email": "john@gmail.com",
        "course": "Dsa",
        "fee": 30000
    }
    ```
    - **Response**: Student object with `id` assigned.

- **GET** `/students` - Get all students (with pagination).
    - **Response**: List of students in JSON format.

- **GET** `/students/{id}` - Get a student by ID.
    - **Response**: Student object.

- **PUT** `/students/{id}` - Update a student’s details.
    - **Request Body**:  
    ```json
    {
        "id" : 001,   
        "name": "John Doe Updated",
        "email": "john@gmail.com",
        "course": "java"
        "fee": 20000
    }
    ```
    - **Response**: Updated student object.

- **DELETE** `/students/{id}` - Delete a student by ID.
    - **Response**: Success message or error.

## Database Configuration
Make sure to configure the database in `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=1q2w3e4r
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
