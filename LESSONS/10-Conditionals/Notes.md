# Lesson 10 – Conditionals

## What are Conditionals?

Conditionals allow a program to make decisions.

Instead of executing every line of code, the program checks a condition and decides which block of code to execute.

Example:

```java
int age = 20;

if (age >= 18) {
    System.out.println("You are an adult.");
}
```

Output

```
You are an adult.
```

---

# Why Do We Need Conditionals?

Imagine writing a program that:

- Determines if a student passed or failed.
- Checks login credentials.
- Calculates discounts.
- Determines loan eligibility.
- Controls an ATM menu.
- Validates user input.

Without conditionals, programs would always execute the same instructions regardless of the situation.

---

# Boolean Expressions

A condition must evaluate to a **boolean** value.

There are only two possible values:

```text
true
false
```

Example

```java
int marks = 80;

System.out.println(marks >= 50);
```

Output

```
true
```

---

# The if Statement

The simplest conditional.

Syntax

```java
if (condition) {

    // code to execute

}
```

Example

```java
int temperature = 35;

if (temperature > 30) {
    System.out.println("It's hot today.");
}
```

---

# if...else

Use when there are two possible outcomes.

Example

```java
int marks = 45;

if (marks >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

Output

```
Fail
```

---

# else if

Used when there are multiple conditions.

Example

```java
int marks = 82;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 80) {
    System.out.println("Grade B");
} else if (marks >= 70) {
    System.out.println("Grade C");
} else if (marks >= 60) {
    System.out.println("Grade D");
} else {
    System.out.println("Grade F");
}
```

Output

```
Grade B
```

Only the first matching condition is executed.

---

# Nested if Statements

An `if` statement inside another `if`.

Example

```java
int age = 22;
boolean hasID = true;

if (age >= 18) {

    if (hasID) {
        System.out.println("Access Granted");
    }

}
```

Use nested `if` statements only when necessary to avoid making code difficult to read.

---

# Comparison Operators

| Operator | Meaning |
|----------|---------|
| `==` | Equal to |
| `!=` | Not equal to |
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal to |
| `<=` | Less than or equal to |

Example

```java
int score = 75;

System.out.println(score >= 50);
```

Output

```
true
```

---

# Logical Operators

## AND (`&&`)

Both conditions must be true.

```java
int age = 20;
boolean hasID = true;

if (age >= 18 && hasID) {
    System.out.println("Entry Allowed");
}
```

---

## OR (`||`)

At least one condition must be true.

```java
boolean isAdmin = false;
boolean isModerator = true;

if (isAdmin || isModerator) {
    System.out.println("Access Granted");
}
```

---

## NOT (`!`)

Reverses a boolean value.

```java
boolean loggedIn = false;

if (!loggedIn) {
    System.out.println("Please log in.");
}
```

---

# Short-Circuit Evaluation

Java stops evaluating conditions as soon as the result is known.

Example

```java
if (false && expensiveMethod()) {

}
```

`expensiveMethod()` is never called.

Another example

```java
String name = null;

if (name != null && name.length() > 3) {
    System.out.println(name);
}
```

Since `name != null` is false, Java never calls `name.length()`, preventing a `NullPointerException`.

---

# Ternary Operator

A shorthand for simple `if...else` statements.

Syntax

```java
condition ? valueIfTrue : valueIfFalse
```

Example

```java
int age = 20;

String status = age >= 18 ? "Adult" : "Minor";

System.out.println(status);
```

Output

```
Adult
```

Use the ternary operator for simple assignments only.

---

# switch Statement

A `switch` is useful when comparing one variable against many constant values.

---

## Traditional switch

```java
int day = 3;

switch (day) {

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid Day");

}
```

The `break` statement prevents execution from continuing into the next case.

---

# Modern switch (Java 14+)

Since Java 14, Java supports a cleaner syntax.

```java
int day = 3;

switch (day) {

    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    case 3 -> System.out.println("Wednesday");
    default -> System.out.println("Invalid Day");

}
```

Advantages

- Cleaner syntax
- No `break`
- Less chance of mistakes

Since you're using **Java 25**, this is the preferred syntax.

---

# Multiple Cases

Modern switch allows multiple values.

```java
switch (day) {

    case 1, 7 -> System.out.println("Weekend");
    case 2, 3, 4, 5, 6 -> System.out.println("Weekday");

}
```

---

# Switch Expression

A switch can return a value.

```java
int marks = 82;

String grade = switch (marks / 10) {

    case 10, 9 -> "A";
    case 8 -> "B";
    case 7 -> "C";
    case 6 -> "D";
    default -> "F";

};

System.out.println(grade);
```

This is much cleaner than long `if...else if` chains.

---

# When to Use if vs switch

Use **if...else** when:

- Checking ranges.
- Combining conditions.
- Using logical operators.

Example

```java
if (marks >= 70 && marks <= 100) {

}
```

Use **switch** when:

- Comparing one variable against many fixed values.

Example

```java
switch (month) {

}
```

---

# Common Mistakes

## Using = instead of ==

Incorrect

```java
if (score = 50)
```

Correct

```java
if (score == 50)
```

---

## Forgetting break (Traditional switch)

```java
switch(day) {

case 1:
    System.out.println("Monday");

case 2:
    System.out.println("Tuesday");

}
```

Output

```
Monday
Tuesday
```

Execution "falls through" because there is no `break`.

---

## Using == for Strings

Incorrect

```java
if (name == "John")
```

Correct

```java
if (name.equals("John"))
```

Always use `equals()` when comparing String contents.

---

## Forgetting Braces

Avoid

```java
if (age >= 18)
    System.out.println("Adult");
```

Prefer

```java
if (age >= 18) {
    System.out.println("Adult");
}
```

Even for one statement, braces improve readability and reduce bugs.

---

# Best Practices

- Keep conditions simple.
- Prefer the modern `switch` syntax.
- Use meaningful variable names.
- Avoid deeply nested `if` statements.
- Validate user input before processing it.
- Use braces consistently.
- Use `equals()` for Strings.

---

# Java vs JavaScript

## Java

Conditions **must** evaluate to a boolean.

```java
int x = 5;

if (x != 0) {

}
```

---

## JavaScript

JavaScript allows truthy and falsy values.

```javascript
let x = 5;

if (x) {

}
```

This is **not allowed** in Java.

---

# Interview Notes

## Difference between if and switch

**if**

- Handles ranges.
- Handles logical expressions.
- More flexible.

**switch**

- Handles fixed values.
- Cleaner for menus.
- Easier to read.

---

## Difference between && and ||

`&&`

Both conditions must be true.

`||`

Only one condition must be true.

---

## What is Short-Circuit Evaluation?

Java stops evaluating logical expressions as soon as the result is already known.

This improves performance and helps prevent runtime errors.

---

## Can switch replace every if statement?

No.

A switch works well with fixed values, but not with ranges or complex boolean expressions.

---

# Summary

You should now understand:

- ✅ Boolean expressions
- ✅ `if`
- ✅ `if...else`
- ✅ `else if`
- ✅ Nested `if`
- ✅ Comparison operators
- ✅ Logical operators (`&&`, `||`, `!`)
- ✅ Short-circuit evaluation
- ✅ Ternary operator
- ✅ Traditional `switch`
- ✅ Modern `switch`
- ✅ Switch expressions
- ✅ Common mistakes
- ✅ Best practices

---

# Key Takeaways

- Conditionals allow programs to make decisions.
- Every Java condition must evaluate to a `boolean`.
- Use `if...else` for ranges and complex conditions.
- Use `switch` for fixed values and menu-driven programs.
- Prefer the modern `switch` syntax (`->`) in Java 25.
- Use `equals()` when comparing Strings.
- Keep conditional logic readable and avoid unnecessary nesting.