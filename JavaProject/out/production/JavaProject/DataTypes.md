# Data Types in Java

Java is a strongly typed language, meaning every variable must have a declared data type. Data types in Java are divided into two main categories:

1. **Primitive Data Types**
2. **Non-Primitive Data Types (Reference Types)**

---

## 1. Primitive Data Types
Primitive data types are predefined by Java and represent basic values. They are stored directly in memory and are not objects.

### Table of Primitive Data Types

| **Data Type** | **Size (in bits)** | **Default Value** | **Range**                                | **Example**              |
|---------------|--------------------|-------------------|------------------------------------------|--------------------------|
| `byte`        | 8                  | 0                 | -128 to 127                              | `byte b = 100;`          |
| `short`       | 16                 | 0                 | -32,768 to 32,767                        | `short s = 1000;`        |
| `int`         | 32                 | 0                 | -2³¹ to 2³¹-1                            | `int i = 100000;`        |
| `long`        | 64                 | 0L                | -2⁶³ to 2⁶³-1                            | `long l = 100000L;`      |
| `float`       | 32                 | 0.0f              | Approximately ±3.4e-38 to ±3.4e+38       | `float f = 10.5f;`       |
| `double`      | 64                 | 0.0d              | Approximately ±1.7e-308 to ±1.7e+308     | `double d = 10.5;`       |
| `char`        | 16                 | '\u0000'          | 0 to 65,535 (unsigned)                   | `char c = 'A';`          |
| `boolean`     | 1                  | false             | `true` or `false`                        | `boolean b = true;`      |

### Key Points:
- **Default Values**: Primitive types have default values when used as instance variables (e.g., `int` defaults to `0`).
- **Memory Efficiency**: Primitive types are faster and use less memory than non-primitive types.
- **No Methods**: Primitive types are not objects and do not have methods.

---

## 2. Non-Primitive Data Types (Reference Types)
Non-primitive data types are created by the programmer and are not predefined. They store references (memory addresses) to objects.

### Types of Non-Primitive Data Types
1. **Classes**:
    - Predefined classes like `String`, `Integer`, etc.
    - Custom classes created by the programmer.
    - Example: `String str = "Hello, Java!";`

2. **Interfaces**:
    - Used to define a contract for classes.
    - Example: `List<String> list = new ArrayList<>();`

3. **Arrays**:
    - Used to store multiple values of the same type.
    - Example: `int[] arr = {1, 2, 3};`

### Key Points:
- **Default Value**: The default value for non-primitive types is `null`.
- **Methods**: Non-primitive types can have methods and properties.
- **Memory Allocation**: They are stored in the heap memory.

---

## Differences Between Primitive and Non-Primitive Data Types

| **Aspect**            | **Primitive Data Types**          | **Non-Primitive Data Types**       |
|------------------------|-----------------------------------|------------------------------------|
| **Definition**         | Predefined by Java                | Created by the programmer          |
| **Storage**            | Stored directly in memory         | Store references to objects        |
| **Default Value**      | Depends on the type (e.g., `0`)   | `null`                             |
| **Memory Usage**       | Low                               | High                               |
| **Speed**              | Faster                            | Slower                             |
| **Methods**            | No methods                        | Can have methods                   |

---

## Examples

### Primitive Data Types
```java
int age = 25;
double salary = 50000.50;
char grade = 'A';
boolean isJavaFun = true;

### Non-Primitive Data Types
java
Copy
String name = "John Doe";
int[] numbers = {1, 2, 3, 4, 5};
List<String> fruits = new ArrayList<>();
Key Notes
Type Casting: Primitive types support implicit and explicit type casting (e.g., int to double).

Wrapper Classes: Java provides wrapper classes (e.g., Integer, Double) to use primitive types as objects.

Memory Management: Primitive types are stored in the stack, while non-primitive types are stored in the heap.