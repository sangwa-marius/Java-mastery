# Lesson 11 – Loops

## What is a Loop?

A **loop** is a control structure that repeatedly executes a block of code until a specified condition becomes false.

Without loops:

```java
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
```

With a loop:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Hello");
}
```

Both produce the same output, but the loop is much shorter, easier to read, and easier to maintain.

---

# Why Do We Need Loops?

Loops are essential because they allow us to:

- Print a sequence of numbers.
- Process multiple users.
- Read multiple inputs.
- Search through data.
- Calculate totals and averages.
- Process arrays and collections.
- Build menus that repeat until the user exits.

Without loops, many real-world programs would be impossible or extremely repetitive.

---

# Types of Loops in Java

Java provides four looping mechanisms.

| Loop | Purpose |
|------|---------|
| `while` | Repeat while a condition is true. |
| `do...while` | Execute at least once before checking the condition. |
| `for` | Repeat a known number of times. |
| Enhanced `for` | Iterate through arrays and collections. |

---

# The while Loop

A `while` loop checks its condition **before** executing the loop body.

Syntax

```java
while (condition) {

    // code

}
```

Example

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

Output

```
1
2
3
4
5
```

---

# How a while Loop Works

Every loop has three parts.

## 1. Initialization

```java
int i = 1;
```

---

## 2. Condition

```java
i <= 5
```

---

## 3. Update

```java
i++;
```

If you forget the update, the loop may never end.

---

# Infinite Loops

Example

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
}
```

Output

```
1
1
1
1
1
...
```

The loop never stops because `i` never changes.

---

# Countdown Example

```java
int i = 10;

while (i >= 1) {
    System.out.println(i);
    i--;
}

System.out.println("Blast Off!");
```

---

# Using while with User Input

```java
Scanner input = new Scanner(System.in);

String password = "";

while (!password.equals("java123")) {

    System.out.print("Enter Password: ");
    password = input.nextLine();

}

System.out.println("Access Granted");
```

This is a common use case because we do not know how many attempts the user will need.

---

# The do...while Loop

A `do...while` loop executes the code **before** checking the condition.

Syntax

```java
do {

    // code

} while (condition);
```

Notice the semicolon after `while`.

---

# Example

```java
int number = 1;

do {

    System.out.println(number);
    number++;

} while (number <= 5);
```

Output

```
1
2
3
4
5
```

---

# Difference Between while and do...while

## while

```
Condition
     ↓
 Execute
```

---

## do...while

```
Execute
    ↓
Condition
```

A `do...while` loop always executes at least once.

---

# Example

```java
int x = 10;

while (x < 5) {
    System.out.println("Hello");
}
```

Output

```
Nothing
```

Now:

```java
int x = 10;

do {
    System.out.println("Hello");
} while (x < 5);
```

Output

```
Hello
```

---

# When to Use do...while

Typical examples include:

- ATM menus
- Login systems
- Game menus
- Asking users whether they want to continue

---

# The for Loop

A `for` loop is used when the number of iterations is known.

Syntax

```java
for (initialization; condition; update) {

    // code

}
```

Example

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Output

```
1
2
3
4
5
```

---

# Parts of a for Loop

Initialization

```java
int i = 1;
```

Condition

```java
i <= 5
```

Update

```java
i++
```

Execution order

```
Initialization
      ↓
Condition
      ↓
Execute
      ↓
Update
      ↓
Repeat
```

---

# Printing Even Numbers

```java
for (int i = 2; i <= 20; i += 2) {
    System.out.println(i);
}
```

---

# Countdown

```java
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}
```

---

# Multiplication Table

```java
int number = 7;

for (int i = 1; i <= 10; i++) {
    System.out.println(number + " x " + i + " = " + (number * i));
}
```

---

# Variable Scope

Loop variables declared inside a `for` loop exist only inside the loop.

```java
for (int i = 0; i < 5; i++) {

}
```

The following is invalid:

```java
System.out.println(i);
```

because `i` no longer exists.

---

# Infinite for Loop

```java
for (;;) {
    System.out.println("Running...");
}
```

Equivalent to

```java
while (true) {

}
```

---

# break

`break` immediately terminates the nearest loop.

Example

```java
for (int i = 1; i <= 10; i++) {

    if (i == 6) {
        break;
    }

    System.out.println(i);

}
```

Output

```
1
2
3
4
5
```

---

# continue

`continue` skips the current iteration.

Example

```java
for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        continue;
    }

    System.out.println(i);

}
```

Output

```
1
2
3
4
6
7
8
9
10
```

---

# break vs continue

| break | continue |
|--------|----------|
| Ends the loop immediately | Skips only the current iteration |
| Control leaves the loop | Control moves to the next iteration |

---

# Nested Loops

A nested loop is a loop inside another loop.

Example

```java
for (int row = 1; row <= 3; row++) {

    for (int column = 1; column <= 4; column++) {

        System.out.print("* ");

    }

    System.out.println();

}
```

Output

```
* * * *
* * * *
* * * *
```

---

# Multiplication Table (Nested Loops)

```java
for (int i = 1; i <= 5; i++) {

    for (int j = 1; j <= 5; j++) {

        System.out.printf("%4d", i * j);

    }

    System.out.println();

}
```

---

# Enhanced for Loop (For-Each)

Used for arrays and collections.

Syntax

```java
for (dataType variable : collection) {

}
```

Example

```java
int[] numbers = {10, 20, 30, 40};

for (int number : numbers) {
    System.out.println(number);
}
```

Output

```
10
20
30
40
```

---

# When to Use Enhanced for

Use it when:

- Reading every element.
- You do not need the index.

Do not use it when:

- You need the position of each element.
- You need to modify elements by index.

---

# Common Loop Patterns

## Pattern 1 – Sum

```java
int sum = 0;

for (int i = 1; i <= 100; i++) {
    sum += i;
}
```

---

## Pattern 2 – Count

```java
int count = 0;

for (int i = 1; i <= 20; i++) {

    if (i % 2 == 0) {
        count++;
    }

}
```

---

## Pattern 3 – Maximum

```java
int[] numbers = {5, 18, 2, 40};

int max = numbers[0];

for (int number : numbers) {

    if (number > max) {
        max = number;
    }

}
```

---

## Pattern 4 – Minimum

```java
int min = numbers[0];

for (int number : numbers) {

    if (number < min) {
        min = number;
    }

}
```

---

## Pattern 5 – Search

```java
boolean found = false;

for (int number : numbers) {

    if (number == 18) {
        found = true;
        break;
    }

}
```

---

# Labeled Loops

Java supports loop labels.

Example

```java
outer:

for (int i = 0; i < 5; i++) {

    for (int j = 0; j < 5; j++) {

        if (j == 2) {
            break outer;
        }

    }

}
```

Labels are rarely used in professional Java code.

---

# Time Complexity (Introduction)

One loop

```java
for (...) {

}
```

Complexity

```
O(n)
```

---

Nested loops

```java
for (...) {

    for (...) {

    }

}
```

Complexity

```
O(n²)
```

As `n` grows larger, nested loops become much slower.

---

# Choosing the Right Loop

| Situation | Best Choice |
|-----------|-------------|
| Unknown repetitions | while |
| Execute at least once | do...while |
| Known repetitions | for |
| Traverse arrays/collections | Enhanced for |

---

# Common Mistakes

## Forgetting the Update

```java
while (i <= 5) {

}
```

Infinite loop.

---

## Wrong Condition

```java
for (int i = 10; i <= 1; i--)
```

The condition is false immediately.

Correct

```java
for (int i = 10; i >= 1; i--)
```

---

## Off-by-One Error

Incorrect

```java
for (int i = 0; i <= array.length; i++)
```

Correct

```java
for (int i = 0; i < array.length; i++)
```

Remember:

```
Last index = length - 1
```

---

## Modifying the Loop Variable

Avoid

```java
for (int i = 0; i < 10; i++) {

    i += 3;

}
```

This makes code difficult to understand.

---

# Best Practices

- Use the right loop for the task.
- Keep loop bodies small and readable.
- Declare loop variables inside the `for` statement when possible.
- Avoid unnecessary nested loops.
- Use descriptive variable names (`row`, `column`, `studentIndex`) when appropriate.
- Always use braces, even for single statements.

---

# Java vs JavaScript

The syntax is almost identical.

Java

```java
for (int i = 0; i < 5; i++) {

}
```

JavaScript

```javascript
for (let i = 0; i < 5; i++) {

}
```

The major difference is Java's strong typing.

---

# Interview Notes

## Difference between while and do...while

**while**

- Condition checked first.
- May execute zero times.

**do...while**

- Executes first.
- Always runs at least once.

---

## Difference between break and continue

`break`

Stops the loop completely.

`continue`

Skips the current iteration.

---

## Which loop is used most often?

The `for` loop is the most common because many programming tasks involve a known number of iterations.

---

## When should I use an enhanced for loop?

When reading every element of an array or collection and the index is not needed.

---

# Summary

You should now understand:

- ✅ while loop
- ✅ do...while loop
- ✅ for loop
- ✅ Enhanced for loop
- ✅ break
- ✅ continue
- ✅ Nested loops
- ✅ Loop patterns (sum, count, search, max, min)
- ✅ Variable scope
- ✅ Infinite loops
- ✅ Time complexity basics
- ✅ Common mistakes
- ✅ Best practices

---

# Key Takeaways

- Loops allow code to repeat efficiently.
- Every loop has an initialization, a condition, and an update.
- Choose the loop that best matches the problem.
- Use `break` to exit a loop early.
- Use `continue` to skip an iteration.
- Enhanced `for` loops simplify array and collection traversal.
- Be careful of infinite loops and off-by-one errors.
- Understanding loops is essential before learning arrays, methods, object-oriented programming, and algorithms.