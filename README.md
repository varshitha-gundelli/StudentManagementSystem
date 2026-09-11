# 🎓 Student Management System

A **console-based Student Management System developed in Java** to demonstrate core **Object-Oriented Programming (OOP)** concepts through a modular and maintainable application structure.

The project manages student information and demonstrates concepts such as **encapsulation, abstraction, inheritance, polymorphism, interfaces, method overloading, method overriding, composition, association, custom exception handling, static members, and inner classes**.

---

## 📌 Project Overview

The **Student Management System** is a Java console application designed to manage student-related information while demonstrating practical implementation of Object-Oriented Programming principles.

The application supports operations such as:

* Adding student records
* Updating student information
* Deleting student records
* Fetching student details
* Managing graduate student information
* Tracking student count
* Managing sports activities
* Managing cultural activities
* Handling invalid student data using custom exceptions

The project follows a **package-based architecture** to improve code organization, readability, maintainability, and separation of responsibilities.

---

## 🎯 Objectives

The main objectives of this project are to:

* Develop a structured console-based application using Java.
* Demonstrate practical implementation of core OOP principles.
* Implement inheritance and multilevel inheritance.
* Demonstrate compile-time and runtime polymorphism.
* Use interfaces to define common operations.
* Implement abstraction using abstract classes.
* Demonstrate composition and association between classes.
* Implement custom exception handling.
* Demonstrate method overloading and method overriding.
* Use static members and static initialization blocks.
* Organize Java classes using meaningful packages.
* Develop clean and maintainable object-oriented code.

---

## ✨ Features

### 👨‍🎓 Student Management

* Add student records
* Update student information
* Delete student records
* Fetch student details
* Track total student count

### 🎓 Graduate Student Management

* Extend the base Student functionality
* Support additional graduate student behavior
* Demonstrate multilevel inheritance

### 🏅 Student Activities

* Sports activity participation
* Cultural activity participation
* Interface-based activity management

### 🛡️ Exception Handling

* Custom `InvalidStudentDataException`
* Validation of invalid student data
* Structured exception handling using `try-catch`

### 🧩 OOP Demonstrations

The project intentionally demonstrates multiple Java OOP concepts through practical classes and interfaces.

---

## 🧠 OOP Concepts Implemented

| OOP Concept                           | Implementation in Project                                      |
| ------------------------------------- | -------------------------------------------------------------- |
| **Encapsulation**                     | Private fields with getters and setters                        |
| **Abstraction**                       | `Person` abstract class                                        |
| **Inheritance**                       | `Student` extends `Person`                                     |
| **Multilevel Inheritance**            | `GraduateStudent → Student → Person`                           |
| **Polymorphism**                      | Student and GraduateStudent objects                            |
| **Interfaces**                        | `DatabaseOperations`, `SportsActivities`, `CulturalActivities` |
| **Multiple Interface Implementation** | `GraduateStudent` implements multiple interfaces               |
| **Method Overloading**                | Multiple `insert()` methods                                    |
| **Method Overriding**                 | Overridden `getDetails()` method                               |
| **Composition**                       | `Student` contains an `Address` object                         |
| **Association**                       | Classes interact through object relationships                  |
| **Inner Class**                       | `Marks` class inside `Student`                                 |
| **Copy Constructor**                  | `Student(Student s)`                                           |
| **Static Block**                      | Static initialization in `Person`                              |
| **Static Method**                     | `getStudentCount()`                                            |
| **Final Keyword**                     | `COLLEGE_NAME` constant                                        |
| **Exception Handling**                | `try-catch` mechanism                                          |
| **Custom Exception**                  | `InvalidStudentDataException`                                  |
| **Default Interface Method**          | `log()` method                                                 |

---

## 🏗️ Project Architecture

The application follows a simple layered structure:

```text
                         MainApp
                            |
                            v
                    StudentManager
                            |
             +--------------+--------------+
             |              |              |
             v              v              v
          Student    GraduateStudent   Exception
             |
             v
          Person
             |
             v
          Address
```

### Package Responsibilities

| Package      | Responsibility                           |
| ------------ | ---------------------------------------- |
| `app`        | Application entry point                  |
| `model`      | Core domain classes                      |
| `service`    | Student management operations            |
| `interfaces` | Common contracts and activity operations |
| `exception`  | Custom exception classes                 |

---

## 📂 Project Structure

```text
StudentManagementSystem/
│
├── README.md
├── .gitignore
│
├── docs/
│   ├── Project_Overview.md
│   ├── Project_Documentation.md
│   └── Viva_Questions.md
│
└── src/
    └── studentmanagement/
        │
        ├── app/
        │   └── MainApp.java
        │
        ├── exception/
        │   └── InvalidStudentDataException.java
        │
        ├── interfaces/
        │   ├── DatabaseOperations.java
        │   ├── SportsActivities.java
        │   └── CulturalActivities.java
        │
        ├── model/
        │   ├── Address.java
        │   ├── Person.java
        │   ├── Student.java
        │   └── GraduateStudent.java
        │
        └── service/
            └── StudentManager.java
```

---

## 🛠️ Technologies Used

| Technology                      | Purpose                 |
| ------------------------------- | ----------------------- |
| **Java**                        | Application development |
| **Object-Oriented Programming** | Application design      |
| **Eclipse IDE**                 | Development environment |
| **Git**                         | Version control         |
| **GitHub**                      | Source code hosting     |

---

## ⚙️ Prerequisites

Before running the project, make sure you have:

* Java Development Kit (JDK)
* Eclipse IDE
* Git

You can verify Java installation using:

```bash
java -version
```

and:

```bash
javac -version
```

---

## ▶️ How to Run

### Option 1 — Run using Eclipse

1. Clone the repository.

```bash
git clone https://github.com/varshitha-gundelli/StudentManagementSystem.git
```

2. Open **Eclipse IDE**.

3. Import the project as an **Existing Java Project**.

4. Navigate to:

```text
src
└── studentmanagement
    └── app
        └── MainApp.java
```

5. Open `MainApp.java`.

6. Right-click the file.

7. Select:

```text
Run As → Java Application
```

8. View the application output in the Eclipse Console.

---

## 💻 Example Application Flow

```text
=========================================
       STUDENT MANAGEMENT SYSTEM
=========================================

Student Management
------------------
Insert Student
Update Student
Delete Student
Fetch Student

Graduate Student
----------------
Sports Activities
Cultural Activities

Student Count
Exception Handling
```

> The exact console output may vary depending on the current implementation of `MainApp.java`.

---

## 💾 Database

The current version of the project **does not use a physical database**.

The `DatabaseOperations` interface is used to demonstrate abstraction and define operations such as:

* Insert
* Update
* Delete
* Fetch

The interface provides a structure that can be extended in the future to support database connectivity.

---

## 🛡️ Exception Handling

The project includes a custom exception:

```text
InvalidStudentDataException
```

This exception is used to handle invalid student-related data.

Example:

```java
try {
    // Student operation
} catch (InvalidStudentDataException e) {
    System.out.println(e.getMessage());
}
```

This demonstrates how custom exceptions can be used to make application-level error handling clearer and more structured.

---

## 📚 Documentation

Additional project documentation is available in the `docs` directory.

### Documentation Files

* [Project Overview](docs/Project_Overview.md)
* [Project Documentation](docs/Project_Documentation.md)
* [Viva Questions and Answers](docs/Viva_Questions.md)

These documents provide additional information about the project architecture, implementation, OOP concepts, and interview/viva preparation.

---

## 🔮 Future Enhancements

The following features can be added in future versions:

* [ ] Student search functionality
* [ ] Improved input validation
* [ ] Persistent student records
* [ ] MySQL database connectivity
* [ ] JDBC integration
* [ ] GUI interface
* [ ] Authentication and authorization
* [ ] Student report generation
* [ ] Unit testing using JUnit
* [ ] Improved logging
* [ ] Export student reports

---

## 🎓 Learning Outcomes

Through this project, the following concepts were practiced:

* Java programming fundamentals
* Object-Oriented Programming
* Class design
* Inheritance
* Abstraction
* Encapsulation
* Polymorphism
* Interfaces
* Method overloading
* Method overriding
* Composition
* Association
* Exception handling
* Custom exceptions
* Static members
* Inner classes
* Package organization
* Git and GitHub

---

## 🚀 Future Project Improvements

The project can be evolved into a complete application using:

```text
Current Version
      |
      v
Java Console Application
      |
      v
JDBC
      |
      v
MySQL Database
      |
      v
REST API / Spring Boot
      |
      v
Web or Desktop Interface
```

This would allow the current OOP-focused project to evolve into a more complete software application while preserving its existing Java foundation.

---

## 👩‍💻 Author

**Varshitha Gundelli**

B.Tech – Computer Science Engineering

GitHub: [@varshitha-gundelli](https://github.com/varshitha-gundelli)

---

## ⭐ Project Status

**Status:** Completed — OOP-focused academic project

The current version focuses primarily on demonstrating Java Object-Oriented Programming concepts through a console-based Student Management System.
