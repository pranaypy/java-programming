class Employee {
    String name;
    double baseSalary;

    public Employee(String n, double bsal) {
        name = n;
        baseSalary = bsal;
    }

    void calculateSalary() {
        double totalSalary = baseSalary + (baseSalary * 0.05); 
        System.out.printf("%s's Total Salary: %.2f%n", name, totalSalary);
    }
}

class Manager extends Employee {
    Manager(String name, double baseSalary) {
        super(name, baseSalary); 
    }

    void calculateSalary() {
        double totalSalary = baseSalary + (baseSalary * 0.05) + 2000.00; 
        System.out.printf("%s's Total Salary: %.2f%n", name, totalSalary);
    }
}

class Executive extends Manager {
    Executive(String name, double baseSalary) {
        super(name, baseSalary); 
    }

    void calculateSalary() {
        double totalSalary = baseSalary + (baseSalary * 0.05) + 2000.00 + (baseSalary * 0.10); 
        System.out.printf("%s's Total Salary: %.2f%n", name, totalSalary);
    }
}

public class MultiTierPayrollSystem {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 10000);
        Manager mgr = new Manager("Bob", 10000);
        Executive exec = new Executive("Charlie", 10000);

        emp.calculateSalary();
        mgr.calculateSalary();
        exec.calculateSalary();
    }
}