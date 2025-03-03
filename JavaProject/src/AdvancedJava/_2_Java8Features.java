/*
 * Java 8 Features - Easy Explanation
 * -----------------------------------------
 * Key Points:
 * - Introduced in Java 8 to enhance functional programming and improve performance.
 * - Reduces boilerplate code and improves readability.
 * - Key Features:
 *   1. Lambda Expressions - Simplified way of writing anonymous functions.
 *   2. Functional Interfaces - Interfaces with only one abstract method (SAM interfaces).
 *      - Examples: Predicate, Consumer, Supplier, Function
 *   3. Stream API - Process collections efficiently.
 *      - Methods: filter, map, reduce, sorted, collect
 *   4. Optional Class - Avoids NullPointerExceptions.
 */
package AdvancedJava;
import java.util.*;
import java.util.function.*;

public class _2_Java8Features {
    public static void main(String[] args) {
        // 1. Lambda Expressions - Used to implement functional interfaces
        // Instead of writing a full anonymous class, we use -> to define behavior concisely
        Runnable r = () -> System.out.println("Lambda Expression Example");
        r.run();

        // 2. Functional Interfaces Examples

        // Predicate - Takes an input and returns a boolean result (e.g., checking if a number is even)
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Consumer - Takes an input and performs an action without returning anything
        Consumer<String> printer = message -> System.out.println("Consumer Example: " + message);
        printer.accept("Hello, Java 8!");

        // Supplier - Does not take any input but returns a result (e.g., generating a random number)
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: " + randomSupplier.get());

        // Function - Takes an input and produces an output (e.g., finding the length of a string)
        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println("Length of 'Java8': " + lengthFunction.apply("Java8"));

        // 3. Stream API Example - Used to process collections efficiently
        List<String> names = Arrays.asList("Alice","Anoop", "Bob", "Charlie", "David");
        System.out.print("Filtered Names (Start with A): ");
        names.stream()
                .filter(name -> name.startsWith("A")) // Filters names starting with 'A'
                .forEach(System.out::println); // Prints each filtered name

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum); // Accumulates sum of all numbers
        System.out.println("Sum of numbers: " + sum);

        // Accessing elements
        System.out.println("First Name: " + names.get(0)); // Alice

        // Modifying an element
        names.set(1, "Ankit");
        System.out.println("Updated List: " + names);

        // This will throw an error (UnsupportedOperationException)
        // names.add("Eve");

        // 4. Optional Class Example - Prevents NullPointerException
        Optional<String> optionalString = Optional.of("Hello, Optional!");
        optionalString.ifPresent(System.out::println); // Prints value if present

        // Handling empty Optional
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Optional Value: " + emptyOptional.orElse("Default Value")); // Provides default value if empty
    }
}
