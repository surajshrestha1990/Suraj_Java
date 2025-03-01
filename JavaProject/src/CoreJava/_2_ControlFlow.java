package CoreJava;/*
 * Control Flow Statements in Java
 * ---------------------------------
 * - If-Else: Executes a block of code based on a condition.
 * - Switch Case: Selects a block of code to execute based on multiple conditions.
 * - Loops: Execute a block of code multiple times.
 *   - for: Used when the number of iterations is known.
 *   - while: Used when the number of iterations is unknown but depends on a condition.
 *   - do-while: Ensures execution at least once before checking the condition.
 * - Break: Terminates the loop or switch statement.
 * - Continue: Skips the current iteration and moves to the next iteration.
 *
 * Key Points to Remember:
 * - If-Else is useful for simple conditional checks.
 * - Switch Case is optimized for multiple conditions but works only with specific data types (int, char, String, etc.).
 * - for loops are best for fixed iterations, while loops are better for indefinite conditions.
 * - do-while loops ensure execution at least once.
 * - Break stops a loop entirely, while Continue skips the current iteration and moves to the next.
 */

public class _2_ControlFlow {
    public static void main(String[] args) {
        // If-Else Example
        int num = 10;
        if (num > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

        // Switch Case Example
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }

        // For Loop Example
        System.out.print("For Loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While Loop Example
        int count = 1;
        System.out.print("While Loop: ");
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        // Do-While Loop Example
        int num2 = 1;
        System.out.print("Do-While Loop: ");
        do {
            System.out.print(num2 + " ");
            num2++;
        } while (num2 <= 5);
        System.out.println();

        // Break Example
        System.out.print("Break Example: ");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exits the loop when i == 3
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Continue Example
        System.out.print("Continue Example: ");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skips the iteration when i == 3
            }
            System.out.print(i + " ");
        }
    }
}
