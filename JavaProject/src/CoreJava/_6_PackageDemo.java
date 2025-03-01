/*
 * Packages & Access Modifiers in Java
 * -----------------------------------
 * - Packages help organize classes and avoid name conflicts.
 * - Access Modifiers control the visibility of classes, methods, and variables.
 * - Four Access Modifiers:
 *   1. private    - Accessible only within the class.
 *   2. default    - Accessible within the same package.
 *   3. protected  - Accessible within the same package and subclasses.
 *   4. public     - Accessible from anywhere.
 * - Static Import allows using static methods/constants directly without class reference.
 */

// Defining a package
package CoreJava;
// Importing built-in packages
import static java.lang.Math.*;  // Static import for Math methods

// Class demonstrating different access modifiers
class AccessModifiersExample {
    private String privateVar = "Private Variable";
    String defaultVar = "Default Variable"; // Default (package-private)
    protected String protectedVar = "Protected Variable";
    public String publicVar = "Public Variable";

    // Private method (accessible only within the class)
    private void privateMethod() {
        System.out.println("Private Method");
    }

    // Public method to display variable values
    public void showVariables() {
        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}

// Class in the same package
class SamePackageClass {
    void accessTest() {
        AccessModifiersExample obj = new AccessModifiersExample();
        // obj.privateVar;  // ❌ Error: Cannot access private members
        System.out.println(obj.defaultVar);  // ✅ Accessible (same package)
        System.out.println(obj.protectedVar); // ✅ Accessible (same package)
        System.out.println(obj.publicVar);   // ✅ Accessible (public)
    }
}



public class _6_PackageDemo {
    public static void main(String[] args) {
        AccessModifiersExample obj = new AccessModifiersExample();
        obj.showVariables();  // ✅ Display variable values

        // Using static import
        System.out.println("Square root of 16: " + sqrt(16)); // Directly using sqrt()
    }
}
