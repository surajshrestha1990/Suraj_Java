# Primitive vs Non-Primitive Data Types in Java

| **Key Point**              | **Primitive Data Types**                                  | **Non-Primitive Data Types**                         |
|----------------------------|------------------------------------------------------------|------------------------------------------------------|
| **Definition**              | Simple, predefined types that represent single values.     | More complex data types that refer to objects or collections. |
| **Examples**                | `int`, `char`, `float`, `boolean`, `double`, `byte`, `short`, `long` | `String`, `Arrays`, `Classes`, `Interfaces`, `Enums`  |
| **Size**                    | Fixed size, depends on the type (e.g., `int` = 4 bytes).   | Size varies based on the object or array.            |
| **Memory Allocation**       | Stored directly in memory (stack memory).                 | Stored as references (on heap memory).               |
| **Default Value**           | Has default values: `0`, `false`, `null`, etc.             | Default value is `null` unless explicitly initialized. |
| **Value Storage**           | Stores actual values (data).                              | Stores references or memory addresses of objects.    |
| **Examples of Operations**  | Arithmetic operations (`+`, `-`, `*`, `/`, etc.).          | Method calls, object manipulations, or data access.  |
| **Inheritance**             | Cannot inherit or extend other types.                     | Can inherit and implement other classes/interfaces.  |
| **Nullability**             | Cannot be `null` (except `char`, which can be `'\u0000'`). | Can be `null` (for objects, arrays, etc.).           |
| **Storage**                 | Stored in stack memory, faster access.                    | Stored in heap memory, slower access compared to primitives. |
| **Examples in Code**        | `int age = 25;`, `char grade = 'A';`                       | `String name = "John";`, `int[] numbers = new int[5];` |
| **Type of Data**            | Stores only single values (e.g., number, character).       | Can store multiple values, complex data (objects, collections). |

---

### Summary:
- **Primitive Data Types**: Simple, predefined, and stored in stack memory (e.g., `int`, `char`). They store actual data and are more efficient in terms of memory and access speed.
- **Non-Primitive Data Types**: More complex types like classes, arrays, and interfaces. They store references to objects in heap memory and can hold multiple values or complex data structures.
