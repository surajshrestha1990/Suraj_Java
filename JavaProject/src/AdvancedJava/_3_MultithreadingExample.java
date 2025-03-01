/*
 * Multithreading & Concurrency in Java
 * ------------------------------------
 * Key Points:
 * - Multithreading allows concurrent execution of two or more threads.
 * - Improves application performance by utilizing CPU efficiently.
 * - Key Features:
 *   1. Thread Lifecycle - New, Runnable, Blocked, Waiting, Timed Waiting, Terminated.
 *   2. Creating Threads - Extending Thread class or implementing Runnable interface.
 *   3. Synchronization - Prevents thread interference (synchronized keyword, Locks, Atomic Variables).
 *   4. Executors Framework - Manages thread pools efficiently.
 */

package AdvancedJava;
// Import necessary classes
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

// 1. Creating Threads using Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread using Thread class: " + Thread.currentThread().getName());
    }
}

// 2. Creating Threads using Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface: " + Thread.currentThread().getName());
    }
}

public class _3_MultithreadingExample {
    public static void main(String[] args) {
        // Creating and starting threads using Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // Creating and starting threads using Runnable interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        // 3. Synchronization Example
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(() -> resource.increment(), "T1");
        Thread t2 = new Thread(() -> resource.increment(), "T2");
        t1.start();
        t2.start();

        // 4. Using Executor Framework
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(() -> System.out.println("Task executed using ExecutorService"));
        executor.shutdown();
    }
}

// Shared Resource class demonstrating synchronization
class SharedResource {
    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock(); // Locking to ensure thread safety
        try {
            count++;
            System.out.println(Thread.currentThread().getName() + " - Count: " + count);
        } finally {
            lock.unlock(); // Unlocking after operation
        }
    }
}
