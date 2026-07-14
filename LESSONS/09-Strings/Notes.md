# Lesson 09 – Strings

## What is a String?

A **String** is a sequence of characters used to store and manipulate text.

Examples:

- Names
- Emails
- Passwords
- Addresses
- Messages
- File names

Example

```java
String name = "Marius";

System.out.println(name);
```

Output

```
Marius
```

---

# String vs char

Many beginners confuse these two.

## char

Stores **one** character.

```java
char grade = 'A';
```

Notice the **single quotes (' ')**.

---

## String

Stores **multiple** characters (including one character).

```java
String grade = "A";
```

Notice the **double quotes (" ")**.

---

Comparison

| char | String |
|------|--------|
| Stores one character | Stores multiple characters |
| Uses single quotes | Uses double quotes |
| Primitive type | Reference type (Object) |

Examples

```java
char letter = 'M';

String name = "Marius";
```

---

# Creating Strings

## Method 1 (Recommended)

```java
String city = "Kigali";
```

---

## Method 2

```java
String city = new String("Kigali");
```

This works, but is rarely used.

In professional Java code, you'll almost always see:

```java
String city = "Kigali";
```

---

# String is an Object

Unlike `int`, `double`, and `char`, a String is **not** a primitive type.

That means Strings have methods.

Example

```java
String name = "Java";

System.out.println(name.length());
```

Output

```
4
```

---

# Common String Methods

## 1. length()

Returns the number of characters.

```java
String word = "Programming";

System.out.println(word.length());
```

Output

```
11
```

---

## 2. toUpperCase()

Converts all letters to uppercase.

```java
String language = "java";

System.out.println(language.toUpperCase());
```

Output

```
JAVA
```

---

## 3. toLowerCase()

```java
String text = "HELLO";

System.out.println(text.toLowerCase());
```

Output

```
hello
```

---

## 4. charAt()

Returns the character at a specific index.

```java
String name = "Marius";

System.out.println(name.charAt(0));
```

Output

```
M
```

---

Indexes start at **0**.

```
M a r i u s
0 1 2 3 4 5
```

---

## 5. indexOf()

Returns the position of a character or substring.

```java
String word = "Programming";

System.out.println(word.indexOf('g'));
```

Output

```
3
```

If the value is not found:

```java
System.out.println(word.indexOf('z'));
```

Output

```
-1
```

---

## 6. contains()

Checks whether a String contains another String.

```java
String email = "marius@gmail.com";

System.out.println(email.contains("@"));
```

Output

```
true
```

---

## 7. startsWith()

```java
String url = "https://openai.com";

System.out.println(url.startsWith("https"));
```

Output

```
true
```

---

## 8. endsWith()

```java
String file = "Notes.pdf";

System.out.println(file.endsWith(".pdf"));
```

Output

```
true
```

---

## 9. substring()

Extracts part of a String.

```java
String word = "Programming";

System.out.println(word.substring(3));
```

Output

```
gramming
```

Example

```java
System.out.println(word.substring(0, 7));
```

Output

```
Program
```

The ending index is **exclusive**.

---

## 10. replace()

```java
String sentence = "I like Java";

System.out.println(sentence.replace("Java", "Python"));
```

Output

```
I like Python
```

---

## 11. trim()

Removes spaces from the beginning and end.

```java
String text = "   Hello Java   ";

System.out.println(text.trim());
```

Output

```
Hello Java
```

---

# String Comparison

This is one of the **most important Java concepts**.

## Incorrect

```java
String a = "Java";
String b = "Java";

if (a == b) {

}
```

Although this may appear to work in some cases, **do not use `==` to compare String contents**.

---

## Correct

```java
if (a.equals(b)) {
    System.out.println("Equal");
}
```

Always use:

```java
.equals()
```

to compare String contents.

---

# equalsIgnoreCase()

Ignores uppercase and lowercase differences.

```java
String password = "JAVA";

System.out.println(password.equalsIgnoreCase("java"));
```

Output

```
true
```

---

# String Concatenation

Joining Strings together.

```java
String first = "Marius";
String last = "Sangwa";

System.out.println(first + " " + last);
```

Output

```
Marius Sangwa
```

---

You can also combine numbers.

```java
int age = 21;

System.out.println("Age: " + age);
```

Output

```
Age: 21
```

---

# Escape Characters

## New Line

```java
System.out.println("Hello\nWorld");
```

Output

```
Hello
World
```

---

## Tab

```java
System.out.println("Java\tPython");
```

Output

```
Java    Python
```

---

## Double Quote

```java
System.out.println("He said \"Hello\"");
```

Output

```
He said "Hello"
```

---

## Backslash

```java
System.out.println("C:\\Users\\Marius");
```

Output

```
C:\Users\Marius
```

---

# String Immutability

Strings are **immutable**.

That means they **cannot be changed after they are created**.

Example

```java
String language = "Java";

language.toUpperCase();

System.out.println(language);
```

Output

```
Java
```

Notice:

```
language
```

did not change.

Correct:

```java
language = language.toUpperCase();
```

Output

```
JAVA
```

---

# Why is String Immutable?

Advantages:

- Safer
- Faster
- Better memory usage
- Thread-safe
- Secure for passwords, file paths, and URLs

---

# StringBuilder

If you need to modify text many times, use `StringBuilder`.

Example

```java
StringBuilder builder = new StringBuilder();

builder.append("Hello");
builder.append(" ");
builder.append("Java");

System.out.println(builder);
```

Output

```
Hello Java
```

Unlike String, `StringBuilder` is **mutable**.

---

# String vs StringBuilder

| String | StringBuilder |
|---------|---------------|
| Immutable | Mutable |
| Creates new objects when modified | Modifies the same object |
| Best for fixed text | Best for frequently changing text |

---

# Common Mistakes

## Using ==

Incorrect

```java
if (name == "John")
```

Correct

```java
if (name.equals("John"))
```

---

## Forgetting Index Starts at Zero

```java
String word = "Java";

word.charAt(1);
```

Returns

```
a
```

not

```
J
```

---

## Index Out of Bounds

```java
word.charAt(10);
```

Produces

```
StringIndexOutOfBoundsException
```

Always ensure the index is valid.

---

## Forgetting Strings are Immutable

Incorrect

```java
text.toUpperCase();
```

Correct

```java
text = text.toUpperCase();
```

---

# Best Practices

- Use `equals()` to compare Strings.
- Use `equalsIgnoreCase()` when case should be ignored.
- Use `trim()` when processing user input.
- Use meaningful variable names.
- Use `StringBuilder` for repeated modifications.
- Avoid creating unnecessary String objects.

---

# Java vs JavaScript

## Java

```java
String name = "Java";
```

Comparison

```java
name.equals("Java")
```

---

## JavaScript

```javascript
let name = "Java";
```

Comparison

```javascript
name === "Java"
```

Java requires `.equals()` because Strings are objects.

---

# Interview Notes

### Why not use `==`?

`==` compares references.

`equals()` compares contents.

---

### Are Strings mutable?

No.

Strings are immutable.

---

### When should you use StringBuilder?

When repeatedly modifying text, especially inside loops.

---

### What does `length()` return?

The number of characters in the String.

---

### Difference between `char` and `String`

- `char` stores one character.
- `String` stores multiple characters.

---

# Summary

You should now understand:

- ✅ What a String is
- ✅ String vs char
- ✅ Creating Strings
- ✅ Common String methods
- ✅ Concatenation
- ✅ Escape characters
- ✅ String comparison
- ✅ String immutability
- ✅ StringBuilder
- ✅ Common mistakes
- ✅ Best practices

---

# Key Takeaways

- A `String` stores text.
- Always use `equals()` to compare String contents.
- Strings are immutable.
- `StringBuilder` is mutable and efficient for repeated modifications.
- Indexes start at **0**.
- Learn common String methods—they are used in almost every Java application.
- Mastering Strings is essential before moving on to arrays, file handling, collections, and object-oriented programming.