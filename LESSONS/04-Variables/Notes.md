# Lesson 04 – Variables

## What is a Variable?

A **variable** is a named storage location in memory used to store data that can change while a program is running.

Think of a variable as a labeled container:

```
Age
+------+
|  21  |
+------+
```

The label is the variable name, and the value inside can change.

---

# Why Do We Need Variables?

Without variables, we would have to hardcode every value.

Example

```java
System.out.println("Marius");
System.out.println(21);
System.out.println("Computer Science");
```

Using variables:

```java
String name = "Marius";
int age = 21;
String course = "Computer Science";

System.out.println(name);
System.out.println(age);
System.out.println(course);
```

Variables make programs:

- Easier to read
- Easier to maintain
- More reusable
- More flexible

---

# Declaring a Variable

Syntax

```java
dataType variableName;
```

Example

```java
int age;
```

This creates a variable named `age` but does not assign a value.

---

# Initializing a Variable

Initialization means assigning a value for the first time.

```java
int age = 21;
```

Here:

- `int` → data type
- `age` → variable name
- `21` → value

---

# Declaration vs Initialization

Declaration only

```java
int age;
```

Initialization later

```java
age = 21;
```

Declaration and initialization together

```java
int age = 21;
```

---

# Common Data Types

| Data Type | Example |
|-----------|---------|
| int | 25 |
| double | 19.95 |
| char | 'A' |
| boolean | true |
| String | "Java" |

Example

```java
int age = 21;
double height = 1.75;
char grade = 'A';
boolean passed = true;
String name = "Marius";
```

---

# Variable Naming Rules

A variable name:

- Must begin with a letter, `_`, or `$`
- Cannot begin with a number
- Cannot contain spaces
- Cannot use Java keywords
- Is case-sensitive

Valid

```java
age
studentName
totalMarks
_height
$salary
```

Invalid

```java
2age
student name
class
```

---

# Variable Naming Conventions

Java uses **camelCase**.

Examples

```java
studentName
phoneNumber
averageMark
accountBalance
```

Avoid

```java
Student_Name
student_name
STUDENTNAME
```

---

# Assigning New Values

Variables can change.

```java
int score = 80;

score = 95;

System.out.println(score);
```

Output

```
95
```

The old value is replaced.

---

# Copying Variables

```java
int x = 10;
int y = x;

System.out.println(y);
```

Output

```
10
```

Changing one variable later does not affect the other.

```java
x = 50;

System.out.println(y);
```

Output

```
10
```

---

# Multiple Variable Declarations

Same type

```java
int x = 5, y = 10, z = 15;
```

Different types

```java
String name = "John";
int age = 22;
double salary = 85000;
```

For readability, declare one variable per line.

Preferred

```java
int age = 20;
int marks = 90;
int level = 2;
```

---

# Constants

A constant is a value that should never change.

Use the `final` keyword.

```java
final double PI = 3.14159;
```

Attempting to change it:

```java
PI = 4.5;
```

Produces a compile-time error.

Constants are written in **UPPER_CASE**.

Examples

```java
MAX_USERS
MIN_PASSWORD_LENGTH
PI
TAX_RATE
```

---

# Variable Scope

Scope determines where a variable can be accessed.

## Local Variables

Declared inside a method.

```java
public static void main(String[] args) {

    int age = 20;

}
```

The variable exists only inside that method.

---

## Block Scope

Variables declared inside a block (`{}`) exist only inside that block.

```java
if (true) {

    int number = 10;

}
```

Outside the block:

```java
System.out.println(number);
```

Compile-time error.

---

# Default Values

Local variables **do not** receive default values.

Incorrect

```java
int age;

System.out.println(age);
```

Compile-time error:

```
variable age might not have been initialized
```

Always initialize local variables before using them.

---

# Variable Lifetime

A local variable:

- Is created when execution enters its block.
- Is destroyed when execution leaves the block.

---

# Memory Representation

Example

```java
int age = 21;
```

Memory

```
+-----------+
| age | 21  |
+-----------+
```

Another variable

```java
int marks = 85;
```

Memory

```
+-------------+
| age   | 21  |
| marks | 85  |
+-------------+
```

---

# Updating Variables

Example

```java
int balance = 500;

balance = balance + 200;

System.out.println(balance);
```

Output

```
700
```

Shortcut

```java
balance += 200;
```

Equivalent to

```java
balance = balance + 200;
```

---

# Swapping Variables

Without a temporary variable

```java
int a = 5;
int b = 10;

int temp = a;
a = b;
b = temp;
```

Result

```
a = 10
b = 5
```

---

# Variable Shadowing (Introduction)

A local variable can hide another variable with the same name.

```java
int number = 10;

{

    int number = 20; // Not allowed in the same method

}
```

Java prevents duplicate local variable names within overlapping scopes.

You'll learn more about shadowing in Object-Oriented Programming.

---

# Common Mistakes

## Using a Variable Before Initialization

Incorrect

```java
int age;

System.out.println(age);
```

Correct

```java
int age = 21;

System.out.println(age);
```

---

## Wrong Variable Name

```java
int student age = 20;
```

Invalid because of the space.

Correct

```java
int studentAge = 20;
```

---

## Case Sensitivity

```java
int age = 20;

System.out.println(Age);
```

Compile-time error.

`age` and `Age` are different variables.

---

## Re-declaring a Variable

Incorrect

```java
int age = 20;
int age = 25;
```

Compile-time error.

Correct

```java
int age = 20;

age = 25;
```

---

# Best Practices

- Use meaningful variable names.
- Follow camelCase naming.
- Keep variable scope as small as possible.
- Initialize variables before use.
- Use `final` for constants.
- Avoid single-letter names except for loop counters (`i`, `j`).

---

# Java vs JavaScript

## Java

Variables must have a declared type.

```java
int age = 21;
String name = "Marius";
```

Once declared, the type cannot change.

---

## JavaScript

Variables are dynamically typed.

```javascript
let value = 21;
value = "Hello";
```

The type can change during execution.

---

# Interview Notes

## What is a Variable?

A named memory location used to store data that may change during program execution.

---

## Difference Between Declaration and Initialization

Declaration

```java
int age;
```

Initialization

```java
age = 21;
```

---

## What is a Constant?

A variable declared with `final` whose value cannot be changed.

Example

```java
final double PI = 3.14159;
```

---

## What is Scope?

Scope defines where a variable can be accessed in a program.

---

# Summary

You should now understand:

- ✅ What variables are
- ✅ Declaration and initialization
- ✅ Common data types
- ✅ Naming rules
- ✅ Naming conventions
- ✅ Variable assignment
- ✅ Constants using `final`
- ✅ Scope
- ✅ Variable lifetime
- ✅ Updating values
- ✅ Common mistakes
- ✅ Best practices

---

# Key Takeaways

- Variables store data that can change.
- Every variable has a data type, a name, and a value.
- Initialize variables before using them.
- Use descriptive names and follow camelCase.
- Use `final` for values that should never change.
- Keep variable scope as small as possible.
- Good variable naming makes code easier to understand and maintain.