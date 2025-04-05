import java.util.Scanner;

class Thermostat {
    private double currentTemp;
    private boolean isEnergySaving;

    public void setTemperature(double temp) {
        if (temp < 10 || temp > 35) {
            System.out.println("Invalid temperature! Setting to nearest safe value (10°C-35°C).");
            this.currentTemp = (temp < 10) ? 10 : 35;
            this.isEnergySaving = true;
        } else {
            this.currentTemp = temp;
            this.isEnergySaving = (temp >= 30 || temp <= 15);
        }
    }

    public double getTemperature() {
        return currentTemp;
    }

    public String getStatus() {
        return "Current: " + currentTemp + "°C | Energy Saving: " + (isEnergySaving ? "ON" : "OFF");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Thermostat thermo = new Thermostat();

        System.out.print("Enter desired temperature (°C): ");
        thermo.setTemperature(obj.nextDouble());

        System.out.println(thermo.getStatus());
    }
}