import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>, Cloneable {
    private String name;
    private int id;
    private double salary;


    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e1.getSalary(), e2.getSalary());
        }
    };

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can't happen
        }
    }
}

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
