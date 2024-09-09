import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeList.getEmployees();

        List<Employee> filteredEmployees = employees.stream()
            .filter(e -> e.getSalary() > 70000)
            .toList();

        System.out.println("Filtered Employees (Salary > 70,000):");
        filteredEmployees.forEach(System.out::println);

        List<Employee> sortedEmployees = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary))
            .toList();

        System.out.println("\nSorted Employees (By Salary):");
        sortedEmployees.forEach(System.out::println);

        double highestSalary = employees.stream()
            .mapToDouble(Employee::getSalary)
            .max()
            .orElseThrow(() -> new RuntimeException("No employees found"));

        System.out.println("\nHighest Salary: " + highestSalary);

        OptionalDouble averageSalary = employees.stream()
            .mapToDouble(Employee::getSalary)
            .average();

        System.out.println("Average Salary: " + (averageSalary.isPresent() ? averageSalary.getAsDouble() : "No employees found"));
    }
}
