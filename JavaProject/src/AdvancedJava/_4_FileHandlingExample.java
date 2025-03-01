/*
 * File Handling & Serialization in Java
 * ------------------------------------
 * Key Points:
 * - File Handling allows reading/writing data to files.
 * - Serialization enables saving and retrieving objects.
 * - Key Features:
 *   1. FileReader & FileWriter - Read/write character data.
 *   2. BufferedReader & BufferedWriter - Efficient reading/writing.
 *   3. Serialization - Convert objects into a byte stream for storage or transfer.
 *   4. Deserialization - Convert byte stream back into objects.
 *   5. transient keyword - Used to prevent serialization of specific fields.
 */
package AdvancedJava;
import java.io.*;

public class _4_FileHandlingExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "Hello, this is a sample file content.";

        // 1. Writing to a file using FileWriter
        // FileWriter is used for writing character data to a file.
        // BufferedWriter provides efficient writing by reducing I/O operations.
        try (FileWriter writer = new FileWriter(fileName); BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 2. Reading from a file using FileReader
        // FileReader is used for reading character data from a file.
        // BufferedReader reads text efficiently line by line.
        try (FileReader reader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. Serialization Example
        // Serialization is the process of converting an object into a byte stream.
        // This allows storing objects in files or sending them over a network.
        String serializedFile = "object_data.ser";
        Person person = new Person("John Doe", 30);

        // Serializing the object
        try (FileOutputStream fileOut = new FileOutputStream(serializedFile); ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. Deserialization Example
        // Deserialization is the process of converting a byte stream back into an object.
        // It restores the object's state from the saved file.
        try (FileInputStream fileIn = new FileInputStream(serializedFile); ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Deserialized Object: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// Serializable class
// Implements Serializable interface to allow object serialization.
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    // The 'transient' keyword prevents this field from being serialized.
    private transient String sensitiveData = "This will not be serialized";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
