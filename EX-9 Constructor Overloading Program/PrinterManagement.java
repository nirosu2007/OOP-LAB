//Q.3D printing job management system
import java.util.Scanner;
class PrintJob {
    String jobId;
    String material;
    double volume;
    int estimatedHours;
    
    PrintJob() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter job ID: ");
        jobId = obj.nextLine();
        System.out.print("Enter material (PLA/ABS): ");
        material = obj.nextLine();
        System.out.print("Enter volume (cm³): ");
        volume = obj.nextDouble();
        estimatedHours = (int)(volume * 0.5);
    }
    
    PrintJob(String id, String mat) {
        jobId = id;
        material = mat;
        volume = 50.0;
        estimatedHours = (int)(volume * (mat.equals("ABS") ? 0.6 : 0.5));
    }
    
    PrintJob(String id, String mat, double vol) {
        jobId = id;
        material = mat;
        volume = vol;
        estimatedHours = (int)(vol * (mat.equals("ABS") ? 0.6 : 0.5));
    }
    
    void displayJobDetails() {
        System.out.println("Job "+jobId+": "+volume+"cm³ of "+material+
                         " (Est. "+estimatedHours+" hours)");
    }
    
    void calculateCost() {
        double rate = material.equals("ABS") ? 0.15 : 0.10;
        System.out.println("Estimated cost: $"+String.format("%.2f", volume*rate));
    }
}

public class PrinterManagement {
    public static void main(String[] args) {
        PrintJob defaultJob = new PrintJob();
        PrintJob absJob = new PrintJob("JOB-002", "ABS");
        PrintJob largeJob = new PrintJob("JOB-003", "PLA", 120.5);
        
        defaultJob.displayJobDetails();
        defaultJob.calculateCost();
        
        absJob.displayJobDetails();
        absJob.calculateCost();
        
        largeJob.displayJobDetails();
        largeJob.calculateCost();
    }
}