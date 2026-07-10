# Lesson 03: Hello World & Java Program Structure

## Objectives

By the end of this lesson, you should be able to:

- Write a complete Java program from memory.
- Explain every keyword in a Java program.
- Understand Java syntax rules.
- Understand Java naming conventions.
- Differentiate between source files and class files.
- Explain why `main()` is the entry point of a Java application.

---

# Your First Java Program

Create a file named:

```text
HelloWorld.java
```

Write the following code:

```java
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

    }

}
```

Compile:

```bash
javac HelloWorld.java
```

Run:

```bash
java HelloWorld
```

Output:

```text
Hello, World!
```

---

# Anatomy of a Java Program

## 1. public

```java
public class HelloWorld
```

`public` is an **access modifier**.

It allows the class to be accessed from anywhere in the program.

Other access modifiers (covered later):

- public
- private
- protected
- default (package-private)

---

## 2. class

```java
class HelloWorld
```

A class is a **blueprint** used to create objects.

Think of it like an architectural blueprint.

Blueprint → House

Class → Object

Everything in Java is organized inside classes.

---

## 3. Class Name

```java
HelloWorld
```

This is the class name.

Rules:

✅ Can contain

- Letters
- Numbers
- Underscore (_)
- Dollar sign ($)

❌ Cannot

- Start with a number
- Contain spaces
- Be a Java keyword

Examples

Good

```java
Student
BankAccount
HospitalManagement
```

Bad

```java
2Student
my class
public
```

---

# Naming Convention

Java uses **PascalCase** for class names.

Examples

```java
Student
BankAccount
TemperatureConverter
HospitalManagement
```

Avoid

```java
student
bank_account
BANKACCOUNT
```

---

# Curly Braces

```java
{

}
```

Curly braces define blocks of code.

They are used for

- Classes
- Methods
- Loops
- Conditionals

Every opening brace `{` must have a matching closing brace `}`.

---

# The main() Method

```java
public static void main(String[] args)
```

This is the entry point of every Java application.

When you run

```bash
java HelloWorld
```

the JVM searches for this method.

If it cannot find it, the program cannot start.

---

# Understanding Each Keyword

## public

Allows the JVM to access the method.

---

## static

Allows the JVM to call the method without creating an object first.

You will study `static` in detail later.

---

## void

Means the method returns nothing.

Example

```java
void
```

means

> No value is returned.

---

## main

The name of the method that the JVM looks for when starting a program.

---

## String[] args

Stores command-line arguments.

Example

```bash
java HelloWorld Marius
```

Later you will learn to access

```java
args[0]
```

which would contain

```text
Marius
```

---

# Statements

Inside the `main()` method

```java
System.out.println("Hello");
```

This is called a **statement**.

Almost every Java statement ends with

```java
;
```

The semicolon tells Java that the statement has ended.

---

# System.out.println()

```java
System.out.println("Hello");
```

Breakdown

## System

A built-in Java class.

## out

The standard output stream.

Usually the terminal or console.

## println()

Prints text and moves to the next line.

---

# print() vs println()

Using `print()`

```java
System.out.print("Java");
System.out.print("Course");
```

Output

```text
JavaCourse
```

Using `println()`

```java
System.out.println("Java");
System.out.println("Course");
```

Output

```text
Java
Course
```

---

# Java Syntax Rules

- Java is case-sensitive.
- Every statement usually ends with a semicolon (`;`).
- Class names should use PascalCase.
- The filename must match the public class name.
- Braces must always be balanced.
- Java code is organized inside classes.

---

# Common Beginner Mistakes

## Wrong filename

```java
public class Student
```

Saved as

```text
student.java
```

This causes a compilation error because the filename must exactly match the public class name.

---

## Missing Semicolon

Incorrect

```java
System.out.println("Hello")
```

Compiler Error

```text
';' expected
```

---

## Wrong Capitalization

Incorrect

```java
system.out.println();
```

Correct

```java
System.out.println();
```

Java is case-sensitive.

---

## Missing Braces

Every class and method must have matching opening and closing braces.

Incorrect

```java
public class Test

public static void main(String[] args)
```

Correct

```java
public class Test {

    public static void main(String[] args) {

    }

}
```

---

# Key Terms

| Term | Meaning |
|------|---------|
| Class | Blueprint for creating objects |
| Object | Instance of a class |
| Method | A block of code that performs a task |
| Statement | A single instruction in Java |
| JVM | Runs Java programs |
| Compiler | Converts source code into bytecode |

---

# Summary

In this lesson you learned:

- The structure of a Java program.
- The purpose of `public`.
- The purpose of `class`.
- The purpose of `main()`.
- The meaning of `static`.
- The meaning of `void`.
- How `String[] args` works.
- The difference between `print()` and `println()`.
- Java naming conventions.
- Common syntax errors.

---

# Quick Revision

Remember these points:

- Every Java program starts from the `main()` method.
- The filename must match the public class name.
- Java is case-sensitive.
- Statements end with a semicolon.
- Classes use PascalCase.
- Curly braces define blocks of code.
- `println()` prints text and moves to a new line.
- `print()` prints without moving to a new line.

---

# What's Next?

In the next lesson, you will learn about **Variables**.

Topics include:

- What variables are.
- Why variables are needed.
- Declaring variables.
- Initializing variables.
- Assigning values.
- Variable naming rules.
- Memory basics.