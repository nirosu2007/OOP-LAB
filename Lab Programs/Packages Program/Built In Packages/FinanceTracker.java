import java.util.Scanner;          
import java.text.DecimalFormat;  
import java.time.LocalDate;       

public class FinanceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("₹#,##0.00");
        
        System.out.println("Personal Finance Tracker");
        System.out.println("-------------------------");
        
        System.out.print("Enter your monthly income: ");
        double income = scanner.nextDouble();
        
        System.out.print("Enter number of expense categories: ");
        int categories = scanner.nextInt();
        
        double totalExpenses = 0;
        for (int i = 1; i <= categories; i++) {
            System.out.print("Enter expense category " + i + " name: ");
            String category = scanner.next();
            
            System.out.print("Enter amount spent on " + category + ": ");
            double amount = scanner.nextDouble();
            totalExpenses += amount;
        }
        
        double savings = income - totalExpenses;
        LocalDate today = LocalDate.now();
        
        System.out.println("\nFinancial Summary for " + today.getMonth() + " " + today.getYear());
        System.out.println("Total Income: " + df.format(income));
        System.out.println("Total Expenses: " + df.format(totalExpenses));
        System.out.println("Net Savings: " + df.format(savings));
        
        if (savings < 0) {
            System.out.println("Warning: You're spending more than you earn!");
        } else if (savings < income * 0.2) {
            System.out.println("Advice: Try to save at least 20% of your income.");
        } else {
            System.out.println("Great job with your savings!");
        }
        
        scanner.close();
    }
}