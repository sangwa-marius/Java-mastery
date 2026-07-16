# Lesson 14 - Multidimensional Arrays (Notes)

## Lesson Objectives

By the end of this lesson, you should be able to:

- Understand what multidimensional arrays are.
- Create and initialize 2D arrays.
- Access elements using row and column indexes.
- Traverse multidimensional arrays using nested loops.
- Read user input into 2D arrays.
- Pass multidimensional arrays to methods.
- Work with jagged (irregular) arrays.
- Apply multidimensional arrays in real-world programs.

---

# What is a Multidimensional Array?

A multidimensional array is an array whose elements are themselves arrays.

The most common multidimensional array is the **2D array**, which stores data in rows and columns, just like a spreadsheet.

Example:

```text
        Columns

          0    1    2

Row 0    80   90   75
Row 1    65   88   70
Row 2    95   91   89
```

Declaration:

```java
int[][] marks;
```

---

# Creating a 2D Array

```java
int[][] marks = new int[3][4];
```

This creates:

- 3 rows
- 4 columns

Visual:

```text
[ ][ ][ ][ ]
[ ][ ][ ][ ]
[ ][ ][ ][ ]
```

---

# Initializing a 2D Array

```java
int[][] marks = {
    {80, 90, 75},
    {65, 88, 70},
    {95, 91, 89}
};
```

---

# Accessing Elements

Syntax:

```java
array[row][column]
```

Example:

```java
System.out.println(marks[0][1]);
```

Output:

```text
90
```

---

# Modifying Elements

```java
marks[2][1] = 100;
```

---

# Array Length

Number of rows:

```java
marks.length
```

Number of columns in a row:

```java
marks[row].length
```

Example:

```java
System.out.println(marks.length);      // Rows
System.out.println(marks[0].length);   // Columns
```

---

# Traversing a 2D Array

Using nested loops:

```java
for (int row = 0; row < marks.length; row++) {

    for (int column = 0; column < marks[row].length; column++) {

        System.out.print(marks[row][column] + "\t");

    }

    System.out.println();

}
```

---

# Enhanced for Loop

```java
for (int[] row : marks) {

    for (int mark : row) {

        System.out.print(mark + " ");

    }

    System.out.println();

}
```

Use this when you only need to read values.

---

# Reading Values into a 2D Array

```java
Scanner input = new Scanner(System.in);

for (int row = 0; row < marks.length; row++) {

    for (int column = 0; column < marks[row].length; column++) {

        System.out.print("Enter mark: ");

        marks[row][column] = input.nextInt();

    }

}
```

---

# Passing a 2D Array to a Method

```java
public static void printMatrix(int[][] matrix) {

    // Process matrix

}
```

Method call:

```java
printMatrix(marks);
```

---

# Returning Arrays

Example:

```java
public static double[] calculateTotals(double[][] marks) {

    double[] totals = new double[marks.length];

    // Calculate totals

    return totals;

}
```

---

# Jagged Arrays

A jagged array is a 2D array where each row can have a different number of columns.

Example:

```java
int[][] marks = {
    {80, 90, 75},
    {65, 88},
    {95, 91, 89, 100}
};
```

Visual:

```text
80 90 75
65 88
95 91 89 100
```

---

# Creating a Jagged Array

```java
int[][] marks = new int[3][];
```

Initialize each row separately:

```java
marks[0] = new int[3];
marks[1] = new int[2];
marks[2] = new int[4];
```

---

# Why Use `marks[row].length`?

Correct:

```java
marks[row].length
```

Incorrect:

```java
marks[0].length
```

Using `marks[row].length` ensures your program works for both rectangular and jagged arrays.

---

# Common Applications

Multidimensional arrays are commonly used for:

- Student marks
- Seating arrangements
- Game boards (Chess, Tic-Tac-Toe)
- Spreadsheets
- Images (pixels)
- Matrices
- Timetables
- Inventory tables

---

# Common Mistakes

## 1. Mixing Rows and Columns

Incorrect:

```java
marks[column][row]
```

Correct:

```java
marks[row][column]
```

---

## 2. Wrong Loop Limits

Incorrect:

```java
for (int column = 0; column < marks.length; column++)
```

Correct:

```java
for (int column = 0; column < marks[row].length; column++)
```

---

## 3. Forgetting Nested Loops

A single loop cannot visit every element of a 2D array.

Always use nested loops (or nested enhanced for loops).

---

## 4. Array Index Out of Bounds

Remember that indexing starts at **0**.

For a 3 × 3 array:

```text
Rows:    0 - 2
Columns: 0 - 2
```

---

## 5. NullPointerException in Jagged Arrays

Incorrect:

```java
int[][] marks = new int[3][];

marks[0][0] = 80;
```

Correct:

```java
marks[0] = new int[3];
marks[0][0] = 80;
```

---

# Best Practices

- Give arrays meaningful names (`studentMarks`, `subjectNames`).
- Use methods to organize your code.
- Keep `main()` short.
- Validate user input.
- Use `printf()` for formatted output.
- Reuse methods whenever possible.
- Avoid duplicated code.

---

# Real Project Summary

In this lesson, you built a **Student Management System** using:

- 1D arrays (`studentNames`, `subjectNames`)
- 2D arrays (`studentMarks`)
- Methods
- Nested loops
- Input validation
- Calculations
- Formatted reports

This project demonstrated how multiple programming concepts work together to build a complete application.

---

# Key Terms

| Term | Meaning |
|------|---------|
| Multidimensional Array | An array whose elements are arrays. |
| Matrix | Data arranged in rows and columns. |
| Row | Horizontal collection of elements. |
| Column | Vertical collection of elements. |
| Nested Loop | A loop inside another loop. |
| Jagged Array | A 2D array where rows can have different lengths. |

---

# Summary

- A 2D array stores tabular data.
- Access elements using `array[row][column]`.
- Traverse arrays with nested loops.
- `array.length` returns the number of rows.
- `array[row].length` returns the number of columns in a row.
- Jagged arrays allow rows of different sizes.
- Methods make programs cleaner and easier to maintain.
- Multidimensional arrays are widely used in real-world applications.

---

# Lesson Checklist

- [x] Create 2D arrays
- [x] Initialize 2D arrays
- [x] Access rows and columns
- [x] Traverse with nested loops
- [x] Read user input into a matrix
- [x] Pass 2D arrays to methods
- [x] Return arrays from methods
- [x] Understand jagged arrays
- [x] Build a complete Student Management System

---

# Next Lesson

## Lesson 15 – Object-Oriented Programming (OOP)

In the next lesson, you'll learn how to model real-world entities using **classes** and **objects**. This is the foundation of professional Java development and the gateway to advanced topics such as inheritance, polymorphism, interfaces, JavaFX, and Spring Boot.