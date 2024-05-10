---

## CNP Validator and Age Calculator

This Java application allows users to input multiple names and corresponding CNPs (Personal Numerical Codes), verifies the validity of the CNPs, and calculates the age of each person based on their CNP.

### CNP Validation

The CNP validation process checks whether the provided CNP:
- Has 13 digits.
- Consists only of numerical digits.
- Starts with specific digits (1, 2, 5, or 6) according to Romanian CNP standards.
- Has a valid last digit calculated using a predefined algorithm.

### Age Calculation

The age of each person is calculated based on their CNP. The application extracts the birthdate from the CNP and calculates the age by comparing it to the current date.

### Usage

1. Run the program.
2. Enter the number of people you want to add.
3. For each person, enter their name and CNP.
4. The program validates the CNP. If the CNP is invalid, it prompts for re-entry.
5. After inputting all data, the program displays each person's name, CNP, and calculated age.

### Input Format

- For each person, enter their name followed by their CNP.

### Output Format

- The program displays each person's name, CNP, and age in years.

### Requirements

- Java Development Kit (JDK) installed on your system.

### How to Run

1. Open Command Prompt (Windows) or Terminal (Mac/Linux).
2. Navigate to the directory containing your Java files (`MainApp.java` and `Person.java`).
3. Compile the Java files using the following command:
   ```
   javac MainApp.java Person.java
   ```
4. Once compiled successfully, run the program using the following command:
   ```
   java MainApp
   ```
5. Follow the on-screen instructions to input names and CNPs for each person.

---
