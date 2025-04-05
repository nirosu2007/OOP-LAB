import java.io.*;
import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = sc.nextLine();
        System.out.println("Enter marks for 5 subjects (space separated):");
        String[] marks = sc.nextLine().split(" ");
        
        try (PrintWriter pw = new PrintWriter(new FileWriter("grades.txt", true))) {
            pw.println(name + ": " + String.join(", ", marks));
        }
        
        System.out.println("Grade saved successfully!");
    }
}