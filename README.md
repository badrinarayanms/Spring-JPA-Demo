# 📘 Spring JPA Demo

This is a simple Spring Boot application demonstrating how to use **Spring Data JPA** to interact with a database.  
There are no REST endpoints — all operations happen in the `main()` method.

---

## 🔧 What it Does

- Creates a `Student` object
- Sets its properties (`name`, `rollno`)
- Uses `StudentRepo` to:
  - Delete a student by ID
  - (Optionally) Save a student to the database

---

## 💡 Technologies Used

- Spring Boot
- Spring Data JPA
- PostgreSQL (or any JPA-supported database)
- Java

---

## ⚙️ Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/your-username/spring-jpa-demo.git
cd spring-jpa-demo
```
## 2. Configure application.properties
```
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
