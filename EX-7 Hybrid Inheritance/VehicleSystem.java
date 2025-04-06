//Q.Vehicle Manufacturing System
import java.util.Scanner;
class Vehicle {
    String model;
    void getModel() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter model: ");
        model=obj.nextLine();
    }
}
class Engine {
    String engineType;
    void getEngineType() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter engine type: ");
        engineType=obj.nextLine();
    }
}
class Car extends Vehicle {
    int seatingCapacity;
    void getSeatingCapacity() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter seating capacity: ");
        seatingCapacity=obj.nextInt();
    }
}
class ElectricCar extends Car {
    int batteryCapacity;
    void getBatteryCapacity() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter battery capacity: ");
        batteryCapacity=obj.nextInt();
    }
}
public class VehicleSystem {
    public static void main(String[] args) {
        ElectricCar ec=new ElectricCar();
        ec.getModel();
        ec.getSeatingCapacity();
        ec.getBatteryCapacity();
    }
}