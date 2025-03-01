package AdvancedJava;/*
 * Java Collections Framework - Easy Explanation
 * -----------------------------------------
 * The Collections Framework provides pre-built classes to manage groups of objects efficiently.
 * It includes:
 * 1. **List** - Ordered collection (ArrayList, LinkedList, Vector, Stack)
 * 2. **Set** - Unique elements (HashSet, LinkedHashSet, TreeSet)
 * 3. **Map** - Key-Value pairs (HashMap, LinkedHashMap, TreeMap, Hashtable)
 * 4. **Queue** - FIFO & Priority-based storage (PriorityQueue, Deque)
 * 5. **Iterators** - Traversing collections (Iterator, ListIterator, forEach)
 */

import java.util.*;

public class _1_CollectionsDemo {
    public static void main(String[] args) {
        // 1. List Example - ArrayList (ordered, allows duplicates)
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // Using forEach loop to iterate over List
        System.out.print("ArrayList using forEach: ");
        arrayList.forEach(item -> System.out.print(item + " "));
        System.out.println();

        // 2. Set Example - HashSet (unordered, unique elements only)
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10); // Duplicate won't be added
        System.out.println("HashSet: " + hashSet);

        // Using forEach loop to iterate over Set
        System.out.print("HashSet using forEach: ");
        hashSet.forEach(num -> System.out.print(num + " "));
        System.out.println();

        // 3. Map Example - HashMap (Key-Value pairs)
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("HashMap: " + hashMap);

        // Using forEach to iterate over Map
        System.out.println("HashMap using forEach:");
        hashMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // 4. Queue Example - PriorityQueue (ordered based on priority)
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Task1");
        priorityQueue.add("Task2");
        System.out.println("PriorityQueue: " + priorityQueue);

        // Using forEach loop to iterate over Queue
        System.out.print("PriorityQueue using forEach: ");
        priorityQueue.forEach(task -> System.out.print(task + " "));
        System.out.println();

        // 5. Iterators - Traversing a List using Iterator
        Iterator<String> iterator = arrayList.iterator();
        System.out.print("Iterating ArrayList: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
