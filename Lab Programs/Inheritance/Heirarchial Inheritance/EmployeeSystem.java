//Q.Employee Management System
import java.util.Scanner;
class Employee {
    String name;
    int empId;
    void getBasicDetails() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name=obj.nextLine();
        System.out.print("Enter employee ID: ");
        empId=obj.nextInt();
    }
}
class FullTimeEmployee extends Employee {
    double monthlySalary;
    void getSalaryDetails() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter monthly salary: ");
        monthlySalary=obj.nextDouble();
    }
    void displaySalary() {
        System.out.println("Annual Salary: "+(monthlySalary*12));
    }
}
class PartTimeEmployee extends Employee {
    double hourlyRate;
    void getRateDetails() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter hourly rate: ");
        hourlyRate=obj.nextDouble();
    }
    void calculateWeeklyPay(int hours) {
        System.out.println("Weekly Pay: "+(hourlyRate*hours));
    }
}
public class EmployeeSystem {
    public static void main(String[] args) {
        FullTimeEmployee ft=new FullTimeEmployee();
        PartTimeEmployee pt=new PartTimeEmployee();
        System.out.println("Full-time Employee:");
        ft.getBasicDetails();
        ft.getSalaryDetails();
        ft.displaySalary();
        System.out.println("Part-time Employee:");
        pt.getBasicDetails();
        pt.getRateDetails();
        pt.calculateWeeklyPay(20);
    }
}