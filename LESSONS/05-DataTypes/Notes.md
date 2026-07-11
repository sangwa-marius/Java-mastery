# Lesson 05: Data Types

## Objectives

By the end of this lesson, you should be able to:

- Explain what a data type is.
- Differentiate between primitive and non-primitive data types.
- Use Java's primitive data types correctly.
- Select appropriate data types for different scenarios.

---

# What is a Data Type?

A **data type** tells Java what kind of value a variable can store.

Think of a data type as a label on a storage container.

Examples:

- A water bottle stores water.
- A fuel tank stores fuel.
- A wallet stores money.

Similarly:

- `int` stores integers.
- `double` stores decimal numbers.
- `char` stores a single character.
- `boolean` stores either `true` or `false`.

Without data types, Java would not know how much memory to allocate or how to interpret stored values.

---

# Categories of Data Types

Java divides data types into two groups:

1. Primitive Data Types
2. Non-Primitive (Reference) Data Types

```
Data Types
│
├── Primitive
│     ├── byte
│     ├── short
│     ├── int
│     ├── long
│     ├── float
│     ├── double
│     ├── char
│     └── boolean
│
└── Non-Primitive
      ├── String
      ├── Arrays
      ├── Classes
      ├── Interfaces
      └── Objects
```

---

# Primitive Data Types

Primitive data types are built directly into Java.

There are **8 primitive data types**.

| Type | Size | Example | Purpose |
|------|------|---------|---------|
| byte | 1 byte | 100 | Small integers |
| short | 2 bytes | 30000 | Medium integers |
| int | 4 bytes | 250 | General-purpose integers |
| long | 8 bytes | 5000000000L | Large integers |
| float | 4 bytes | 3.14f | Decimal numbers |
| double | 8 bytes | 3.14159 | More precise decimals |
| char | 2 bytes | 'A' | Single character |
| boolean | JVM-dependent storage, logically one of two values | true | Logical values |

---

# 1. byte

Stores small whole numbers.

Example:

```java
byte age = 20;
```

Range:

```
-128 to 127
```

---

# 2. short

Stores larger integers than byte.

```java
short population = 30000;
```

Range:

```
-32,768 to 32,767
```

---

# 3. int

The most commonly used integer type.

```java
int marks = 95;
```

Range:

```
-2,147,483,648 to 2,147,483,647
```

---

# 4. long

Used for very large integers.

```java
long worldPopulation = 8000000000L;
```

Notice the `L` suffix.

---

# 5. float

Stores decimal numbers.

```java
float pi = 3.14f;
```

Notice the `f` suffix.

---

# 6. double

Also stores decimal numbers.

```java
double salary = 850000.75;
```

`double` is generally preferred because it provides greater precision than `float`.

---

# 7. char

Stores a single character.

```java
char grade = 'A';
```

Characters use **single quotes**.

Correct:

```java
'A'
```

Incorrect:

```java
"A"
```

Double quotes create a `String`.

---

# 8. boolean

Stores only two possible values.

```java
boolean passed = true;
```

Possible values:

```
true
false
```

---

# Primitive vs Non-Primitive

Primitive

```java
int age = 20;
```

Non-Primitive

```java
String name = "Marius";
```

Primitive types store the value directly.

Reference types store a reference to an object.

We'll study this in detail during Object-Oriented Programming.

---

# Choosing the Right Data Type

| Situation | Recommended Type |
|-----------|------------------|
| Student age | int |
| Bank balance | double |
| First letter of a name | char |
| Pass/Fail | boolean |
| Person's name | String |

---

# Common Mistakes

## Forgetting the `L`

Incorrect:

```java
long number = 8000000000;
```

Correct:

```java
long number = 8000000000L;
```

---

## Forgetting the `f`

Incorrect:

```java
float pi = 3.14;
```

Correct:

```java
float pi = 3.14f;
```

---

## Using Double Quotes for char

Incorrect:

```java
char grade = "A";
```

Correct:

```java
char grade = 'A';
```

---

# Summary

Java has two categories of data types:

- Primitive
- Non-Primitive

Primitive types include:

- byte
- short
- int
- long
- float
- double
- char
- boolean

Choosing the correct data type improves readability, correctness, and memory efficiency.

---

# Quick Revision

- `int` → integers
- `double` → decimal numbers
- `char` → single character
- `boolean` → true or false
- `String` → text (reference type)