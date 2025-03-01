package CoreJava;/*
 * Java Memory Management - Easy Explanation
 * -----------------------------------------
 * Java uses two main memory areas:
 * 1. **Stack Memory** - Stores method calls, local variables, and reference variables.
 * 2. **Heap Memory** - Stores objects created using 'new' (accessible globally).
 *
 * Java's Garbage Collector automatically removes unused objects from the heap.
 * The 'finalize()' method is called before an object is removed.
 */

// Example to demonstrate Stack and Heap Memory allocation
class MemoryExample {
    int number; // Instance variable (stored in Heap inside object)
    static int staticNumber = 10; // Static variable (stored in Method Area)

    // Constructor (allocates memory in Heap)
    MemoryExample(int value) {
        this.number = value;
    }

    // Method to show values (demonstrates Stack memory for local variable)
    void show() {
        int localVar = 5; // Local variable (stored in Stack)
        System.out.println("Instance Variable (Heap): " + number);
        System.out.println("Local Variable (Stack): " + localVar);
    }
}

// Example to demonstrate Garbage Collection
class GarbageExample {
    // finalize() method is executed before object is destroyed
    @Override
    protected void finalize() {
        System.out.println("Garbage Collector removed an object");
    }
}

public class _8_MemoryManagement {
    public static void main(String[] args) {
        // Stack and Heap Example
        MemoryExample obj1 = new MemoryExample(100); // Object stored in Heap
        obj1.show();

        // Garbage Collection Example
        GarbageExample g1 = new GarbageExample();
        GarbageExample g2 = new GarbageExample();

        g1 = null; // Object is now eligible for Garbage Collection
        g2 = null; // Another object ready for Garbage Collection

        // Requesting JVM to run Garbage Collector
        System.gc(); // Calls Garbage Collector (not guaranteed to run immediately)
    }
}
