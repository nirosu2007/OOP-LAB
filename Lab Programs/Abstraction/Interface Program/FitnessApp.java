import java.util.Scanner;

interface FitnessTracker {
    void trackSteps(int steps);
    void trackCalories(int calories);
    void trackDistance(double km);
}

class BasicTracker implements FitnessTracker {
    public void trackSteps(int steps) { System.out.println("Steps: " + steps); }
    public void trackCalories(int calories) { System.out.println("Calories: " + calories); }
    public void trackDistance(double km) { System.out.println("Distance: " + km + " km"); }
}

public class FitnessApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FitnessTracker tracker = new BasicTracker();
        
        System.out.println("Enter steps: ");
        tracker.trackSteps(sc.nextInt());
        
        System.out.println("Enter calories burned: ");
        tracker.trackCalories(sc.nextInt());
        
        System.out.println("Enter distance (km): ");
        tracker.trackDistance(sc.nextDouble());
        
        sc.close();
    }
}