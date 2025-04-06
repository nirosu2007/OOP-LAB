//Q.Student Grade Calculator
import java.util.Scanner;
class Student {
    String name;
    int rollNo;
    void getStudentInfo() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name=obj.nextLine();
        System.out.print("Enter Roll No: ");
        rollNo=obj.nextInt();
    }
    void displayStudentInfo() {
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
    }
}
class GradeCalculator extends Student {
    int marks1, marks2, marks3;
    double avg;
    void getMarks() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Marks in Subject 1: ");
        marks1=obj.nextInt();
        System.out.print("Enter Marks in Subject 2: ");
        marks2=obj.nextInt();
        System.out.print("Enter Marks in Subject 3: ");
        marks3=obj.nextInt();
    }
    void calculateGrade() {
        avg=(marks1+marks2+marks3)/3.0;
        System.out.print("Grade: ");
        if (avg >= 90){
		 System.out.println("A");
	}
        else if (avg >= 80){
		System.out.println("B");
	}
        else if (avg >= 70){
		 System.out.println("C");
	}
        else if (avg >= 60){
		 System.out.println("D");
	}
        else{
		 System.out.println("F");
	}
    }
}
public class StudentGradeSystem {
    public static void main(String[] args) {
        GradeCalculator student = new GradeCalculator();
        student.getStudentInfo();
        student.getMarks();
        student.displayStudentInfo();
        student.calculateGrade();
    }
}