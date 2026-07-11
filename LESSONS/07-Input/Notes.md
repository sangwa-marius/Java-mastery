# Lesson 07: User Input (Scanner)

## Objectives

By the end of this lesson, you should be able to:

- Explain what user input is.
- Explain why user input is important.
- Import the `Scanner` class.
- Create a `Scanner` object.
- Read different types of input from the keyboard.
- Explain the difference between `next()` and `nextLine()`.
- Understand why `nextLine()` sometimes appears to skip input.
- Read a character (`char`) using `Scanner`.
- Follow best practices when using `Scanner`.

---

# What is User Input?

User input is information entered by the user while the program is running.

Examples:

- Enter your name
- Enter your age
- Enter your password
- Enter your salary

Without user input, programs would always use fixed (hard-coded) values.

Example:

```java
int age = 20;
```

Instead:

```java
System.out.print("Enter your age: ");
```

The user chooses the value.

---

# The Scanner Class

Java uses the **Scanner** class to read input from the keyboard.

Scanner belongs to the package:

```java
java.util
```

Therefore, it must be imported before use.

```java
import java.util.Scanner;
```

---

# Creating a Scanner Object

Syntax:

```java
Scanner input = new Scanner(System.in);
```

Explanation:

- `Scanner` → Class name
- `input` → Object name
- `new` → Creates a new object
- `System.in` → Reads input from the keyboard

---

# Reading Different Data Types

## Integer

```java
int age = input.nextInt();
```

---

## Double

```java
double salary = input.nextDouble();
```

---

## Float

```java
float temperature = input.nextFloat();
```

---

## Long

```java
long population = input.nextLong();
```

---

## Short

```java
short year = input.nextShort();
```

---

## Byte

```java
byte level = input.nextByte();
```

---

## Boolean

```java
boolean passed = input.nextBoolean();
```

Accepted values:

```text
true
false
```

---

## Single Word String

```java
String name = input.next();
```

Reads only one word.

Input:

```text
John Smith
```

Stored value:

```text
John
```

---

## Full Line String

```java
String name = input.nextLine();
```

Reads the entire line until the user presses Enter.

Input:

```text
John Smith
```

Stored value:

```text
John Smith
```

---

# Difference Between next() and nextLine()

| next() | nextLine() |
|---------|------------|
| Reads one word | Reads the entire line |
| Stops at whitespace | Stops only when Enter is pressed |
| Suitable for usernames | Suitable for full names and addresses |

Example:

Input:

```text
Sangwa Marius
```

Using:

```java
input.next();
```

Stores:

```text
Sangwa
```

Using:

```java
input.nextLine();
```

Stores:

```text
Sangwa Marius
```

---

# Reading a Character

Scanner has **no** `nextChar()` method.

Use:

```java
char gender = input.next().charAt(0);
```

Example:

Input:

```text
Male
```

Stored value:

```text
'M'
```

---

# Why nextLine() Sometimes Appears to Skip Input

This is one of the most common beginner issues.

Example:

```java
int age = input.nextInt();
String name = input.nextLine();
```

Input:

```text
20↵
```

`nextInt()` reads only:

```text
20
```

The Enter key (`↵`) remains in the input buffer.

When `nextLine()` executes, it immediately reads that leftover newline and returns an empty string.

---

## Solution

Consume the leftover newline before calling `nextLine()`.

```java
int age = input.nextInt();

input.nextLine();

String name = input.nextLine();
```

---

# Methods That Leave the Newline Character

These methods do **not** consume the Enter key:

- `nextInt()`
- `nextDouble()`
- `nextFloat()`
- `nextLong()`
- `nextShort()`
- `nextByte()`
- `nextBoolean()`
- `next()`

If one of these methods is followed by `nextLine()`, you will usually need an extra:

```java
input.nextLine();
```

to consume the leftover newline.

---

# Using print() vs println()

Use:

```java
System.out.print("Enter age: ");
```

Output:

```text
Enter age: 20
```

Use:

```java
System.out.println("Enter age:");
```

Output:

```text
Enter age:
20
```

Use `print()` when prompting the user for input.

---

# Closing the Scanner

After finishing all input operations:

```java
input.close();
```

This releases the underlying resource.

Example:

```java
Scanner input = new Scanner(System.in);

// Read input

input.close();
```

---

# Best Practices

- Import `java.util.Scanner`.
- Use meaningful variable names such as `input` or `scanner`.
- Prompt the user before reading input.
- Use `nextLine()` for sentences and full names.
- Remember the extra `nextLine()` after numeric input when another `nextLine()` follows.
- Close the `Scanner` when finished.

---

# Common Beginner Mistakes

❌ Forgetting to import Scanner

```java
import java.util.Scanner;
```

---

❌ Forgetting `new`

Wrong:

```java
Scanner input = Scanner(System.in);
```

Correct:

```java
Scanner input = new Scanner(System.in);
```

---

❌ Using `next()` for full names

Wrong:

```java
String name = input.next();
```

Input:

```text
John Smith
```

Stored:

```text
John
```

Correct:

```java
String name = input.nextLine();
```

---

❌ Forgetting to consume the leftover newline

Wrong:

```java
int age = input.nextInt();

String name = input.nextLine();
```

Correct:

```java
int age = input.nextInt();
input.nextLine();

String name = input.nextLine();
```

---

❌ Looking for `nextChar()`

Scanner does not have a `nextChar()` method.

Use:

```java
char grade = input.next().charAt(0);
```

---

# Real-World Applications

Scanner is used in:

- ATM systems
- Banking software
- Student management systems
- Hospital management systems
- Login systems
- Online registration forms
- Command-line applications

---

# Interview Questions

1. What is the purpose of the Scanner class?
2. Why do we import `java.util.Scanner`?
3. What does `System.in` represent?
4. What is the difference between `next()` and `nextLine()`?
5. Why does `nextLine()` sometimes appear to skip input?
6. Which Scanner methods leave the newline character in the input buffer?
7. How do you read a single character using Scanner?
8. Why is it good practice to close a Scanner?

---

# Quick Revision (Cheat Sheet)

| Method | Reads |
|---------|-------|
| `nextInt()` | Integer |
| `nextDouble()` | Double |
| `nextFloat()` | Float |
| `nextLong()` | Long |
| `nextShort()` | Short |
| `nextByte()` | Byte |
| `nextBoolean()` | Boolean |
| `next()` | One word |
| `nextLine()` | Entire line |
| `next().charAt(0)` | Character |

---

# Summary

- Use `Scanner` to read keyboard input.
- Import `java.util.Scanner` before using it.
- Create a Scanner object using:

```java
Scanner input = new Scanner(System.in);
```

- Use the appropriate `next...()` method for each data type.
- Use `next()` for single words.
- Use `nextLine()` for complete lines.
- If `nextLine()` follows methods like `nextInt()` or `nextDouble()`, consume the leftover newline first using an extra `nextLine()`.
- Close the Scanner when all input is complete.