import java.util.Scanner;

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter marks obtained (out of 100): ");
            double marks = Double.parseDouble(sc.nextLine());
            
            if(marks < 0 || marks > 100) 
                throw new InvalidGradeException("Marks must be between 0 and 100");
                
            String grade;
            if(marks >= 90) grade = "A";
            else if(marks >= 80) grade = "B";
            else if(marks >= 70) grade = "C";
            else if(marks >= 60) grade = "D";
            else grade = "F";
            
            System.out.println("Grade: " + grade);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number!");
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}