import java.util.Arrays;
import java.util.List;

public class EmployeeList {
    public static List<Employee> getEmployees() {
        return Arrays.asList(
            new Employee("Alice", 1, 75000),
            new Employee("Bob", 2, 85000),
            new Employee("Charlie", 3, 65000),
            new Employee("David", 4, 95000),
            new Employee("Eve", 5, 55000),
            new Employee("Frank", 6, 105000),
            new Employee("Grace", 7, 72000),
            new Employee("Heidi", 8, 68000),
            new Employee("Ivan", 9, 91000),
            new Employee("Judy", 10, 80000)
        );
    }
}

