import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(sc.nextLine());
            if(age < 0) throw new InvalidAgeException("Age cannot be negative!");
            if(age > 120) throw new InvalidAgeException("Age seems unrealistic!");
            System.out.println("Valid age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number!");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}