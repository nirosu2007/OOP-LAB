import java.util.Scanner;

class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String message) {
        super(message);
    }
}

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = Double.parseDouble(sc.nextLine());
            
            // Absolute zero check
            if(celsius < -273.15) 
                throw new InvalidTemperatureException("Temperature cannot be below absolute zero (-273.15°C)");
                
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.printf("%.2f°C = %.2f°F\n", celsius, fahrenheit);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number!");
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}