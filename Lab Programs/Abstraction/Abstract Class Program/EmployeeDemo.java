import java.util.Scanner;

abstract class Employee {
    protected String name;
    protected int id;
    
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    abstract double calculateSalary();
    abstract void displayDetails();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;
    
    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    
    double calculateSalary() {
        return monthlySalary;
    }
    
    void displayDetails() {
        System.out.println("Full-time Employee:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    
    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    
    void displayDetails() {
        System.out.println("Part-time Employee:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter employee type (fulltime/parttime):");
        String type = sc.next();
        
        System.out.println("Enter name:");
        String name = sc.next();
        
        System.out.println("Enter ID:");
        int id = sc.nextInt();
        
        Employee emp;
        
        if (type.equalsIgnoreCase("fulltime")) {
            System.out.println("Enter monthly salary:");
            double salary = sc.nextDouble();
            emp = new FullTimeEmployee(name, id, salary);
        } else {
            System.out.println("Enter hourly rate:");
            double rate = sc.nextDouble();
            System.out.println("Enter hours worked:");
            int hours = sc.nextInt();
            emp = new PartTimeEmployee(name, id, rate, hours);
        }
        
        emp.displayDetails();
        System.out.println("Calculated Salary: " + emp.calculateSalary());
        sc.close();
    }
}