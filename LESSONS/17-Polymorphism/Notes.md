# Lesson 17 – Polymorphism, Abstract Classes & Interfaces

## Learning Objectives

By the end of this lesson, you should be able to:

- Explain what polymorphism is.
- Perform upcasting and understand dynamic method dispatch.
- Store different child objects in a single parent collection.
- Understand and safely use downcasting.
- Use the `instanceof` operator.
- Create and use abstract classes.
- Create and implement interfaces.
- Understand the difference between inheritance and interfaces.
- Apply all OOP concepts together to build flexible applications.

---

# 1. What is Polymorphism?

**Polymorphism** means **"many forms."**

In Java, it means:

> One parent reference can refer to many different child objects.

Example:

```java
Animal animal;

animal = new Dog();
animal = new Cat();
animal = new Bird();
```

The reference type remains the same, but the actual object changes.

---

# 2. Upcasting

Upcasting is assigning a child object to a parent reference.

```java
Animal animal = new Dog();
```

This happens automatically because a `Dog` **is an** `Animal`.

This is called **upcasting**.

---

# 3. Dynamic Method Dispatch

When an overridden method is called, Java chooses the implementation based on the **actual object**, not the reference type.

Example:

```java
Animal animal = new Dog();
animal.makeSound();
```

Output:

```
Woof!
```

Even though the reference is `Animal`, the object is a `Dog`.

---

# 4. Compile Time vs Runtime

### Compile Time

The compiler checks whether the method exists in the reference type.

### Runtime

Java decides which overridden method to execute based on the actual object.

---

# 5. Parent References

The reference type determines which methods are accessible.

Example:

```java
Animal animal = new Dog();
```

Allowed:

```java
animal.eat();
```

Not allowed:

```java
animal.bark();
```

unless `bark()` exists in `Animal`.

---

# 6. Polymorphic Collections

A collection can store different subclasses using the parent type.

Example:

```java
Animal[] animals = {

    new Dog(),
    new Cat(),
    new Bird()

};
```

Loop:

```java
for (Animal animal : animals) {
    animal.makeSound();
}
```

Each object executes its own implementation.

---

# 7. Benefits of Polymorphism

- Eliminates long `if` or `switch` statements.
- Makes code easier to extend.
- Supports cleaner design.
- Encourages reusable code.

---

# 8. Upcasting vs Downcasting

### Upcasting

Child → Parent

```java
Animal animal = new Dog();
```

Automatic and safe.

### Downcasting

Parent → Child

```java
Dog dog = (Dog) animal;
```

Requires an explicit cast.

---

# 9. The Danger of Downcasting

Incorrect casting causes a runtime exception.

Example:

```java
Animal animal = new Cat();

Dog dog = (Dog) animal;
```

Output:

```
ClassCastException
```

---

# 10. The `instanceof` Operator

Use `instanceof` before downcasting.

Classic syntax:

```java
if (animal instanceof Dog) {
    Dog dog = (Dog) animal;
}
```

Modern Java syntax:

```java
if (animal instanceof Dog dog) {
    dog.bark();
}
```

---

# 11. When Should You Downcast?

Downcasting should be **rare**.

Frequent downcasting often indicates that the parent class is missing important behaviour.

Prefer polymorphism whenever possible.

---

# 12. Abstract Classes

An **abstract class** is an incomplete class that cannot be instantiated.

Example:

```java
public abstract class Shape {

}
```

Illegal:

```java
new Shape();
```

Legal:

```java
Shape shape = new Circle();
```

---

# 13. Why Use Abstract Classes?

Use abstract classes when:

- A parent object should never exist by itself.
- Subclasses share fields.
- Subclasses share behaviour.
- Some behaviour must be implemented differently.

Examples:

- Shape
- Vehicle
- Employee
- PaymentMethod

---

# 14. Abstract Methods

Abstract methods have **no implementation**.

Example:

```java
public abstract void draw();
```

Every concrete subclass must override the method.

---

# 15. Rules for Abstract Classes

If a class contains an abstract method:

```java
public abstract void move();
```

the class itself must also be abstract.

---

# 16. Abstract Classes Can Contain

- Constructors
- Fields
- Getters and setters
- Implemented methods
- Abstract methods

Example:

```java
public abstract class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();

}
```

---

# 17. Interfaces

An **interface** represents a capability or contract.

Example:

```java
public interface Chargeable {

    void charge();

}
```

Interfaces describe **what an object can do**, not what it is.

---

# 18. Implementing an Interface

Classes use the `implements` keyword.

Example:

```java
public class Laptop implements Chargeable {

    @Override
    public void charge() {
        System.out.println("Charging...");
    }

}
```

---

# 19. Multiple Interfaces

Java allows multiple interface implementation.

Example:

```java
public class SmartPhone
        implements Chargeable,
                   WiFiEnabled,
                   Updatable {

}
```

A class may implement many interfaces.

---

# 20. Extending a Class and Implementing Interfaces

A class can do both.

Example:

```java
public class SmartWatch
        extends SmartDevice
        implements Chargeable, WiFiEnabled {

}
```

Rules:

- Only one superclass.
- Multiple interfaces allowed.

---

# 21. Interface Constants

All interface variables are automatically:

```java
public static final
```

Example:

```java
public interface Network {

    int DEFAULT_PORT = 8080;

}
```

---

# 22. Default Methods

Interfaces can contain implemented methods using `default`.

Example:

```java
default void disconnect() {
    System.out.println("Disconnected.");
}
```

Implementing classes inherit the default implementation unless they override it.

---

# 23. Static Methods in Interfaces

Interfaces can also contain static methods.

Example:

```java
public interface TemperatureConverter {

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

}
```

Call:

```java
TemperatureConverter.celsiusToFahrenheit(25);
```

---

# 24. Abstract Class vs Interface

| Abstract Class | Interface |
|----------------|-----------|
| Represents an identity | Represents a capability |
| Uses `extends` | Uses `implements` |
| Can have constructors | Cannot have constructors |
| Can have instance fields | Constants only |
| One parent only | Multiple interfaces allowed |
| Shared state and behaviour | Behaviour contract |

---

# 25. When to Use Which?

### Use an Abstract Class

When classes share:

- Fields
- Constructors
- Common methods

Examples:

- Vehicle
- Employee
- Shape

---

### Use an Interface

When unrelated classes share an ability.

Examples:

- Chargeable
- Runnable
- Comparable
- WiFiEnabled

---

# 26. Programming to Interfaces

Instead of:

```java
ArrayList<String> names = new ArrayList<>();
```

Prefer:

```java
List<String> names = new ArrayList<>();
```

This allows the implementation to change without affecting the rest of the program.

---

# 27. OOP Design Questions

When designing software, ask:

### Is this describing what something **is**?

Use inheritance.

Example:

```
Dog → Animal
```

---

### Is this describing what something **can do**?

Use an interface.

Example:

```
Chargeable
```

---

### Should this object exist by itself?

If **no**, use an abstract class.

Example:

```
Shape
Vehicle
PaymentMethod
```

---

### Does every child behave differently?

Override the method.

Example:

```java
performTask()
```

---

### Can polymorphism replace a long `if` statement?

Usually yes.

---

# 28. Best Practices

- Use polymorphism instead of checking object types.
- Downcast only when necessary.
- Keep parent classes focused on shared behaviour.
- Use interfaces for capabilities.
- Use abstract classes for incomplete concepts.
- Prefer parent or interface references over concrete classes.
- Follow the **Open/Closed Principle**:
  - Open for extension.
  - Closed for modification.

---

# Key Terms

| Term | Meaning |
|------|---------|
| Polymorphism | One reference, many object forms |
| Upcasting | Child object assigned to a parent reference |
| Downcasting | Parent reference cast to a child type |
| Dynamic Method Dispatch | Runtime selection of overridden methods |
| `instanceof` | Checks an object's type before casting |
| Abstract Class | Cannot be instantiated; intended for inheritance |
| Abstract Method | Method with no implementation |
| Interface | A contract describing capabilities |
| `implements` | Used when implementing an interface |
| Default Method | Interface method with an implementation |
| Static Interface Method | Utility method belonging to the interface |

---

# Summary

Lesson 17 completed the core Object-Oriented Programming concepts in Java.

You learned how to:

- Create flexible class hierarchies.
- Use inheritance effectively.
- Apply polymorphism to simplify code.
- Store different objects in the same collection.
- Safely perform downcasting.
- Create abstract classes and abstract methods.
- Design and implement interfaces.
- Separate identity from capability.
- Program to interfaces rather than implementations.
- Combine all OOP concepts into clean, extensible designs.

These concepts form the foundation of professional Java development and are used extensively in enterprise frameworks, desktop applications, Android development, and backend systems.

---

# Next Lesson

## Lesson 18 — Exception Handling

Topics include:

- What exceptions are
- The exception hierarchy
- `try`, `catch`, and `finally`
- `throw` and `throws`
- Checked vs unchecked exceptions
- Creating custom exceptions
- Best practices for robust error handling