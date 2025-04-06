package sci.calculator.advanced;

import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdvancedMathOperations math = new AdvancedMathOperations();
        
        System.out.println("Scientific Calculator");
        System.out.println("1. Factorial");
        System.out.println("2. Power");
        System.out.println("3. Square Root");
        System.out.println("4. Logarithm (base 10)");
        System.out.println("5. Trigonometric Function");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();
        double result = 0;
        boolean valid = true;
        
        switch (choice) {
            case 1:
                System.out.print("Enter a positive integer: ");
                int num = scanner.nextInt();
                result = math.factorial(num);
                break;
            case 2:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter exponent: ");
                double exponent = scanner.nextDouble();
                result = math.power(base, exponent);
                break;
            case 3:
                System.out.print("Enter a number: ");
                double sqrtNum = scanner.nextDouble();
                result = math.squareRoot(sqrtNum);
                break;
            case 4:
                System.out.print("Enter a positive number: ");
                double logNum = scanner.nextDouble();
                result = math.logarithm(logNum);
                break;
            case 5:
                System.out.println("1. Sine");
                System.out.println("2. Cosine");
                System.out.println("3. Tangent");
                System.out.print("Choose trigonometric function: ");
                int trigChoice = scanner.nextInt();
                System.out.print("Enter angle in degrees: ");
                double angle = scanner.nextDouble();
                
                switch (trigChoice) {
                    case 1: result = math.sine(angle); break;
                    case 2: result = math.cosine(angle); break;
                    case 3: result = math.tangent(angle); break;
                    default: valid = false;
                }
                break;
            default:
                valid = false;
        }
        
        if (valid) {
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
}

