//Business Logic using Streams & Lambda
package AdvancedJava;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {
    private List<Employee> employees;

    public EmployeeService(List<Employee> employees) {
        this.employees = employees;
    }

    // 1. Filter Employees by Salary
    public List<Employee> getEmployeesWithSalaryAbove(double salary) {
        return employees.stream()
                .filter(emp -> emp.getSalary() > salary)
                .collect(Collectors.toList());
    }

    // 2. Sort Employees by Salary
    public List<Employee> sortEmployeesBySalary() {
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
    }

    // 3. Get Average Salary of Employees
    public double getAverageSalary() {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }

    // 4. Group Employees by Department
    public Map<String, List<Employee>> groupByDepartment() {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
