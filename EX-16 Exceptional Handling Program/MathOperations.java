import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            double num1 = Double.parseDouble(sc.nextLine());
            
            System.out.print("Enter second number: ");
            double num2 = Double.parseDouble(sc.nextLine());
            
            System.out.print("Enter operation (+, -, *, /): ");
            char op = sc.nextLine().charAt(0);
            
            switch(op) {
                case '+': System.out.println("Result: " + (num1+num2)); break;
                case '-': System.out.println("Result: " + (num1-num2)); break;
                case '*': System.out.println("Result: " + (num1*num2)); break;
                case '/': 
                    if(num2 == 0) throw new ArithmeticException("Division by zero!");
                    System.out.println("Result: " + (num1/num2)); 
                    break;
                default: throw new IllegalArgumentException("Invalid operation!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}