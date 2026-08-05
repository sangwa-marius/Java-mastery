# Lesson 18 — Exception Handling

---

# Learning Objectives

By the end of this lesson, you should be able to:

- Understand what exceptions are.
- Distinguish between syntax, logical, and runtime errors.
- Read and interpret stack traces.
- Handle exceptions using `try`, `catch`, and `finally`.
- Throw exceptions using `throw`.
- Declare exceptions using `throws`.
- Explain checked vs unchecked exceptions.
- Create custom exception classes.
- Apply professional exception handling practices.

---

# 1. What is an Exception?

An **exception** is an object that represents an abnormal event that interrupts the normal execution of a program.

Example:

```java
int result = 10 / 0;
```

Output:

```
java.lang.ArithmeticException: / by zero
```

---

# 2. Types of Errors

## Syntax Errors

Detected during compilation.

Example:

```java
System.out.println("Hello")
```

Missing semicolon.

---

## Logical Errors

The program runs but produces incorrect results.

Example:

```java
double average = total * subjects;
```

instead of

```java
double average = total / subjects;
```

---

## Runtime Errors

Occur while the program is running.

Examples:

- Division by zero
- Invalid array index
- Null references
- Invalid user input

---

# 3. Common Runtime Exceptions

| Exception | Cause |
|-----------|-------|
| ArithmeticException | Division by zero |
| NullPointerException | Using a null reference |
| ArrayIndexOutOfBoundsException | Invalid array index |
| InputMismatchException | Wrong input type |
| IllegalArgumentException | Invalid method argument |
| IllegalStateException | Object is in an invalid state |

---

# 4. Exception Hierarchy

```
Object
   │
Throwable
├── Error
└── Exception
      │
      └── RuntimeException
            ├── ArithmeticException
            ├── NullPointerException
            ├── IllegalArgumentException
            ├── IllegalStateException
            └── InputMismatchException
```

---

# 5. Stack Trace

A stack trace shows:

- Exception type
- Exception message
- Where the exception occurred
- The sequence of method calls that led to the exception

Example:

```
Exception in thread "main"
java.lang.ArithmeticException: / by zero
    at Calculator.divide(Calculator.java:18)
    at Calculator.main(Calculator.java:30)
```

Read from top to bottom.

---

# 6. Stack Unwinding

When an exception occurs:

1. Java stops executing the current method.
2. Looks for a matching `catch`.
3. If not found, returns to the caller.
4. Continues until a handler is found.
5. If none exists, the program terminates.

This process is called **stack unwinding**.

---

# 7. try-catch

Syntax:

```java
try {

    // risky code

} catch (ExceptionType e) {

    // handle exception

}
```

Example:

```java
try {
    int number = input.nextInt();
} catch (InputMismatchException e) {
    System.out.println("Please enter a valid integer.");
}
```

---

# 8. Multiple Catch Blocks

```java
try {

}
catch (InputMismatchException e) {

}
catch (ArithmeticException e) {

}
```

Always place **specific exceptions before general ones**.

Incorrect:

```java
catch(Exception e){

}

catch(ArithmeticException e){

}
```

Correct:

```java
catch(ArithmeticException e){

}

catch(Exception e){

}
```

---

# 9. finally

A `finally` block executes whether or not an exception occurs.

```java
try {

}
catch(Exception e){

}
finally{

    System.out.println("Always runs.");

}
```

Typical use:

- Closing files
- Closing streams
- Closing database connections

---

# 10. The Exception Object

The variable in the catch block represents the exception object.

```java
catch(Exception e){

}
```

Useful methods:

```java
e.getMessage();
```

Returns the error message.

```java
e.printStackTrace();
```

Prints the full stack trace.

```java
e.getCause();
```

Returns the original cause if exception chaining is used.

---

# 11. throw

Used to explicitly create and throw an exception.

Syntax:

```java
throw new ExceptionType("message");
```

Example:

```java
if(age < 18){
    throw new IllegalArgumentException(
        "Age must be at least 18."
    );
}
```

---

# 12. throws

Used in the method declaration.

Syntax:

```java
public void readFile()
        throws IOException
```

Meaning:

"This method may throw this exception."

---

# 13. throw vs throws

| throw | throws |
|--------|---------|
| Throws an exception object | Declares possible exceptions |
| Used inside a method | Used in method declaration |
| Followed by an object | Followed by class names |

---

# 14. Exception Propagation

Exceptions move up the call stack until:

- They are caught.
- The program terminates.

Example:

```
main()
    ↓
login()
    ↓
validatePassword()
    ↓
Exception
```

---

# 15. Checked Exceptions

Checked exceptions are verified by the compiler.

Examples:

- IOException
- FileNotFoundException

Must be:

- caught, or
- declared using `throws`

---

# 16. Unchecked Exceptions

Unchecked exceptions extend `RuntimeException`.

Examples:

- ArithmeticException
- IllegalArgumentException
- NullPointerException

The compiler does not force you to handle them.

---

# 17. Custom Exceptions

Create your own exception by extending:

## Checked

```java
public class BookingException extends Exception {

    public BookingException(String message){
        super(message);
    }

}
```

## Unchecked

```java
public class InvalidPriceException
        extends RuntimeException {

    public InvalidPriceException(String message){
        super(message);
    }

}
```

---

# 18. Exception Hierarchies

Example:

```
ReservationException
│
├── SeatsUnavailableException
├── BookingClosedException
└── InvalidReservationException
```

Allows:

```java
catch(ReservationException e)
```

to catch all subclasses.

---

# 19. Exception Chaining

Preserve the original exception.

```java
throw new ReservationException(
    "Reservation failed.",
    e
);
```

Later:

```java
e.getCause();
```

returns the original exception.

---

# 20. try-with-resources

Preferred when using closeable resources.

Instead of:

```java
Scanner input = new Scanner(System.in);

try{

}
finally{

    input.close();

}
```

Use:

```java
try(Scanner input =
        new Scanner(System.in)){

}
```

Resources are closed automatically.

Works with classes implementing:

```
AutoCloseable
```

Examples:

- Scanner
- FileReader
- BufferedReader
- FileInputStream

---

# 21. Professional Practices

## Catch only what you can handle.

Good:

```java
catch(InputMismatchException e){

}
```

Avoid:

```java
catch(Exception e){

}
```

unless truly appropriate.

---

## Don't swallow exceptions.

Bad:

```java
catch(Exception e){

}
```

Always:

- recover,
- log,
- rethrow,
- or notify the user.

---

## Write meaningful messages.

Bad:

```java
throw new IllegalArgumentException(
    "Invalid"
);
```

Better:

```java
throw new IllegalArgumentException(
    "Price must be greater than zero."
);
```

---

## Don't expose technical details to users.

Bad:

```
SQLException:
Connection refused
```

Better:

```
Unable to complete your request.
Please try again later.
```

---

## Use exceptions for exceptional situations.

Good:

```java
if(balance < amount){
    throw new InsufficientFundsException(...);
}
```

Don't replace normal `if` statements with exceptions.

---

## Preserve the cause.

```java
throw new PaymentException(
    "Payment failed.",
    e
);
```

---

## Keep try blocks small.

Only include statements that may actually throw the exception you're handling.

---

## Catch specific exceptions before general ones.

Correct:

```java
catch(FileNotFoundException e){

}
catch(IOException e){

}
catch(Exception e){

}
```

---

# 22. Best Practices Summary

- Validate inputs early.
- Throw meaningful exceptions.
- Use custom exceptions when they express business rules.
- Catch exceptions only when you can recover.
- Prefer specific exception types.
- Use `try-with-resources`.
- Preserve exception causes.
- Never ignore exceptions silently.
- Separate user-friendly messages from developer diagnostics.

---

# Key Terms

| Term | Meaning |
|------|---------|
| Exception | Object representing an error |
| Throwable | Root of Java's exception hierarchy |
| Error | Serious JVM problem |
| Exception | Recoverable program issue |
| RuntimeException | Unchecked exception |
| Checked Exception | Compiler-enforced exception |
| Stack Trace | Sequence of method calls leading to an exception |
| Stack Unwinding | Searching back through the call stack for a handler |
| throw | Throw an exception |
| throws | Declare possible exceptions |
| try | Wrap risky code |
| catch | Handle an exception |
| finally | Code that always executes |
| try-with-resources | Automatically closes resources |
| Custom Exception | User-defined exception class |
| Exception Chaining | Wrapping one exception inside another |
| Exception Propagation | Exception moving up the call stack |

---

# Common Interview Questions

1. What is an exception?
2. Difference between checked and unchecked exceptions?
3. Difference between `throw` and `throws`?
4. Why does Java use exceptions?
5. What is stack unwinding?
6. What information does a stack trace provide?
7. When should you create a custom exception?
8. What is exception chaining?
9. Why use `try-with-resources`?
10. Why should specific exceptions be caught before general ones?
11. When should you use `finally`?
12. Why shouldn't exceptions be used for normal control flow?

---

# Lesson Summary

After completing this lesson, you can now:

- ✅ Understand Java's exception hierarchy.
- ✅ Identify runtime exceptions.
- ✅ Read and interpret stack traces.
- ✅ Handle exceptions with `try`, `catch`, and `finally`.
- ✅ Throw exceptions using `throw`.
- ✅ Declare exceptions using `throws`.
- ✅ Differentiate checked and unchecked exceptions.
- ✅ Build custom exception classes.
- ✅ Design exception hierarchies.
- ✅ Chain exceptions while preserving the original cause.
- ✅ Use `try-with-resources` for automatic resource management.
- ✅ Apply professional exception handling practices.

This completes **Lesson 18 – Exception Handling**, one of the most important topics in core Java and a fundamental skill for building reliable, maintainable applications.