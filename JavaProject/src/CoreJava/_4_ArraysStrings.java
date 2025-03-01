package CoreJava;/*
 * Arrays & Strings in Java
 * ---------------------------------
 * - 1D Arrays: Store a sequence of elements of the same type in a single row.
 * - 2D Arrays: Store elements in a matrix (rows and columns).
 * - Different Ways to Create Arrays:
 *   1. Using array literals: int[] arr = {1, 2, 3};
 *   2. Using 'new' keyword with size: int[] arr = new int[5];
 *   3. Using 'new' with values: int[] arr = new int[]{10, 20, 30};
 *   4. Multi-dimensional arrays: int[][] matrix = new int[3][3];
 * - String Methods: Built-in methods for manipulating strings.
 * - StringBuffer & StringBuilder: Used for mutable strings.
 *
 * Key Points to Remember:
 * - Strings in Java are immutable (cannot be changed after creation).
 * - StringBuffer and StringBuilder allow string modifications.
 * - StringBuffer is synchronized (thread-safe), whereas StringBuilder is faster.
 *
 * Immutable Strings:
 * - Strings are immutable, meaning their value cannot be changed after creation.
 * - Any modification creates a new String object in memory.
 * - This is useful for memory optimization, security, and thread safety.
 * - Example:
 *   String str = "Hello";
 *   str.concat(" World"); // A new string is created, but str still points to "Hello".
 *   str = str.concat(" World"); // Now str refers to "Hello World".
 * - Use StringBuilder or StringBuffer if modifications are needed frequently.
 */

public class _4_ArraysStrings {
    public static void main(String[] args) {
        // Different ways to create 1D arrays
        int[] numbers1 = {10, 20, 30, 40, 50};
        int[] numbers2 = new int[5]; // Default values are 0
        int[] numbers3 = new int[]{5, 10, 15, 20};

        System.out.println("1D Array Element at index 2: " + numbers1[2]);

        // 2D Array Example
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("2D Array Element at (1,1): " + matrix[1][1]);

        // String Methods
        String text = "Hello, Java!";
        System.out.println("Character at index 1: " + text.charAt(1));
        System.out.println("Substring (0-5): " + text.substring(0, 5));
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Replace 'Java' with 'World': " + text.replace("Java", "World"));

        // Immutable String Example
        String str = "Hello";
        str.concat(" World"); // Does not change str
        System.out.println("Immutable String: " + str); // Output: Hello
        str = str.concat(" World"); // Now str points to a new object "Hello World"
        System.out.println("Modified String: " + str); // Output: Hello World

        // StringBuffer Example
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("StringBuffer after append: " + sb);

        // StringBuilder Example
        StringBuilder sbuilder = new StringBuilder("Java");
        sbuilder.append(" Programming");
        System.out.println("StringBuilder after append: " + sbuilder);
    }
}
