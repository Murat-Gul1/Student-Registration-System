## Student Management Console Application

A simple Java-based console application for managing student records. This project demonstrates object-oriented design, input validation, and interactive menu-driven user interface, with Git integration for version control.

### Features

- **Add Student**: Create a new student with automatic unique ID assignment.
- **Remove Student by ID**: Delete a student record using its ID.
- **Update Student by ID**: Choose a specific field (First Name, Last Name, or Grade) to update for an existing student.
- **Find Student by ID**: Retrieve and display a student's details by ID.
- **Sort by Grade**: Order students by grade, both descending (high → low) and ascending (low → high).
- **Filter by Grade Range**: List students whose grades fall within a specified range.
- **List All Students**: Display all student records in the system.
- **Exit**: Quit the application gracefully.

### Prerequisites

- **Java JDK 8** or higher installed
- **Git** (for cloning and version control)
- An IDE such as **NetBeans**, **Eclipse**, or **IntelliJ IDEA** (optional)

### Getting Started

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd <repository-folder>
   ```

2. **Compile the source files**
   ```bash
   javac -d out src/**/*.java
   ```

3. **Run the application**
   ```bash
   java -cp out Main
   ```

   The interactive menu will appear in the console.

### Project Structure

```
src/
├── Main.java           # Entry point and menu logic
├── Student.java        # Student model with validation and auto-ID
├── StudentManager.java # CRUD operations on student list
└── StudentUtils.java   # Utility methods for sorting, filtering, printing
```

### Usage Example

```
===== Student Management Menu =====
1. Add Student
2. Remove Student by ID
3. Update Student by ID
4. Find Student by ID
5. Sort by Grade (High → Low)
6. Sort by Grade (Low → High)
7. Filter by Grade Range
8. List All Students
9. Exit
Select an option (1-9): 1
First Name: Alice
Last Name: Johnson
Grade (0-100): 85
✅ Student added: Id =240, First Name = 'Alice', Last Name = 'Johnson', Grade = 85.0
```

### Next Steps

- Add persistence (e.g., save to file or database)
- Implement a graphical user interface
- Extend validation rules (e.g., email, phone number)
- Include UML class diagram (`docs/UML.png`)

---

*This project has been developed in a solo setting with Git for version control. Feel free to contribute or adapt it for your educational purposes.*

