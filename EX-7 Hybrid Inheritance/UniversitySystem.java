//Q.University Managment System
import java.util.Scanner;
class Person {
    String name;
    void getName() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter name: ");
        name=obj.nextLine();
    }
}
class Student extends Person {
    int rollNo;
    void getRollNo() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter roll number: ");
        rollNo=obj.nextInt();
    }
}
class Faculty extends Person {
    String department;
    void getDepartment() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter department: ");
        department=obj.nextLine();
    }
}
class ResearchAssistant extends Student {
    String researchTopic;
    void getResearchTopic() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter research topic: ");
        researchTopic=obj.nextLine();
    }
}
public class UniversitySystem {
    public static void main(String[] args) {
        ResearchAssistant ra=new ResearchAssistant();
        Faculty prof=new Faculty();
        ra.getName();
        ra.getRollNo();
        ra.getResearchTopic();
        prof.getName();
        prof.getDepartment();
    }
}