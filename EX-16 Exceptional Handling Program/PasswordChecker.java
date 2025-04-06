import java.util.Scanner;

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Create a password (min 8 chars, with special char): ");
            String password = sc.nextLine();
            
            if(password.length() < 8) 
                throw new WeakPasswordException("Password too short!");
            if(!password.matches(".*[!@#$%^&*()].*")) 
                throw new WeakPasswordException("Password needs a special character!");
            
            System.out.println("Password is strong!");
        } catch (WeakPasswordException e) {
            System.out.println("Weak Password: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}