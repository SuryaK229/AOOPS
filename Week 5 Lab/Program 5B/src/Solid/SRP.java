package Solid;

class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}

class SalaryCalculator {
    public double calculate(Employee employee) {
        switch (employee.getRole()) {
            case "Developer":
                return 60000;
            case "Manager":
                return 80000;
            default:
                return 50000;
        }
    }
}

public class SRP {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "Developer");
        SalaryCalculator calculator = new SalaryCalculator();
        double salary = calculator.calculate(emp);
        System.out.println(emp.getName() + "'s salary is: " + salary);
    }
}
