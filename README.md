# Employee Management System

## Project Overview
The Employee Management System is a Java application developed using the Maven build tool.
It provides functionalities to manage employees, including adding, updating, deleting, and viewing employee details.

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup](#setup)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Features
- Add new employees
- Update existing employee details
- Delete employees
- View all employees
- Search employees by ID or name

## Technologies Used
- Java
- Maven
- JDBC
- MySQL (or any other database)

## Setup
### Prerequisites
- JDK 11 or higher
- Maven
- MySQL (or any other database)

### Database Setup
1. Install MySQL and create a database named `employee_management`.
2. Execute the following SQL script to create the `employees` table:

```sql
CREATE DATABASE employee_management;

USE employee_management;

CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    salary DECIMAL(10, 2) NOT NULL
);

### Project Setup
1. Clone the repository:
  ```git clone https://github.com/your-username/employee-management-system.git
cd employee-management-system ```

2. Configure the database connection in `src/main/resources/db.properties`:
  ```db.url=jdbc:mysql://localhost:3306/employee_management
db.username=root
db.password=your_password ```

3. Build the project using Maven:
  ```mvn clean install ```

## Usage
1. Run the application:
  ```mvn exec:java -Dexec.mainClass="com.example.employeemanagement.Main" ```

2. Follow the on-screen instructions to manage employees.
  **Project Structure**
  employee-management-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── employeemanagement/
│   │   │               ├── Main.java
│   │   │               ├── model/
│   │   │               │   └── Employee.java
│   │   │               ├── dao/
│   │   │               │   └── EmployeeDao.java
│   │   │               ├── service/
│   │   │               │   └── EmployeeService.java
│   │   │               └── util/
│   │   │                   └── DatabaseUtil.java
│   │   └── resources/
│   │       └── db.properties
│   └── test/
│       ├── java/
│       └── resources/
├── .gitignore
├── README.md
├── pom.xml
└── LICENSE


## Contributing
  If you want to contribute, please fork the repository and use a feature branch. Pull requests are warmly welcome.
## License
  This project is licensed under the MIT License - see the LICENSE file for details.


### Example `pom.xml`

Here is a basic example of what your `pom.xml` might look like:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>employee-management-system</artifactId>
    <version>1.0-SNAPSHOT</version>
    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>
    <dependencies>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.26</version>
        </dependency>
        <dependency>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.8.1</version>
        </dependency>
        <dependency>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-exec-plugin</artifactId>
            <version>1.6.0</version>
        </dependency>
    </dependencies>
</project>
