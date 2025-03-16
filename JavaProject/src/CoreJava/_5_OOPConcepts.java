package CoreJava;

/*
 * OOPS Concepts in Java with Examples --------
 * -----------------------------------
 * 1. Class and Object - Basic building blocks of Java OOP.
 * 2. Encapsulation - Hiding data using private access modifiers. Private variables are accessed via public methods.
 * 3. Inheritance - Reusing code by extending classes.
 *      - Single Inheritance: One class extends another.
 *      - Multilevel Inheritance: A class extends another class, which in turn extends another class.
 *      - Hierarchical Inheritance: One parent class has multiple child classes.
 * 4. Polymorphism - Using the same method name with different implementations.
 * 5. Abstraction - Hiding implementation details and showing only essential features.
 * 6. Constructors - Used to initialize objects (Default, Parameterized, Copy Constructor).
 * 7. Super & This Keywords - Used for constructor chaining and accessing parent class methods.
 * 8. Multiple Inheritance via Interface - Implementing multiple interfaces in a class.
 * 9. Immutable Class - Creating objects whose state cannot be changed after initialization.
 *
 * Key Points:
 * - OOP helps in modularity, reusability, and maintainability of code.
 * - Real-world objects can be represented using OOP concepts.
 * - Java follows the "Write Once, Run Anywhere" principle using OOP.
 */

/*
 * OOPS Concepts in Java with Examples --------
 * -----------------------------------
 * Object-Oriented Programming (OOP) is a programming paradigm that organizes software design around objects and classes.
 * It simplifies software development by promoting modularity, reusability, and maintainability.
 *
 * 1. **Class and Object**:
 *    - **Class**: A blueprint or template for creating objects. It defines the properties (variables) and behaviors (methods) of objects.
 *    - **Object**: An instance of a class. It represents a real-world entity with a state (data) and behavior (methods).
 *    - **Key Point**: Classes and objects are the foundation of OOP. They help model real-world entities in code.
 *
 * 2. **Encapsulation**:
 *    - The process of wrapping data (variables) and methods (functions) into a single unit (class).
 *    - Data is hidden using `private` access modifiers and accessed via `public` methods (getters and setters).
 *    - **Key Point**: Encapsulation ensures data security and prevents unauthorized access or modification.
 *
 * 3. **Inheritance**:
 *    - A mechanism where a new class (child class) derives properties and behaviors from an existing class (parent class).
 *    - Types of Inheritance:
 *      - **Single Inheritance**: A class extends only one parent class.
 *      - **Multilevel Inheritance**: A class extends another class, which in turn extends another class (e.g., A -> B -> C).
 *      - **Hierarchical Inheritance**: One parent class has multiple child classes (e.g., A -> B, A -> C).
 *      - **Hybrid Inheritance**: A combination of two or more types of inheritance but can lead to complexity. For example, a mix of single, multilevel, and hierarchical inheritance.
 *    - **Key Point**: Inheritance promotes code reusability and establishes a relationship between classes.
 *
 * 4. **Polymorphism**:
 *    - The ability of a method to behave differently based on the object that calls it.
 *    - Types of Polymorphism:
 *      - **Compile-time Polymorphism (Method Overloading)**: Multiple methods with the same name but different parameters.
 *      - **Run-time Polymorphism (Method Overriding)**: A child class provides a specific implementation of a method already defined in its parent class.
 *    - **Key Point**: Polymorphism allows flexibility and dynamic behavior in code.
 *
 * 5. **Abstraction**:
 *    - The process of hiding complex implementation details and exposing only essential features to the user.
 *    - Achieved using abstract classes (partial abstraction) and interfaces (full abstraction).
 *    - **Key Point**: Abstraction simplifies complex systems by focusing on what an object does rather than how it does it.
 *
 * 6. **Constructors**:
 *    - Special methods used to initialize objects when they are created.
 *    - Types of Constructors:
 *      - **Default Constructor**: Automatically created if no constructor is defined. Initializes objects with default values.
 *      - **Parameterized Constructor**: Accepts parameters to initialize objects with specific values.
 *      - **Copy Constructor**: Creates a new object by copying the values of an existing object.
 *    - **Key Point**: Constructors ensure that objects are properly initialized when created.
 *
 * 7. **Super & This Keywords**:
 *    - **super**: Refers to the parent class. Used to call the parent class constructor or access its methods/variables.
 *    - **this**: Refers to the current object. Used to differentiate between instance variables and method parameters.
 *    - **Key Point**: These keywords help in constructor chaining and resolving naming conflicts.
 *
 * 8. **Multiple Inheritance via Interface**:
 *    - Java does not support multiple inheritance for classes (to avoid complexity and ambiguity).
 *    - However, a class can implement multiple interfaces to achieve similar functionality.
 *    - **Key Point**: Interfaces provide a way to achieve abstraction and multiple inheritance in Java.
 *
 * 9. **Immutable Class**:
 *    - A class whose objects cannot be modified after creation (i.e., their state is fixed).
 *    - Achieved by declaring variables as `final` and not providing setter methods.
 *    - **Key Point**: Immutable classes are thread-safe and ensure data integrity.
 *
 * Key Points to Remember:
 * - OOP promotes **modularity**, **reusability**, and **maintainability** of code.
 * - Real-world entities can be modeled using classes and objects.
 * - Java follows the **"Write Once, Run Anywhere"** principle, enabled by OOP concepts.
 * - Encapsulation, Inheritance, Polymorphism, and Abstraction are the **four pillars of OOP**.
 */


// 1. Class and Object Example
class Car {
    String brand; // Instance variable to store the car's brand
    int speed;   // Instance variable to store the car's speed

    // Default Constructor: Initializes the car with default values
    Car() {
        this.brand = "Unknown"; // 'this' refers to the current object instance
        this.speed = 0;        // Default speed is set to 0
    }

    // Parameterized Constructor: Initializes the car with specific brand and speed
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Copy Constructor: Creates a new car object by copying another car object
    Car(Car c) {
        this.brand = c.brand;
        this.speed = c.speed;
    }

    // Method to display car details
    void displayCar() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

// 2. Encapsulation Example (Using private variables & public methods)
class Person {
    private String name; // Private variable to store the person's name
    private int age;     // Private variable to store the person's age

    // Public method to set the name and age of the person
    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method to display the person's details
    public void getDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// 3. Inheritance Examples

// Single Inheritance Example (Car -> ElectricCar)
class ElectricCar extends Car { // 'extends' keyword enables inheritance
    int batteryCapacity; // Additional instance variable for battery capacity

    // Parameterized Constructor for ElectricCar
    ElectricCar(String brand, int speed, int batteryCapacity) {
        super(brand, speed); // 'super' calls the parent class constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Method to display electric car details
    void displayElectricCar() {
        displayCar(); // Calls the parent class method to display car details
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Multilevel Inheritance Example (Vehicle -> AdvancedCar -> AdvancedElectricCar)
class Vehicle {
    String type; // Instance variable to store the type of vehicle

    // Parameterized Constructor for Vehicle
    Vehicle(String type) {
        this.type = type;
    }

    // Method to display the type of vehicle
    void displayType() {
        System.out.println("Vehicle Type: " + type);
    }
}

class AdvancedCar extends Vehicle {
    String brand; // Instance variable to store the car's brand

    // Parameterized Constructor for AdvancedCar
    AdvancedCar(String brand) {
        super("Car"); // Calls the parent class constructor with "Car" as the type
        this.brand = brand;
    }

    // Method to display advanced car details
    void displayAdvancedCar() {
        displayType(); // Calls the parent class method to display vehicle type
        System.out.println("Brand: " + brand);
    }
}

class AdvancedElectricCar extends AdvancedCar {
    int batteryCapacity; // Instance variable to store battery capacity

    // Parameterized Constructor for AdvancedElectricCar
    AdvancedElectricCar(String brand, int batteryCapacity) {
        super(brand); // Calls the parent class constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Method to display advanced electric car details
    void displayAdvancedElectricCar() {
        displayAdvancedCar(); // Calls the parent class method to display advanced car details
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}


// Hierarchical Inheritance Example (Car -> ElectricCar and Car -> Truck)
class Truck extends Car {
    int loadCapacity; // Instance variable to store the truck's load capacity

    // Parameterized Constructor for Truck
    Truck(String brand, int speed, int loadCapacity) {
        super(brand, speed); // Calls the parent class constructor
        this.loadCapacity = loadCapacity;
    }

    // Method to display truck details
    void displayTruck() {
        displayCar(); // Calls the parent class method to display car details
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Hybrid Inheritance Example (Combining Single, Multilevel, and Hierarchical Inheritance)
class HybridVehicle extends AdvancedElectricCar {
    int fuelCapacity; // Additional instance variable for fuel capacity

    // Parameterized Constructor for HybridVehicle
    HybridVehicle(String brand, int speed, int batteryCapacity, int fuelCapacity) {
        super(brand, batteryCapacity); // Calls the parent class constructor
        this.fuelCapacity = fuelCapacity;
    }

    // Method to display hybrid vehicle details
    void displayHybridVehicle() {
        displayAdvancedElectricCar(); // Calls the parent class method to display advanced electric car details
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}


// 4. Polymorphism Example (Method Overloading and Overriding)
class Calculator {
    // Method Overloading (Compile-time Polymorphism)
    // Adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Adds three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class AdvancedCalculator extends Calculator {
    // Method Overriding (Run-time Polymorphism)
    // Overrides the add method of the parent class
    @Override
    int add(int a, int b) {
        System.out.println("Overridden Method in AdvancedCalculator");
        return a + b + 10; // Adds 10 to the result
    }
}

// 5. Abstraction Example
abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound();
}

class Dog extends Animal {
    // Overrides the abstract method to provide implementation
    @Override
    void makeSound() {
        System.out.println("Dog Barks");
    }
}

// 6. Multiple Inheritance via Interface
interface Engine {
    void startEngine(); // Interface method (must be implemented)
}

interface Wheels {
    void rotateWheels(); // Interface method (must be implemented)
}

class Bike implements Engine, Wheels { // Implements multiple interfaces
    @Override
    public void startEngine() {
        System.out.println("Bike Engine Started");
    }

    @Override
    public void rotateWheels() {
        System.out.println("Bike Wheels Rotating");
    }
}

// 7. Immutable Class Example
final class ImmutablePerson {
    private final String name; // Final variable to store the name (cannot be changed)
    private final int age;    // Final variable to store the age (cannot be changed)

    // Parameterized Constructor for ImmutablePerson
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }
}

// 8. Static Keyword Example
class StaticExample {
    static int count = 0; // Static variable shared by all objects

    // Constructor increments the static count variable
    StaticExample() {
        count++;
    }

    // Static method to display the total number of objects created
    static void showCount() {
        System.out.println("Total Objects Created: " + count);
    }
}

// 9. Final Keyword Usage
final class FinalClass { // 'final' class cannot be inherited
    final int constantValue = 100; // Final variable is a constant value (cannot be changed)

    // Final method cannot be overridden in a subclass
    final void show() {
        System.out.println("This is a final method.");
    }
}

public class _5_OOPConcepts {
    public static void main(String[] args) {
        // Class and Object Example
        Car car1 = new Car("Toyota", 180);
        car1.displayCar();

        // Copy Constructor Example
        Car car2 = new Car(car1);
        car2.displayCar();

        // Encapsulation Example
        Person person = new Person();
        person.setDetails("John", 30);
        person.getDetails();

        // Single Inheritance Example
        ElectricCar eCar = new ElectricCar("Tesla", 200, 75);
        eCar.displayElectricCar();

        // Multilevel Inheritance Example
        AdvancedElectricCar advECar = new AdvancedElectricCar("Lucid", 120);
        advECar.displayAdvancedElectricCar();

        // Hierarchical Inheritance Example
        Truck truck = new Truck("Volvo", 100, 15);
        truck.displayTruck();

        // Testing Hybrid Inheritance
        HybridVehicle hybridVehicle = new HybridVehicle("Toyota Hybrid", 150, 50, 40);
        hybridVehicle.displayHybridVehicle();

        // Polymorphism Example
        Calculator calc = new Calculator();
        System.out.println("Addition (2 numbers): " + calc.add(5, 10));
        System.out.println("Addition (3 numbers): " + calc.add(5, 10, 15));

        AdvancedCalculator advCalc = new AdvancedCalculator();
        System.out.println("Overridden Addition: " + advCalc.add(5, 10));

        // Abstraction Example
        Animal myDog = new Dog();
        myDog.makeSound();

        // Multiple Inheritance via Interface Example
        Bike myBike = new Bike();
        myBike.startEngine();
        myBike.rotateWheels();

        // Immutable Class Example
        ImmutablePerson immutablePerson = new ImmutablePerson("Alice", 25);
        System.out.println("Immutable Person: " + immutablePerson.getName() + ", Age: " + immutablePerson.getAge());

        // Static Keyword Example
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample.showCount();

        // Final Keyword Example
        FinalClass finalObj = new FinalClass();
        System.out.println("Final Variable: " + finalObj.constantValue);
        finalObj.show();
    }
}
