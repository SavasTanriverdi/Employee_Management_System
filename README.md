# Employee_Management_System

This project is a simple Employee Management System designed to demonstrate Object-Oriented Programming (OOP) principles like inheritance and method overriding. The system includes a base class `Employee` and two subclasses, `Manager` and `Developer`, with additional attributes and behaviors.

---

## Features
- **Base Class: Employee**:
    - Contains common attributes like name, ID, and department.
    - Provides methods to display basic employee details and simulate work.
- **Manager Subclass**:
    - Adds a team size attribute and a `conductMeeting()` method.
    - Overrides the `displayInfo()` method to include team size.
- **Developer Subclass**:
    - Adds a programming language attribute and a `writeCode()` method.
    - Overrides the `displayInfo()` method to include programming language.

---

## Code Overview

### 1. `Employee` Class
- **Attributes**:
    - `name`: Name of the employee.
    - `id`: Employee ID.
    - `department`: Department where the employee works.
- **Methods**:
    - `displayInfo()`: Displays employee details.
    - `work()`: Simulates employee working.

### 2. `Manager` Class
- Inherits from `Employee`.
- **Attributes**:
    - `teamSize`: Number of members in the manager's team.
- **Additional Methods**:
    - `conductMeeting()`: Simulates a manager conducting a team meeting.
- **Overridden Methods**:
    - `displayInfo()`: Displays additional team size information.

### 3. `Developer` Class
- Inherits from `Employee`.
- **Attributes**:
    - `programmingLanguage`: The primary programming language of the developer.
- **Additional Methods**:
    - `writeCode()`: Simulates a developer writing code.
- **Overridden Methods**:
    - `displayInfo()`: Displays additional programming language information.

---

## How to Run

1. Clone the repository or download the project files.
2. Open the project in an IDE such as **IntelliJ IDEA** or **Eclipse**.
3. Compile and run the `EmployeeManagementSystem.java` file.

---

## Sample Output

```plaintext
Manager Details:
Name: Alice
ID: 101
Department: Operations
Team Size: 5
Manager is conducting a meeting for a team of 5 members.

Developer Details:
Name: Bob
ID: 102
Department: Development
Programming Language: Java
Developer is writing code in Java.
