package CoreJava;
/*
 * OOPS Concepts in Java with Examples --------
 * -----------------------------------
 * 1. Class and Object - Basic building blocks of Java OOP.
 * 2. Encapsulation - Hiding data using private access modifiers. private variables and allowing access via public methods
 * 3. Inheritance - Reusing code by extending classes.
 *      - Single Inheritance: One class extends another.
 *      - Multilevel Inheritance: A class extends another class, which in turn extends another class.
 *      - Hierarchical Inheritance: One parent class has multiple child classes.
 * 4. Polymorphism - Using the same method name with different implementations...
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


// 1. Class and Object Example
class Car {
    String brand; // Instance variable
    int speed;   // Instance variable

    // Default Constructor
    Car() {
        this.brand = "Unknown"; // 'this' refers to the current object instance
        this.speed = 0;
    }

    // Parameterized Constructor
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Copy Constructor
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
    private String name; // Private access modifier restricts direct access
    private int age;

    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// 3. Inheritance Examples

// Single Inheritance Example (Car -> ElectricCar)
class ElectricCar extends Car { // 'extends' enables inheritance
    int batteryCapacity;

    ElectricCar(String brand, int speed, int batteryCapacity) {
        super(brand, speed); // 'super' calls the parent class constructor
        this.batteryCapacity = batteryCapacity;
    }

    void displayElectricCar() {
        displayCar(); // Calls parent class method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Multilevel Inheritance Example (Vehicle -> AdvancedCar -> AdvancedElectricCar)
class Vehicle {
    String type;

    Vehicle(String type) {
        this.type = type;
    }

    void displayType() {
        System.out.println("Vehicle Type: " + type);
    }
}

class AdvancedCar extends Vehicle {
    String brand;

    AdvancedCar(String brand) {
        super("Car"); // Calls the parent class constructor
        this.brand = brand;
    }

    void displayAdvancedCar() {
        displayType();
        System.out.println("Brand: " + brand);
    }
}

class AdvancedElectricCar extends AdvancedCar {
    int batteryCapacity;

    AdvancedElectricCar(String brand, int batteryCapacity) {
        super(brand);
        this.batteryCapacity = batteryCapacity;
    }

    void displayAdvancedElectricCar() {
        displayAdvancedCar();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}


// Hierarchical Inheritance Example (Car -> ElectricCar and Car -> Truck)
class Truck extends Car {
    int loadCapacity;

    Truck(String brand, int speed, int loadCapacity) {
        super(brand, speed);
        this.loadCapacity = loadCapacity;
    }

    void displayTruck() {
        displayCar();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}


// 4. Polymorphism Example (Method Overloading and Overriding)
class Calculator {
    // Method Overloading (Compile-time Polymorphism)
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class AdvancedCalculator extends Calculator {
    // Method Overriding (Run-time Polymorphism)
    @Override
    int add(int a, int b) {
        System.out.println("Overridden Method in AdvancedCalculator");
        return a + b + 10;
    }
}

// 5. Abstraction Example
abstract class Animal {
    abstract void makeSound(); // Abstract method (no implementation)
}

class Dog extends Animal {
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
    void rotateWheels();
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
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// 8. Static Keyword Example
class StaticExample {
    static int count = 0; // Static variable shared by all objects

    StaticExample() {
        count++;
    }

    static void showCount() { // Static method
        System.out.println("Total Objects Created: " + count);
    }
}

// 9. Final Keyword Usage
final class FinalClass { // 'final' class cannot be inherited
    final int constantValue = 100; // final variable is Constant value

    final void show() { // 'final' method cannot be overridden in subclass
        System.out.println("This is a final method.");
    }
}

public class _5_OOPConcepts {
    public static void main(String[] args) {
        // Class and Object Example
        Car car1 = new Car("Toyota", 180);
        car1.displayCar();

        // Copy Constructor
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

        // Hierarchical Inheritance
        Truck truck = new Truck("Volvo", 100, 15);
        truck.displayTruck();

        // Polymorphism Example
        Calculator calc = new Calculator();
        System.out.println("Addition (2 numbers): " + calc.add(5, 10));
        System.out.println("Addition (3 numbers): " + calc.add(5, 10, 15));

        AdvancedCalculator advCalc = new AdvancedCalculator();
        System.out.println("Overridden Addition: " + advCalc.add(5, 10));

        // Abstraction Example
        Animal myDog = new Dog();
        myDog.makeSound();

        // Multiple Inheritance via Interface
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
