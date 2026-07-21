# Lesson 15 – Object-Oriented Programming (OOP)

## Learning Objectives

In this lesson, you learned how to design software using Object-Oriented Programming (OOP). You explored how classes represent blueprints for objects, how objects store data and behavior, and how Java supports code organization through encapsulation, constructors, static members, and composition.

---

# 1. What is OOP?

Object-Oriented Programming is a programming paradigm that organizes software around **objects**.

An object combines:

- Data (fields)
- Behavior (methods)

Example:

```java
Car car = new Car();
```

The class is the blueprint, while the object is the actual instance created from that blueprint.

---

# 2. Classes

A class defines the structure of an object.

Example:

```java
public class Car {

    String brand;
    String model;

    void start() {
        System.out.println("Car started");
    }
}
```

A class contains:

- Fields (attributes)
- Methods (behavior)
- Constructors

---

# 3. Objects

Objects are created using the `new` keyword.

```java
Car car = new Car();
```

Each object has its own copy of instance fields.

---

# 4. Fields

Fields store the state of an object.

```java
private String owner;
private double balance;
```

Each object maintains its own values.

---

# 5. Methods

Methods define what an object can do.

```java
public void deposit(double amount) {
    balance += amount;
}
```

Methods may:

- Accept parameters
- Return values
- Modify object state

---

# 6. Constructors

Constructors initialize objects when they are created.

```java
public BankAccount(String owner, double balance) {
    this.owner = owner;
    this.balance = balance;
}
```

Characteristics:

- Same name as the class
- No return type
- Executed automatically when `new` is used

---

# 7. Constructor Overloading

A class may have multiple constructors with different parameter lists.

```java
public Book() {}

public Book(String title) {}

public Book(String title, double price) {}
```

This provides different ways to create objects.

---

# 8. The `this` Keyword

`this` refers to the current object.

```java
this.owner = owner;
```

It is commonly used to distinguish fields from parameters.

---

# 9. Encapsulation

Encapsulation protects object data by hiding fields.

Fields are usually declared as:

```java
private
```

Access is provided through methods.

Benefits:

- Protects data
- Prevents invalid values
- Improves maintainability
- Makes debugging easier

---

# 10. Getters

Getters provide read-only access to fields.

```java
public double getBalance() {
    return balance;
}
```

---

# 11. Setters

Setters modify fields while performing validation.

```java
public void setBalance(double balance) {

    if (balance > 0) {
        this.balance = balance;
    }
}
```

Not every field should have a setter.

---

# 12. Validation

Objects should validate their own data.

Examples:

- Price > 0
- Marks between 0 and 100
- Email contains "@"
- Name is not blank

Validation keeps objects in a valid state.

---

# 13. Static Fields

Static fields belong to the class instead of individual objects.

```java
private static int totalBooks;
```

All objects share one copy.

Typical uses:

- Counters
- Constants
- Shared configuration

---

# 14. Static Methods

Static methods belong to the class.

```java
Book.displayTotalBooks();
```

They do not require an object.

Static methods cannot directly access instance fields because no specific object exists.

---

# 15. Why `main()` is Static

Java must start executing before any objects exist.

```java
public static void main(String[] args)
```

Since `main()` belongs to the class, the JVM can call it without creating an object first.

---

# 16. Composition (Has-a Relationship)

Composition means one object contains another object.

Example:

```java
class Car {
    private Engine engine;
}
```

The relationship is:

> A Car **has an** Engine.

Other examples:

- Library has Books
- Hotel has Rooms
- Order has Products
- Smart Home has Devices

Composition models real-world ownership and collaboration between objects.

---

# 17. Composition vs Inheritance

Composition:

- Has-a relationship
- Objects contain other objects

Example:

```
Car has an Engine
```

Inheritance:

- Is-a relationship
- One class extends another

Example:

```
Dog is an Animal
```

A good rule:

- "Has-a" → Composition
- "Is-a" → Inheritance

---

# 18. Best Practices

- Keep fields private.
- Validate all incoming data.
- Use constructors to initialize required fields.
- Use `this` when assigning constructor parameters.
- Avoid unnecessary setters.
- Use static only for class-wide data or behavior.
- Prefer composition when modeling ownership.
- Keep each class responsible for a single concept.

---

# Key Terms

| Term | Meaning |
|------|---------|
| Class | Blueprint for objects |
| Object | Instance of a class |
| Instance | Another name for an object |
| Field | Variable belonging to an object |
| Method | Behavior of an object |
| Constructor | Special method that initializes an object |
| Overloading | Multiple methods/constructors with different parameters |
| `this` | Reference to the current object |
| Encapsulation | Hiding data behind methods |
| Getter | Reads a field |
| Setter | Modifies a field |
| Validation | Prevents invalid data |
| Static | Belongs to the class |
| Composition | One object contains another object |
| Has-a | Composition relationship |
| Is-a | Inheritance relationship |

---

# Summary

By the end of Lesson 15, you can:

- Design classes and create objects.
- Initialize objects with constructors.
- Overload constructors.
- Use `this` correctly.
- Protect object data with encapsulation.
- Implement getters and setters with validation.
- Use static fields and methods appropriately.
- Model real-world systems using composition.
- Decide when to use composition instead of inheritance.

This lesson provides the foundation for the remaining object-oriented topics, beginning with **Inheritance** in Lesson 16.