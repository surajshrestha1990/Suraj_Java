package AdvancedJava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 70000, "IT"),
                new Employee(2, "Bob", 50000, "HR"),
                new Employee(3, "Charlie", 60000, "IT"),
                new Employee(4, "David", 40000, "Finance"),
                new Employee(5, "Eve", 80000, "IT")
        );

        EmployeeService service = new EmployeeService(employees);

        // 1. Filter employees with salary > 50,000
        System.out.println("Employees with salary above 50,000:");
        service.getEmployeesWithSalaryAbove(50000).forEach(System.out::println);

        // 2. Sort employees by salary (descending)
        System.out.println("\nEmployees sorted by salary:");
        service.sortEmployeesBySalary().forEach(System.out::println);

        // 3. Calculate average salary
        System.out.println("\nAverage salary: " + service.getAverageSalary());

        // 4. Group employees by department
        System.out.println("\nEmployees grouped by department:");
        Map<String, List<Employee>> groupedByDept = service.groupByDepartment();
        groupedByDept.forEach((dept, empList) -> {
            System.out.println(dept + ": " + empList);
        });
    }
}
