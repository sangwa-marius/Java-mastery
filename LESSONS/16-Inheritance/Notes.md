# Lesson 16 – Inheritance

## Learning Objectives

In this lesson, you learned how inheritance allows one class to reuse the fields and methods of another class. You also learned how Java initializes inherited objects, how method overriding works, and how the `final` keyword and `Object` class fit into Java's inheritance model.

---

# 1. What is Inheritance?

Inheritance is an Object-Oriented Programming (OOP) concept that allows one class to acquire the fields and methods of another class.

It promotes:

- Code reuse
- Better organization
- Easier maintenance
- Extensibility

Example:

```java
public class Animal {

    public void eat() {
        System.out.println("Eating...");
    }

}
```

```java
public class Dog extends Animal {

    public void bark() {
        System.out.println("Woof!");
    }

}
```

Here:

- `Animal` is the **superclass**
- `Dog` is the **subclass**

---

# 2. The `extends` Keyword

The `extends` keyword creates an inheritance relationship.

```java
public class Dog extends Animal {

}
```

Read this as:

> Dog **is an** Animal.

Inheritance should only be used for **is-a** relationships.

Examples:

- Dog is an Animal
- Car is a Vehicle
- Developer is an Employee

Do **not** use inheritance for **has-a** relationships.

Incorrect:

```
Car extends Engine
```

Correct:

```
Car has an Engine
```

---

# 3. Superclass and Subclass

Superclass (Parent Class)

Contains common fields and methods.

```java
public class Vehicle {

    protected String brand;

    public void startEngine() {
        System.out.println("Engine started.");
    }

}
```

Subclass (Child Class)

Inherits from the parent and adds specialized behavior.

```java
public class Car extends Vehicle {

    public void openTrunk() {
        System.out.println("Trunk opened.");
    }

}
```

---

# 4. What Gets Inherited?

A subclass inherits:

- Accessible fields
- Accessible methods

A subclass does **not** inherit:

- Constructors
- Private members (directly)

---

# 5. The `protected` Access Modifier

`protected` allows access:

- Inside the same class
- Inside subclasses
- Inside the same package

Example:

```java
protected String name;
```

Child class:

```java
System.out.println(name);
```

This works because `name` is `protected`.

---

# 6. Private vs Protected

| Modifier | Same Class | Subclass | Outside Class |
|-----------|:----------:|:--------:|:-------------:|
| private | ✅ | ❌ | ❌ |
| protected | ✅ | ✅ | ❌* |
| public | ✅ | ✅ | ✅ |

*Also accessible within the same package.

Best practice:

Keep fields `private` unless subclasses genuinely require direct access.

---

# 7. Constructors and Inheritance

Constructors are **not inherited**.

Every class has its own constructors.

Parent:

```java
public class Animal {

    public Animal(String name) {

    }

}
```

Child:

```java
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

}
```

---

# 8. The `super()` Keyword

`super()` calls the parent class constructor.

Example:

```java
public Dog(String name) {
    super(name);
}
```

It initializes the inherited portion of the object.

Rules:

- Must be the first statement in a constructor.
- Calls a parent constructor.

---

# 9. Constructor Chaining

When an object is created, constructors execute from the top of the inheritance hierarchy down to the child.

Example hierarchy:

```
LivingThing
      ▲
      │
   Animal
      ▲
      │
     Dog
```

Execution order:

```
LivingThing()
↓

Animal()
↓

Dog()
```

This process is called **constructor chaining**.

---

# 10. Automatic `super()`

If the parent class has a no-argument constructor:

```java
public Animal() {

}
```

Java automatically inserts:

```java
super();
```

If the parent has **only parameterized constructors**, you must call the appropriate constructor explicitly.

---

# 11. Method Overriding

Method overriding allows a child class to replace a method inherited from its parent.

Parent:

```java
public void makeSound() {
    System.out.println("Generic sound");
}
```

Child:

```java
@Override
public void makeSound() {
    System.out.println("Woof!");
}
```

Now the child provides its own implementation.

---

# 12. The `@Override` Annotation

`@Override` tells Java that a method is intended to override a parent method.

Benefits:

- Compiler checks correctness.
- Prevents spelling mistakes.
- Improves readability.

Always use `@Override` when overriding methods.

---

# 13. Rules for Overriding

An overriding method must have:

- The same method name.
- The same parameter list.
- A compatible return type.
- The same or broader access level.

Incorrect:

```java
protected void start()
```

if the parent method is

```java
public void start()
```

---

# 14. Overriding vs Overloading

## Overriding

- Parent and child classes
- Same method signature
- Runtime behavior

Example:

```
Animal

makeSound()

↓

Dog

makeSound()
```

## Overloading

- Same class
- Different parameter lists
- Compile-time behavior

Example:

```java
print()

print(String)

print(int)
```

---

# 15. The `super` Keyword (Methods)

A child can call the parent's implementation using:

```java
super.methodName();
```

Example:

```java
@Override
public void makeSound() {

    super.makeSound();

    System.out.println("Woof!");

}
```

This extends rather than completely replaces the parent's behavior.

---

# 16. The `final` Keyword

## Final Variables

Cannot be reassigned.

```java
final double PI = 3.14159;
```

---

## Final Methods

Cannot be overridden.

```java
public final void save() {

}
```

Useful when subclasses must not change important behavior.

---

## Final Classes

Cannot be extended.

```java
public final class Utility {

}
```

Attempting to inherit results in a compilation error.

---

# 17. The `Object` Class

Every class in Java automatically extends `Object`.

Even this:

```java
public class Car {

}
```

is treated as:

```java
public class Car extends Object {

}
```

`Object` is the root of Java's class hierarchy.

---

# 18. Common Methods from `Object`

Every Java object inherits methods such as:

```java
toString()

equals()

hashCode()

getClass()
```

These methods are available in every class.

---

# 19. Inheritance Hierarchy

Example:

```
                Object
                   ▲
                   │
               Vehicle
            ▲          ▲
           │            │
         Car      Motorcycle
```

Every inheritance chain ultimately leads back to `Object`.

---

# 20. Composition vs Inheritance

Composition:

- Has-a relationship

Examples:

- Car has an Engine
- Library has Books
- House has Rooms

Inheritance:

- Is-a relationship

Examples:

- Dog is an Animal
- Car is a Vehicle
- Developer is an Employee

A simple test:

If you can naturally say:

> "A ___ is a ___"

use inheritance.

If you can naturally say:

> "A ___ has a ___"

use composition.

---

# Best Practices

- Use inheritance only for genuine is-a relationships.
- Prefer composition for has-a relationships.
- Keep fields private whenever possible.
- Use `protected` only when subclasses require access.
- Always use `@Override` when overriding methods.
- Let parent constructors initialize parent fields.
- Place `super()` as the first statement in constructors.
- Use `final` to protect methods or classes that should not be modified.

---

# Key Terms

| Term | Meaning |
|------|---------|
| Inheritance | Acquiring fields and methods from another class |
| Superclass | Parent class |
| Subclass | Child class |
| extends | Creates an inheritance relationship |
| protected | Accessible by subclasses |
| super() | Calls the parent constructor |
| super.method() | Calls the parent version of a method |
| Constructor Chaining | Parent constructors execute before child constructors |
| Overriding | Replacing an inherited method |
| @Override | Indicates an overriding method |
| final Method | Cannot be overridden |
| final Class | Cannot be inherited |
| Object | Root class of every Java class |

---

# Summary

By the end of Lesson 16, you can:

- Create inheritance hierarchies using `extends`.
- Distinguish between superclasses and subclasses.
- Use `protected` appropriately.
- Initialize inherited objects with `super()`.
- Understand constructor chaining.
- Override methods correctly using `@Override`.
- Call parent implementations using `super.method()`.
- Use `final` to prevent inheritance or overriding.
- Explain the purpose of the `Object` class.
- Decide when to use inheritance and when to use composition.

This lesson completes the foundations of inheritance and prepares you for **Lesson 17 – Polymorphism**, where you'll learn how Java chooses which overridden method to execute at runtime.