import java.util.Scanner;
class Light {
    void turnOn() {
        System.out.println("Standard light turned on");
    }
}
class SmartLight extends Light {
    void turnOn() {
        System.out.println("Smart light activated with voice control");
    }
}
public class LightControl {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Use smart light? (y/n): ");
        String choice = obj.next();
        Light light = choice.equals("y") ? new SmartLight() : new Light();
        light.turnOn();
    }
}