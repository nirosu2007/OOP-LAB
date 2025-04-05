import java.util.Scanner;

interface TempConverter {
    double convert(double temp);
}

class CelsiusToFahrenheit implements TempConverter {
    public double convert(double temp) { return (temp * 9/5) + 32; }
}

class FahrenheitToCelsius implements TempConverter {
    public double convert(double temp) { return (temp - 32) * 5/9; }
}

public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        double temp = sc.nextDouble();
        
        System.out.println("Convert to (1-Celsius→Fahrenheit, 2-Fahrenheit→Celsius): ");
        int choice = sc.nextInt();
        
        TempConverter converter;
        if (choice == 1) converter = new CelsiusToFahrenheit();
        else converter = new FahrenheitToCelsius();
        
        System.out.println("Converted Temp: " + converter.convert(temp));
        sc.close();
    }
}