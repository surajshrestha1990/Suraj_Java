/*
 * Java 8 Features
 * -----------------------------------------
 * Key Points:
 * - Java 8 introduced powerful features to enhance functional programming and improve code readability and performance.
 * - These features reduce boilerplate code and make it easier to work with collections and data processing.
 * - Key Features:
 *   1. Lambda Expressions - A concise way to write anonymous functions.
 *   2. Functional Interfaces - Interfaces with only one abstract method (SAM interfaces).
 *      - Examples: Predicate, Consumer, Supplier, Function
 *   3. Stream API - A modern way to process collections efficiently.
 *      - Methods: filter, map, reduce, sorted, collect, flatMap, distinct, limit, skip, forEach, anyMatch, allMatch, noneMatch, findFirst, findAny, count, min, max
 *   4. Optional Class - Helps avoid NullPointerExceptions by handling null values gracefully.
 */
package AdvancedJava;
import javax.swing.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.*;
import java.util.stream.Collectors;

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

// 1.2. Using lambda with functional interfaces (Common real-world use cases)

// Sorting a list of strings using lambda
        List<String> nameList = Arrays.asList("John", "Jane", "Alice", "Bob");
        nameList.sort((a, b) -> a.compareToIgnoreCase(b));
        System.out.println("Sorted names: " + nameList);

// 1.3. Using lambda with Streams API (frequently used in real-world applications)
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numberList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

// 1.4. Implementing Functional Interface using lambda (Example: Predicate)
        Predicate<Integer> isEvenno = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEvenno.test(4)); // true
        System.out.println("Is 7 even? " + isEvenno.test(7)); // false

// 1.5. Using lambda in a custom thread execution (Common real-world use case)
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> System.out.println("Task executed using lambda!"));
        executor.shutdown();

// 1.6. Using lambda for event handling (GUI applications)
        JButton button = new JButton("Click Me");
        button.addActionListener(e -> System.out.println("Button clicked!"));


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

        // --------------- Additional Stream API Methods ---------------

        // Convert all names to uppercase
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase) // Converts each name to uppercase
                .collect(Collectors.toList());
        System.out.println("Uppercase Names: " + upperCaseNames);

        // Sort the list alphabetically
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Names: " + sortedNames);

        // Count the number of names containing the letter 'o'
        long countO = names.stream()
                .filter(name -> name.contains("o"))
                .count();
        System.out.println("Number of names containing 'o': " + countO);

        // Find the first name longer than 3 characters
        Optional<String> firstLongName = names.stream()
                .filter(name -> name.length() > 3)
                .findFirst();
        firstLongName.ifPresent(name -> System.out.println("First long name: " + name));

        // Collect names into a single comma-separated string
        String joinedNames = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Joined Names: " + joinedNames);

        // Create a list of squared numbers
        List<Integer> squaredNumbers = numbers.stream()
                .map(num -> num * num) // Square each number
                .collect(Collectors.toList());
        System.out.println("Squared Numbers: " + squaredNumbers);

        // Parallel stream to process numbers faster
        int parallelSum = numbers.parallelStream()
                .reduce(0, Integer::sum);
        System.out.println("Parallel Sum of numbers: " + parallelSum);

        // flatMap - Flattens nested structures (e.g., list of lists into a single list)
        List<List<String>> nestedNames = Arrays.asList(
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Charlie", "David")
        );
        List<String> flatNames = nestedNames.stream()
                .flatMap(List::stream) // Flattens the nested lists
                .collect(Collectors.toList());
        System.out.println("Flattened Names: " + flatNames); // Output: [Alice, Bob, Charlie, David]

        // distinct - Removes duplicates from the stream
        List<String> uniqueNames = names.stream()
                .distinct() // Removes duplicate "Alice"
                .collect(Collectors.toList());
        System.out.println("Unique Names: " + uniqueNames); // Output: [Alice, Ankit, Bob, Charlie, David]

        // limit - Limits the number of elements in the stream
        List<String> limitedNames = names.stream()
                .limit(3) // Takes only the first 3 elements
                .collect(Collectors.toList());
        System.out.println("Limited Names: " + limitedNames); // Output: [Alice, Ankit, Bob]

        // skip - Skips the first N elements in the stream
        List<String> skippedNames = names.stream()
                .skip(2) // Skips the first 2 elements
                .collect(Collectors.toList());
        System.out.println("Skipped Names: " + skippedNames); // Output: [Bob, Charlie, David]

        // anyMatch - Checks if any element matches the condition
        boolean hasAlice = names.stream()
                .anyMatch(name -> name.equals("Alice")); // Checks if "Alice" exists
        System.out.println("Has Alice? " + hasAlice); // Output: true

        // allMatch - Checks if all elements match the condition
        boolean allStartWithA = names.stream()
                .allMatch(name -> name.startsWith("A")); // Checks if all names start with 'A'
        System.out.println("All start with A? " + allStartWithA); // Output: false

        // noneMatch - Checks if no elements match the condition
        boolean noneStartWithZ = names.stream()
                .noneMatch(name -> name.startsWith("Z")); // Checks if no names start with 'Z'
        System.out.println("None start with Z? " + noneStartWithZ); // Output: true

        // findFirst - Finds the first element in the stream
        Optional<String> firstElement = names.stream()
                .findFirst(); // Finds the first element
        firstElement.ifPresent(System.out::println); // Output: Alice

        // findAny - Finds any element in the stream (useful in parallel streams)
        Optional<String> anyElement = names.stream()
                .findAny(); // Finds any element
        anyElement.ifPresent(System.out::println); // Output: Alice (or any other element)

        // count - Counts the number of elements in the stream
        long count = names.stream()
                .count(); // Counts the total elements
        System.out.println("Total Names: " + count); // Output: 5

        // min - Finds the minimum element based on a comparator
        Optional<String> minName = names.stream()
                .min(Comparator.naturalOrder()); // Finds the lexicographically smallest name
        minName.ifPresent(System.out::println); // Output: Alice

        // max - Finds the maximum element based on a comparator
        Optional<String> maxName = names.stream()
                .max(Comparator.naturalOrder()); // Finds the lexicographically largest name
        maxName.ifPresent(System.out::println); // Output: David

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