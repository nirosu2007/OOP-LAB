import java.util.Scanner;
class Employee {
    private String name;
    private double baseSalary;
    private double bonus;
    public void setName(String name) { this.name = name; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
    public void setBonus(double bonus) { this.bonus = bonus; }
    public double calculateTotalSalary() { return baseSalary + bonus; }
    public String getName() { return name; }
}
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.print("Enter employee name: ");
        emp.setName(obj.nextLine());
        System.out.print("Enter base salary: ");
        emp.setBaseSalary(obj.nextDouble());
        System.out.print("Enter bonus: ");
        emp.setBonus(obj.nextDouble());
        System.out.println(emp.getName() + "'s total salary: " + emp.calculateTotalSalary());
    }
}