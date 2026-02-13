# Student Utility App

## Description

A simple Java console application that provides various utility functions through an interactive menu system. The app allows users to perform basic mathematical operations, check number properties, print number ranges, and display days of the week.

## Features

- **Add Two Numbers**: Calculate the sum of two numbers
- **Even/Odd Checker**: Determine if a number is even or odd
- **Number Range Printer**: Print all numbers within a specified range
- **Day of the Week**: Display the day name for a number (1-7)
- **Exit**: Close the application

## How to Run the Program

### Prerequisites

- Java Development Kit (JDK) 14 or higher installed on your system

### Compilation

1. Navigate to the project directory:

   ```bash
   cd java-week1-student-utility-app
   ```

2. Compile the Java file:
   ```bash
   javac src/StudentUtilityApp.java
   ```

### Execution

Run the compiled program:

```bash
java -cp src StudentUtilityApp
```

Alternatively, if you're using an IDE like IntelliJ IDEA, simply open the project and run the `StudentUtilityApp` class.

## Sample Output

```
========== STUDENT UTILITY APP ===========


What would you like to do?

    1. Add two numbers.
    2. Check if a number is EVEN or ODD.
    3. Print numbers from 1 to N.
    4. Display day of the week.
    5. Exit.

 Input? 1
Enter two numbers separated by a space
? 15 25

The sum of 15 and 25 is 40

Choose options:
    1. Add two numbers.
    2. Check if a number is EVEN or ODD.
    3. Print numbers from 1 to N.
    4. Display day of the week.
    5. Exit.

 Input? 2
Enter a number? 7

7 is an ODD number.

Choose options:
    1. Add two numbers.
    2. Check if a number is EVEN or ODD.
    3. Print numbers from 1 to N.
    4. Display day of the week.
    5. Exit.

 Input? 3
Enter two numbers separated by a space
? 1 5

1, 2, 3, 4, 5

Choose options:
    1. Add two numbers.
    2. Check if a number is EVEN or ODD.
    3. Print numbers from 1 to N.
    4. Display day of the week.
    5. Exit.

 Input? 4
Please enter a number between 1 - 7
3

Wednesday

Choose options:
    1. Add two numbers.
    2. Check if a number is EVEN or ODD.
    3. Print numbers from 1 to N.
    4. Display day of the week.
    5. Exit.

 Input? 5

Thank you for using the app.
```

## Author

Pascal Torti (Birdmannn)
