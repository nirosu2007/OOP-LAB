import java.util.Scanner;

abstract class UniversityMember {
    protected String name;
    protected int id;
    
    UniversityMember(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    abstract void displayRole();
    abstract void displayDetails();
}

class Student extends UniversityMember {
    private String major;
    private int semester;
    
    Student(String name, int id, String major, int semester) {
        super(name, id);
        this.major = major;
        this.semester = semester;
    }
    S
    void displayRole() {
        System.out.println("Role: Student");
    }
    
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Major: " + major);
        System.out.println("Semester: " + semester);
    }
}

class Professor extends UniversityMember {
    private String department;
    private String specialization;
    
    Professor(String name, int id, String department, String specialization) {
        super(name, id);
        this.department = department;
        this.specialization = specialization;
    }
    
    void displayRole() {
        System.out.println("Role: Professor");
    }
    
    void displayDetails() {
        System.out.println("Professor Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Specialization: " + specialization);
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter member type (student/professor):");
        String type = sc.next();
        
        System.out.println("Enter name:");
        String name = sc.next();
        
        System.out.println("Enter ID:");
        int id = sc.nextInt();
        
        UniversityMember member;
        
        if (type.equalsIgnoreCase("student")) {
            System.out.println("Enter major:");
            String major = sc.next();
            System.out.println("Enter semester:");
            int semester = sc.nextInt();
            member = new Student(name, id, major, semester);
        } else {
            System.out.println("Enter department:");
            String dept = sc.next();
            System.out.println("Enter specialization:");
            String spec = sc.next();
            member = new Professor(name, id, dept, spec);
        }
        
        member.displayRole();
        member.displayDetails();
        sc.close();
    }
}