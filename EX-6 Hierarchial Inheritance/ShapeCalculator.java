//Q.Shape Area Calculator
import java.util.Scanner;
class Shape {
    double dimension1,dimension2;
    void getDimensions() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter dimension1: ");
        dimension1=obj.nextDouble();
        System.out.print("Enter dimension2: ");
        dimension2=obj.nextDouble();
    }
}
class Rectangle extends Shape {
    void calculateArea() {
        System.out.println("Rectangle Area: "+(dimension1*dimension2));
    }
}
class Triangle extends Shape {
    void calculateArea() {
        System.out.println("Triangle Area: "+(0.5*dimension1*dimension2));
    }
}
public class ShapeCalculator {
    public static void main(String[] args) {
        Rectangle rect=new Rectangle();
        Triangle tri=new Triangle();
        System.out.println("Rectangle:");
        rect.getDimensions();
        rect.calculateArea();
        System.out.println("Triangle:");
        tri.getDimensions();
        tri.calculateArea();
    }
}