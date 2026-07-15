# Lesson 12 – Methods

## Learning Objectives

By the end of this lesson, you should be able to:

- Create your own methods.
- Call methods from `main()` and other methods.
- Pass data to methods using parameters.
- Return values using the `return` keyword.
- Understand the difference between `void` and non-`void` methods.
- Understand variable scope.
- Understand the Call Stack and Stack Trace.
- Create overloaded methods.
- Write clean, reusable, and maintainable code.

---

# 1. What is a Method?

A **method** is a reusable block of code that performs a specific task.

Instead of writing the same code repeatedly, write it once inside a method and call it whenever needed.

Example:

```java
public static void greet() {
    System.out.println("Welcome!");
}
```

Calling the method:

```java
greet();
```

Output:

```
Welcome!
```

---

# 2. Why Use Methods?

Methods help us:

- Reduce duplicate code
- Organize programs
- Improve readability
- Make debugging easier
- Encourage code reuse
- Make large programs manageable

Example:

Instead of writing:

```java
System.out.println("==========");
System.out.println("BANK");
System.out.println("==========");
```

multiple times, create:

```java
public static void printHeader() {
    System.out.println("==========");
    System.out.println("BANK");
    System.out.println("==========");
}
```

Then simply call:

```java
printHeader();
```

---

# 3. Method Syntax

General syntax:

```java
public static returnType methodName(parameters) {

    // method body

}
```

Example:

```java
public static void greet() {

    System.out.println("Hello!");

}
```

---

# 4. Parts of a Method

Example:

```java
public static int add(int a, int b) {

    return a + b;

}
```

| Part | Description |
|------|-------------|
| `public` | Access modifier |
| `static` | Belongs to the class |
| `int` | Return type |
| `add` | Method name |
| `(int a, int b)` | Parameters |
| `{}` | Method body |
| `return` | Sends a value back |

---

# 5. Calling a Method

A method does **not** execute until it is called.

Example:

```java
public static void greet() {
    System.out.println("Hello");
}

public static void main(String[] args) {
    greet();
}
```

---

# 6. void Methods

A `void` method performs an action but returns nothing.

Example:

```java
public static void printMenu() {
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
}
```

You cannot store its result.

Incorrect:

```java
int x = printMenu();
```

---

# 7. Parameters

Parameters allow methods to receive data.

Example:

```java
public static void greet(String name) {

    System.out.println("Hello " + name);

}
```

Calling:

```java
greet("Marius");
```

Output:

```
Hello Marius
```

---

# 8. Multiple Parameters

Example:

```java
public static void introduce(String name, int age) {

    System.out.println(name + " is " + age);

}
```

Calling:

```java
introduce("Alice", 20);
```

---

# 9. Parameters vs Arguments

Parameter

A variable declared in the method definition.

```java
public static void greet(String name)
```

Argument

The actual value passed.

```java
greet("John");
```

| Parameter | Argument |
|-----------|----------|
| Variable | Actual value |
| In method definition | In method call |

---

# 10. Return Values

Methods can return a value.

Example:

```java
public static int add(int a, int b) {

    return a + b;

}
```

Using it:

```java
int result = add(5, 10);
```

---

# 11. return Keyword

`return` does two things:

1. Sends a value back.
2. Immediately ends the method.

Example:

```java
return total;
```

Nothing after `return` executes.

---

# 12. Return Types

Methods can return:

```java
int
double
String
char
boolean
long
float
```

Examples:

```java
public static String getName() {
    return "Marius";
}
```

```java
public static boolean isAdult(int age) {
    return age >= 18;
}
```

---

# 13. Returning vs Printing

Printing

```java
System.out.println(total);
```

Returning

```java
return total;
```

Returning is preferred because the value can be reused.

---

# 14. Variable Scope

Variables only exist inside the block where they are declared.

Example:

```java
public static void greet() {

    String name = "John";

}
```

`name` cannot be accessed outside `greet()`.

---

# 15. Parameter Scope

Parameters are local variables.

Example:

```java
public static void square(int number)
```

`number` only exists inside `square()`.

---

# 16. Variable Lifetime

Local variables are created when a method starts.

They are destroyed when the method finishes.

---

# 17. The Call Stack

The **Call Stack** is a memory structure that keeps track of active method calls.

Example:

```java
main()
```

calls

```java
first()
```

which calls

```java
second()
```

The stack becomes:

```
Top
-------
second()
first()
main()
-------
Bottom
```

When `second()` finishes:

```
Top
-------
first()
main()
-------
Bottom
```

When `first()` finishes:

```
Top
-------
main()
-------
Bottom
```

The stack is always **Last In, First Out (LIFO)**.

---

# 18. Stack Trace

A **Stack Trace** is printed when an exception occurs.

Example:

```
Exception in thread "main"

at Main.third(Main.java:15)

at Main.second(Main.java:10)

at Main.first(Main.java:5)

at Main.main(Main.java:20)
```

Read it as:

- Error happened in `third()`.
- `third()` was called by `second()`.
- `second()` was called by `first()`.
- `first()` was called by `main()`.

---

# 19. Method Overloading

Method Overloading means having multiple methods with the same name but different parameter lists.

Example:

```java
public static int add(int a, int b)

public static double add(double a, double b)

public static int add(int a, int b, int c)
```

Java chooses the correct method based on:

- Number of parameters
- Parameter types
- Parameter order

---

# 20. Invalid Overloading

Changing only the return type is NOT overloading.

Incorrect:

```java
public static int test(int x)

public static double test(int x)
```

Compile Error.

---

# 21. Method Naming

Use descriptive camelCase names.

Good:

```java
calculateAverage()

withdrawMoney()

findStudent()

printReceipt()
```

Bad:

```java
test()

abc()

method1()

doStuff()
```

---

# 22. Best Practices

✔ One method = one responsibility.

✔ Keep methods short.

✔ Use meaningful names.

✔ Avoid duplicate code.

✔ Return values instead of printing whenever possible.

✔ Pass data using parameters.

✔ Create one `Scanner` for keyboard input.

✔ Close the `Scanner` only once at the end of the program.

✔ Validate user input.

✔ Keep related methods together.

---

# Common Beginner Mistakes

### Closing Scanner Too Early

Incorrect:

```java
input.close();
```

inside helper methods.

Correct:

Close it once in `main()`.

---

### Pass-by-Value

Primitive variables are copied.

```java
change(number);
```

does NOT change the original variable.

---

### Wrong Average Formula

Incorrect:

```java
(mark1 * mark2 * mark3) / 3
```

Correct:

```java
(mark1 + mark2 + mark3) / 3
```

---

### Returning Wrong Type

Incorrect:

```java
public static int getName() {

    return "John";

}
```

Compile Error.

---

### Returning from void

Incorrect:

```java
public static void greet() {

    return "Hello";

}
```

---

# Method Checklist

Before writing a method, ask yourself:

- Does it perform one job?
- Is the name descriptive?
- Does it need parameters?
- Should it return a value?
- Can it be reused?
- Is it short and readable?

---

# Key Terms

| Term | Meaning |
|------|---------|
| Method | Reusable block of code |
| Parameter | Variable in method definition |
| Argument | Actual value passed |
| Return Type | Data type returned |
| `void` | Returns nothing |
| `return` | Sends a value back |
| Scope | Where a variable exists |
| Call Stack | Tracks active method calls |
| Stack Trace | Method call history after an exception |
| Method Overloading | Same method name, different parameters |

---

# Summary

After this lesson you can:

- Create methods.
- Call methods.
- Pass parameters.
- Return values.
- Use `void`.
- Use `return`.
- Understand local scope.
- Understand the Call Stack.
- Read basic Stack Traces.
- Overload methods.
- Write clean and reusable Java programs.

---

# Next Lesson

**Lesson 13 – Arrays**

You'll learn how to store multiple values in a single variable using arrays, making programs shorter, cleaner, and much more powerful.