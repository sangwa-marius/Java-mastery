# Lesson 08 – Type Casting

## What is Type Casting?

Type casting is the process of converting a value from one data type to another.

Example:

```java
double price = 99.99;
int wholePrice = (int) price;
```

Output

```
99
```

The decimal part is removed.

---

# Why Do We Need Type Casting?

Different variables store different types of data.

Example

```java
int age = 20;
double height = 1.75;
char grade = 'A';
```

Sometimes we need to convert one type into another.

Examples

- Calculating averages
- Reading input
- Working with files
- Mathematics
- Displaying data
- Communicating with APIs and databases

---

# Two Types of Type Casting

Java supports two kinds of casting.

## 1. Implicit Casting (Widening)

Also called:

- Automatic Casting
- Widening Conversion

Java performs this conversion automatically because no information is lost.

Example

```java
int number = 25;
double value = number;
```

Output

```
25.0
```

Java converts

```
int → double
```

automatically.

---

## Widening Conversion Order

Java allows automatic conversion in this direction:

```text
byte
  ↓
short
  ↓
int
  ↓
long
  ↓
float
  ↓
double
```

You can always move downward without writing a cast.

Example

```java
int x = 50;
long y = x;
double z = y;
```

---

# Example

```java
char letter = 'A';

int ascii = letter;

System.out.println(ascii);
```

Output

```
65
```

Characters are internally stored as numbers (Unicode values).

---

# 2. Explicit Casting (Narrowing)

Also called:

- Manual Casting
- Narrowing Conversion

Used when converting from a larger type to a smaller type.

Syntax

```java
(targetType) value
```

Example

```java
double price = 89.95;

int whole = (int) price;

System.out.println(whole);
```

Output

```
89
```

The decimal part is discarded, not rounded.

---

# Narrowing Conversion Order

```text
double
   ↓
float
   ↓
long
   ↓
int
   ↓
short
   ↓
byte
```

Java requires an explicit cast because data may be lost.

---

# Data Loss

Example

```java
double number = 19.99;

int x = (int) number;
```

Output

```
19
```

Notice:

```
0.99
```

is lost.

Java does **not** round the value.

---

# Another Example

```java
int number = 130;

byte small = (byte) number;

System.out.println(small);
```

Output

```
-126
```

Why?

A `byte` can only store values from:

```
-128 to 127
```

Since `130` is outside that range, overflow occurs.

---

# Casting Characters

Characters are numbers behind the scenes.

Example

```java
char letter = 'A';

int code = letter;

System.out.println(code);
```

Output

```
65
```

Reverse conversion:

```java
int code = 66;

char letter = (char) code;

System.out.println(letter);
```

Output

```
B
```

---

# ASCII / Unicode

Examples

| Character | Value |
|-----------|------:|
| A | 65 |
| B | 66 |
| C | 67 |
| a | 97 |
| b | 98 |
| 0 | 48 |
| 1 | 49 |

Example

```java
char ch = '7';

System.out.println((int) ch);
```

Output

```
55
```

---

# Type Promotion

Java automatically promotes smaller numeric types during arithmetic.

Example

```java
byte a = 20;
byte b = 30;

int result = a + b;
```

Even though both variables are `byte`, the result is an `int`.

This is normal Java behavior.

---

# Mixing Data Types

Example

```java
int x = 10;
double y = 2.5;

double result = x + y;
```

Output

```
12.5
```

The `int` is automatically promoted to a `double`.

---

# Integer Division

Example

```java
int a = 7;
int b = 2;

System.out.println(a / b);
```

Output

```
3
```

Both operands are integers, so Java performs integer division.

---

# Getting Decimal Division

Option 1

```java
double result = (double) a / b;
```

Option 2

```java
double result = a / 2.0;
```

Output

```
3.5
```

---

# Practical Example

```java
int totalMarks = 275;
int subjects = 4;

double average = (double) totalMarks / subjects;

System.out.println(average);
```

Output

```
68.75
```

Without casting:

```java
double average = totalMarks / subjects;
```

Output

```
68.0
```

because integer division happens before assignment.

---

# Casting User Input

Example

```java
Scanner input = new Scanner(System.in);

System.out.print("Enter your score: ");

double score = input.nextDouble();

int wholeScore = (int) score;

System.out.println(wholeScore);
```

---

# Common Mistakes

## Forgetting the Cast

Incorrect

```java
double value = 9.8;

int number = value;
```

Compile-time error.

Correct

```java
int number = (int) value;
```

---

## Expecting Rounding

```java
int number = (int) 9.99;
```

Output

```
9
```

Not

```
10
```

Casting truncates; it does not round.

Use:

```java
Math.round()
```

if you need rounding.

---

## Overflow

Example

```java
int value = 300;

byte small = (byte) value;
```

Produces an unexpected result because `300` is outside the range of `byte`.

---

# Best Practices

- Prefer implicit casting when possible.
- Use explicit casting only when necessary.
- Be aware of possible data loss.
- Cast before division when you need decimal results.
- Avoid unnecessary casts that make code harder to read.

---

# Java vs JavaScript

## Java

Strongly typed.

```java
double price = 19.99;
int whole = (int) price;
```

Casting is explicit.

---

## JavaScript

Dynamically typed.

```javascript
let price = 19.99;
let whole = parseInt(price);
```

JavaScript uses conversion functions rather than language-level casting syntax.

---

# Interview Notes

### Difference Between Widening and Narrowing

**Widening**

- Automatic
- Safe
- No data loss
- Smaller type → Larger type

**Narrowing**

- Manual
- May lose data
- Larger type → Smaller type

---

### Does Casting Round Numbers?

No.

Example

```java
(int) 9.99
```

Result

```
9
```

---

### Why Cast Before Division?

Because integer division removes the decimal part before assignment.

Correct

```java
double average = (double) total / count;
```

---

# Summary

You should now understand:

- ✅ What type casting is
- ✅ Implicit (widening) casting
- ✅ Explicit (narrowing) casting
- ✅ Data loss during casting
- ✅ Character and ASCII/Unicode conversions
- ✅ Type promotion in arithmetic
- ✅ Integer vs decimal division
- ✅ Casting user input
- ✅ Common mistakes
- ✅ Best practices

---

# Key Takeaways

- Widening conversions happen automatically.
- Narrowing conversions require an explicit cast.
- Casting from `double` to `int` removes the decimal part.
- Cast before division when you need a decimal result.
- Characters are stored as numeric Unicode values.
- Be careful of overflow when casting to smaller data types.