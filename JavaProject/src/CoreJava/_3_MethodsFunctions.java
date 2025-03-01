package CoreJava;/*
 * Methods and Functions in Java
 * ---------------------------------
 * - Method Declaration: Defines a method with a name, return type, and parameters.
 * - Return Type: Specifies what the method returns (void if nothing is returned).
 * - Method Overloading: Defining multiple methods with the same name but different parameters.
 * - Pass-by-Value: Java passes copies of primitive data types.
 * - Pass-by-Reference (actually pass-by-value of reference): Objects are passed as references.
 *
 * Key Points to Remember:
 * - Methods help in code reusability and organization.
 * - Method overloading allows different versions of a method with different arguments.
 * - Java does NOT support pass-by-reference; object references are passed by value.
 */

public class _3_MethodsFunctions {

    // Method with no return type (void)
    public void greet() {
        System.out.println("Hello, Welcome to Java!");
    }

    // Method with return type
    public int add(int a, int b) {
        return a + b;
    }

    // Method Overloading (Same name, different parameters)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Pass-by-Value Example (Primitives)
    public void modifyValue(int num) {
        num = num + 10;
        System.out.println("Inside method: " + num);
    }

    // Pass-by-Value of Reference Example (Objects)
    public void modifyArray(int[] arr) {
        arr[0] = 100;
    }

    public static void main(String[] args) {
        _3_MethodsFunctions obj = new _3_MethodsFunctions();

        // Calling a simple method
        obj.greet();

        // Calling method with return value
        int sum = obj.add(5, 10);
        System.out.println("Sum (2 params): " + sum);

        // Calling overloaded method
        int sum2 = obj.add(5, 10, 15);
        System.out.println("Sum (3 params): " + sum2);

        // Pass-by-Value Example
        int number = 20;
        System.out.println("Before method call: " + number);
        obj.modifyValue(number);
        System.out.println("After method call: " + number);

        // Pass-by-Value of Reference Example
        int[] numbers = {1, 2, 3};
        System.out.println("Before modifying array: " + numbers[0]);
        obj.modifyArray(numbers);
        System.out.println("After modifying array: " + numbers[0]);
    }
}
