package CoreJava;/*
 * Core Java Basics
 * -----------------
 * - JDK, JRE, JVM, JIT: Java execution environment
 * - Data Types: Primitive (byte, short, int, long, float, double, char, boolean)
 * - Non-Primitive Data Types: String, Arrays, Classes, Interfaces
 * - Variables: Local, Instance, Static
 * - Operators: Arithmetic, Relational, Logical, Bitwise, Assignment
 * - Type Casting: Implicit (Widening), Explicit (Narrowing)
 *
 * Key Important Points to Remember:
 * - Java is platform-independent due to JVM.
 * - All Java code runs inside a class.
 * - Primitive types store actual values, while non-primitive types store references.
 * - Default values: int = 0, float = 0.0, boolean = false, object references = null.
 * - Primitive data types CANNOT be null.
 * - Strings are immutable in Java.
 * - Arrays are fixed in size once declared.
 * - Local variables must be initialized before use.
 *
 * Primitive Data Types (Total: 8):
 * 1. byte  (1 byte)  - Stores whole numbers from -128 to 127
 * 2. short (2 bytes) - Stores whole numbers from -32,768 to 32,767
 * 3. int   (4 bytes) - Stores whole numbers from -2^31 to 2^31-1
 * 4. long  (8 bytes) - Stores whole numbers from -2^63 to 2^63-1 (suffix 'L')
 * 5. float (4 bytes) - Stores fractional numbers (suffix 'f')
 * 6. double (8 bytes) - Stores fractional numbers with double precision
 * 7. char  (2 bytes) - Stores a single character using Unicode
 * 8. boolean (1 bit) - Stores true or false values
 *
 * Java Execution Environment Hierarchy:
 * JDK (Java Development Kit)
 * │
 * ├── JRE (Java Runtime Environment)
 * │   │
 * │   ├── JVM (Java Virtual Machine)
 * │   │   ├── Class Loader
 * │   │   ├── Runtime Memory Areas (Heap, Stack, etc.)
 * │   │   ├── Execution Engine
 * │   │   │   ├── Interpreter
 * │   │   │   ├── JIT (Just-In-Time Compiler)
 * │   │   │   ├── Garbage Collector
 * │   │   │
 * │   │   ├── Native Interface (JNI)
 * │   │
 * │   ├── Java API (Core Libraries, JavaFX, etc.)
 * │
 * ├── Development Tools (Compiler, Debugger, etc.)
 */

// Java Class
public class _1_CoreJavaBasics {
    // Static variable (shared by all objects)
    static int staticVar = 10;
    // Instance variable (unique to each object)
    int instanceVar = 20;

    public void show() {
        int localVar = 30; // Local variable (only inside method)
        System.out.println("Local: " + localVar + ", Instance: " + instanceVar + ", Static: " + staticVar);
    }

    public static void main(String[] args) {
        // 1. JDK, JRE, JVM, JIT (No code - just theory)

        // 2. Primitive Data Types
        byte b = 127;
        short s = 32000;
        int num = 100;
        long bigNum = 999999L;
        float f = 10.5f;
        double d = 20.99;
        char c = 'A';
        boolean isTrue = true;

        System.out.println("Byte: " + b + ", Short: " + s + ", Int: " + num + ", Long: " + bigNum);
        System.out.println("Float: " + f + ", Double: " + d);
        System.out.println("Char: " + c + ", Boolean: " + isTrue);

        // 3. Non-Primitive Data Types
        String text = "Hello, Java!";
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("String: " + text);
        System.out.print("Array: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 4. Variables
        _1_CoreJavaBasics obj = new _1_CoreJavaBasics();
        obj.show();

        // 5. Operators
        int a = 10, x = 5;
        System.out.println("Sum: " + (a + x)); // Arithmetic (+)
        System.out.println("Greater? " + (a > x)); // Relational (>)
        System.out.println("Logical AND: " + (a > 5 && x < 10)); // Logical (&&)
        System.out.println("Bitwise AND: " + (a & x)); // Bitwise (&)

        // 6. Type Casting
        // Implicit (small to big - automatic)
        int smallNum = 50;
        double largeNum = smallNum;
        System.out.println("Implicit Casting: " + largeNum);

        // Explicit (big to small - manual)
        double bigValue = 99.99;
        int smallValue = (int) bigValue;
        System.out.println("Explicit Casting: " + smallValue);

        // 7. Nullability Check
        Integer refType = null; // Allowed, as Integer is non-primitive
        // int primitiveType = null; // NOT allowed, will cause an error
        System.out.println("Reference Type (Integer) can be null: " + refType);
    }
}
