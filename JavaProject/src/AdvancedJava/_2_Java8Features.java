/*
 * Java 8 Features - Easy Explanation
 * -----------------------------------------
 * Key Points:
 * - Java 8 introduced powerful features to enhance functional programming and improve code readability and performance.
 * - These features reduce boilerplate code and make it easier to work with collections and data processing.
 * - Key Features:
 *   1. Lambda Expressions - A concise way to write anonymous functions.
 *   2. Functional Interfaces - Interfaces with only one abstract method (SAM interfaces).
 *      - Examples: Predicate, Consumer, Supplier, Function
 *   3. Stream API - A modern way to process collections efficiently.
 *      - Methods: filter, map, reduce, sorted, collect
 *   4. Optional Class - Helps avoid NullPointerExceptions by handling null values gracefully.
 */
package AdvancedJava;
import java.util.*;
import java.util.function.*;

public class _2_Java8Features {
    public static void main(String[] args) {
        // 1. Lambda Expressions - Simplified way of writing anonymous functions
        // Real-world use: Replace bulky anonymous classes with clean, concise code.

        // Traditional way using Anonymous class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from traditional way!");
            }
        };
        r1.run();

        // Using Lambda (concise and readable)
        Runnable r = () -> System.out.println("Lambda Expression Example");
        r.run();

        // 2. Functional Interfaces Examples
        // Functional interfaces are interfaces with only one abstract method (SAM).
        // Real-world use: Used extensively in lambda expressions and Stream API.

        // Predicate - Takes an input and returns a boolean (e.g., checking if a number is even)
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4)); // Output: true

        // Consumer - Takes an input and performs an action without returning anything
        Consumer<String> printer = message -> System.out.println("Consumer Example: " + message);
        printer.accept("Hello, Java 8!"); // Output: Consumer Example: Hello, Java 8!

        // Supplier - Does not take any input but returns a result (e.g., generating a random number)
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: " + randomSupplier.get()); // Output: Random number: [random value]

        // Function - Takes an input and produces an output (e.g., finding the length of a string)
        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println("Length of 'Java8': " + lengthFunction.apply("Java8")); // Output: 5

        // 3. Stream API Example - Modern way to process collections efficiently
        // Real-world use: Process large datasets (e.g., filtering, mapping, reducing) with minimal code.

        List<String> names = Arrays.asList("Alice", "Anoop", "Bob", "Charlie", "David");

        // Filter names starting with 'A' and print them
        System.out.print("Filtered Names (Start with A): ");
        names.stream()
                .filter(name -> name.startsWith("A")) // Filters names starting with 'A'
                .forEach(System.out::println); // Prints each filtered name

        // Calculate the sum of numbers in a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum); // Accumulates sum of all numbers
        System.out.println("Sum of numbers: " + sum); // Output: 15

        // Accessing elements in a list
        System.out.println("First Name: " + names.get(0)); // Output: Alice

        // Modifying an element in a list
        names.set(1, "Ankit");
        System.out.println("Updated List: " + names); // Output: [Alice, Ankit, Bob, Charlie, David]

        // Uncommenting this will throw an error (UnsupportedOperationException)
        // names.add("Eve"); // Lists created with Arrays.asList() are immutable

        // 4. Optional Class Example - Prevents NullPointerException
        // Real-world use: Safely handle null values in your code.

        // Create an Optional with a non-null value
        Optional<String> optionalString = Optional.of("Hello, Optional!");
        optionalString.ifPresent(System.out::println); // Output: Hello, Optional!

        // Handling empty Optional
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Optional Value: " + emptyOptional.orElse("Default Value")); // Output: Default Value
    }
}