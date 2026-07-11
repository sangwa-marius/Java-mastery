# Lesson 06: Operators

## Objectives

By the end of this lesson, you should be able to:

- Explain what an operator is.
- Differentiate between different types of operators.
- Perform arithmetic calculations.
- Use assignment operators.
- Compare values using relational operators.
- Combine conditions using logical operators.
- Use increment and decrement operators correctly.
- Understand the difference between prefix and postfix operators.
- Apply operator precedence correctly.

---

# What is an Operator?

An **operator** is a symbol that tells Java to perform an operation on one or more values (operands).

Example:

```java
10 + 5
```

- `+` is the operator.
- `10` and `5` are operands.

Result:

```
15
```

---

# Categories of Operators

Java has many operators, but the most common ones are:

```
Operators
│
├── Arithmetic
├── Assignment
├── Comparison (Relational)
├── Logical
└── Increment & Decrement
```

---

# 1. Arithmetic Operators

Used to perform mathematical calculations.

| Operator | Meaning | Example |
|----------|---------|---------|
| + | Addition | `5 + 3` |
| - | Subtraction | `8 - 2` |
| * | Multiplication | `4 * 6` |
| / | Division | `20 / 5` |
| % | Modulus (Remainder) | `10 % 3` |

Example:

```java
int a = 20;
int b = 6;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

Output:

```
26
14
120
3
2
```

---

## Integer Division

When both operands are integers, Java performs **integer division**.

Example:

```java
System.out.println(7 / 2);
```

Output:

```
3
```

To obtain a decimal result:

```java
System.out.println(7.0 / 2);
```

Output:

```
3.5
```

---

## Modulus Operator (%)

Returns the remainder after division.

Example:

```java
10 % 3
```

Output:

```
1
```

Common uses:

- Checking even numbers
- Checking odd numbers
- Leap year calculations
- Cyclic operations

---

# 2. Assignment Operators

Assignment operators store values inside variables.

Basic assignment:

```java
int age = 20;
```

`=` means **assign**, not compare.

---

## Compound Assignment Operators

Instead of:

```java
age = age + 5;
```

Use:

```java
age += 5;
```

Examples:

| Operator | Equivalent |
|----------|------------|
| += | x = x + value |
| -= | x = x - value |
| *= | x = x * value |
| /= | x = x / value |
| %= | x = x % value |

Example:

```java
int score = 80;

score += 10;

System.out.println(score);
```

Output:

```
90
```

---

# 3. Comparison (Relational) Operators

Comparison operators compare two values and always return a **boolean** (`true` or `false`).

| Operator | Meaning |
|----------|---------|
| == | Equal to |
| != | Not equal to |
| > | Greater than |
| < | Less than |
| >= | Greater than or equal |
| <= | Less than or equal |

Example:

```java
int age = 20;

System.out.println(age >= 18);
```

Output:

```
true
```

---

# Assignment vs Comparison

Assignment:

```java
age = 20;
```

Comparison:

```java
age == 20;
```

Remember:

- `=` assigns a value.
- `==` compares two values.

---

# 4. Logical Operators

Logical operators combine multiple conditions.

## AND (&&)

Returns `true` only if **both** conditions are true.

Example:

```java
age >= 18 && salary >= 500
```

Truth Table:

| A | B | A && B |
|---|---|---------|
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

---

## OR (||)

Returns `true` if **at least one** condition is true.

Example:

```java
marks >= 50 || specialPermission
```

Truth Table:

| A | B | A || B |
|---|---|--------|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

---

## NOT (!)

Reverses a boolean value.

Example:

```java
boolean student = true;

System.out.println(!student);
```

Output:

```
false
```

---

# 5. Increment Operator (++)

Increases a variable by one.

Instead of:

```java
count = count + 1;
```

Use:

```java
count++;
```

Example:

```java
int count = 5;

count++;

System.out.println(count);
```

Output:

```
6
```

---

# 6. Decrement Operator (--)

Decreases a variable by one.

Example:

```java
int lives = 5;

lives--;

System.out.println(lives);
```

Output:

```
4
```

---

# Prefix vs Postfix

## Prefix

```java
++x
```

Meaning:

1. Increment first.
2. Use the new value.

Example:

```java
int x = 5;

System.out.println(++x);
```

Output:

```
6
```

---

## Postfix

```java
x++
```

Meaning:

1. Use the current value.
2. Increment afterward.

Example:

```java
int x = 5;

System.out.println(x++);
```

Output:

```
5
```

Final value of `x`:

```
6
```

---

# Summary Table

| Expression | Value Used | Variable After |
|------------|------------|----------------|
| ++x | New value | Incremented |
| x++ | Old value | Incremented |
| --x | New value | Decremented |
| x-- | Old value | Decremented |

---

# Operator Precedence

Java evaluates operators in a specific order.

Basic order:

1. Parentheses `()`
2. Prefix `++` `--`
3. `*` `/` `%`
4. `+` `-`
5. `<` `>` `<=` `>=`
6. `==` `!=`
7. `&&`
8. `||`
9. Assignment operators

Example:

```java
System.out.println(2 + 3 * 4);
```

Output:

```
14
```

Using parentheses:

```java
System.out.println((2 + 3) * 4);
```

Output:

```
20
```

---

# Best Practices

- Use meaningful variable names.
- Use parentheses when expressions become complex.
- Prefer readability over clever code.
- Avoid writing multiple increment/decrement operations in one statement.
- Use compound assignment operators to simplify code.

---

# Common Beginner Mistakes

❌ Confusing `=` with `==`

❌ Forgetting that integer division removes decimals

❌ Forgetting `%` returns the remainder

❌ Thinking `x++` and `++x` always behave the same

❌ Ignoring operator precedence

---

# Real-World Applications

Arithmetic Operators:

- Calculator
- Payroll system
- Banking software

Comparison Operators:

- Login validation
- Exam grading
- Age verification

Logical Operators:

- Loan approval
- User authentication
- Search filters

Increment/Decrement:

- Visitor counters
- Game scores
- Inventory systems

---

# Interview Questions

1. What is an operator?
2. What is the difference between `=` and `==`?
3. What does `%` do?
4. Why does `7 / 2` produce `3`?
5. What is the difference between `++x` and `x++`?
6. What is operator precedence?
7. What is the purpose of logical operators?

---

# Quick Revision (Cheat Sheet)

| Operator | Description |
|----------|-------------|
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |
| % | Remainder |
| = | Assignment |
| += | Add and assign |
| -= | Subtract and assign |
| *= | Multiply and assign |
| /= | Divide and assign |
| %= | Modulus and assign |
| == | Equal to |
| != | Not equal |
| > | Greater than |
| < | Less than |
| >= | Greater than or equal |
| <= | Less than or equal |
| && | Logical AND |
| || | Logical OR |
| ! | Logical NOT |
| ++ | Increment |
| -- | Decrement |