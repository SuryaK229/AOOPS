import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Surya", 3, 50000));
        employees.add(new Employee("Varun", 1, 60000));
        employees.add(new Employee("Kushal", 2, 55000));

        System.out.println("Original List:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Collections.sort(employees);
        System.out.println("\nSorted by ID:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Collections.sort(employees, Employee.NameComparator);
        System.out.println("\nSorted by Name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Collections.sort(employees, Employee.SalaryComparator);
        System.out.println("\nSorted by Salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Employee original = employees.get(0);
        Employee clone = original.clone();
        System.out.println("\nOriginal Employee: " + original);
        System.out.println("Cloned Employee: " + clone);
    }
}
