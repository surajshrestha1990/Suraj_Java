package CoreJava;/*
 * Exception Handling in Java
 * --------------------------------
 * 1. Try-Catch-Finally - Handling exceptions gracefully.
 * 2. Throw & Throws - Throwing custom exceptions.
 * 3. Custom Exceptions - Creating user-defined exceptions.
 *
 * Key Points:
 * - Java uses exceptions to handle runtime errors.
 * - 'try' block contains the code that may throw an exception.
 * - 'catch' block handles specific exceptions.
 * - 'finally' block always executes (whether exception occurs or not).
 */

// 1. Try-Catch-Finally Example
class TryCatchDemo {
    public static void divide(int a, int b) {
        try {
            int result = a / b; // May throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}

// 2. Throw & Throws Example
class ThrowExample {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Access denied - You must be 18 or older.");
        } else {
            System.out.println("Access granted.");
        }
    }
}

// 3. Custom Exception Example
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class CustomExceptionDemo {
    static void validate(int number) throws CustomException {
        if (number < 0) {
            throw new CustomException("Negative numbers are not allowed!");
        } else {
            System.out.println("Valid number: " + number);
        }
    }
}

public class _7_ExceptionHandling {
    public static void main(String[] args) {
        // Try-Catch-Finally Demo
        TryCatchDemo.divide(10, 2);
        TryCatchDemo.divide(10, 0);

        // Throw & Throws Demo
        try {
            ThrowExample.checkAge(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Custom Exception Demo
        try {
            CustomExceptionDemo.validate(-5);
        } catch (CustomException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}
