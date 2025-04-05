
import java.util.Scanner;
class TrafficSignal {
    String location;
    int defaultGreenTime;
    TrafficSignal() {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter signal location: ");
        location=obj.nextLine();
        System.out.print("Enter default green time (sec): ");
        defaultGreenTime=obj.nextInt();
    }
    void adjustTiming(int trafficDensity) {
        System.out.println("Adjusted timing: "+(defaultGreenTime+(trafficDensity*2))+" sec");
    }
}
public class TrafficSystem {
    public static void main(String[] args) {
        TrafficSignal signal1=new TrafficSignal();
        signal1.adjustTiming(5);
    }
}