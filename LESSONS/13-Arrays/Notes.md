# Lesson 13 - Arrays

## What is an Array?

An array is a collection of elements of the same data type stored under one variable name.

Example:

```java
int[] numbers = {10, 20, 30, 40};
```

Arrays make it easier to store and process large amounts of related data.

---

# Array Index

Arrays start at index **0**.

Example:

Index

0   1   2   3

Value

10  20  30  40

Accessing:

```java
System.out.println(numbers[0]); // 10
System.out.println(numbers[2]); // 30
```

---

# Creating Arrays

### Method 1

```java
int[] numbers = {10,20,30};
```

### Method 2

```java
int[] numbers = new int[5];
```

Default values:

| Type | Default |
|------|---------|
| int | 0 |
| double | 0.0 |
| boolean | false |
| char | '\u0000' |
| String | null |

---

# Accessing Elements

```java
numbers[1]
```

Changing values

```java
numbers[1] = 100;
```

---

# length Property

```java
numbers.length
```

Returns the size of the array.

---

# Traversing Arrays

Traditional loop

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

Enhanced for loop

```java
for (int number : numbers) {
    System.out.println(number);
}
```

Use enhanced loops when you only need the values.

Use traditional loops when you need the index or want to modify elements.

---

# Reading User Input

```java
Scanner input = new Scanner(System.in);

int[] marks = new int[5];

for (int i = 0; i < marks.length; i++) {
    System.out.print("Enter mark: ");
    marks[i] = input.nextInt();
}
```

---

# Processing Arrays

## Sum

```java
int sum = 0;

for (int number : numbers) {
    sum += number;
}
```

---

## Average

```java
double average = (double) sum / numbers.length;
```

---

## Largest Value

```java
int largest = numbers[0];

for (int i = 1; i < numbers.length; i++) {

    if (numbers[i] > largest) {
        largest = numbers[i];
    }

}
```

---

## Smallest Value

```java
int smallest = numbers[0];

for (int i = 1; i < numbers.length; i++) {

    if (numbers[i] < smallest) {
        smallest = numbers[i];
    }

}
```

---

# Linear Search

Searches one element at a time.

```java
int position = -1;

for (int i = 0; i < numbers.length; i++) {

    if (numbers[i] == target) {

        position = i;
        break;

    }

}
```

For Strings

```java
names[i].equals(target)
```

Never use

```java
==
```

for String comparison.

---

# Passing Arrays to Methods

```java
public static int calculateSum(int[] numbers)
```

Call

```java
calculateSum(numbers);
```

---

# Returning Arrays

```java
public static int[] createArray() {

    int[] values = {1,2,3};

    return values;

}
```

---

# Enhanced For Loop

Syntax

```java
for (int value : numbers)
```

Advantages

- Cleaner
- Easier to read
- Less code

Limitations

- No index
- Cannot directly modify array elements

---

# Common Exceptions

## ArrayIndexOutOfBoundsException

Occurs when accessing an invalid index.

Example

```java
numbers[10]
```

when the array size is only 5.

---

# Best Practices

- Always use `array.length`.
- Start indexing at 0.
- Use meaningful variable names.
- Validate user input.
- Use methods to avoid code duplication.
- Prefer enhanced for loops for read-only traversal.

---

# Key Concepts Learned

- Arrays
- Indexes
- Initialization
- Traversal
- User Input
- Sum
- Average
- Maximum
- Minimum
- Linear Search
- Methods with Arrays
- Returning Arrays
- Enhanced For Loop

---

# Important Syntax

```java
int[] numbers = new int[5];
```

```java
numbers.length
```

```java
numbers[i]
```

```java
for (int i = 0; i < numbers.length; i++)
```

```java
for (int number : numbers)
```

```java
public static int calculateSum(int[] numbers)
```

```java
return numbers;
```

---

# End of Lesson 13

You are now ready for Lesson 14: Multidimensional Arrays.