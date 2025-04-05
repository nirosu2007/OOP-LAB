import java.util.Scanner;

interface PaymentMethod {
    void pay(double amount);
}

class CreditCard implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Credit Card.");
    }
}

class UPI implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI.");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amt = sc.nextDouble();
        
        System.out.println("Choose payment (1-Credit Card, 2-UPI): ");
        int choice = sc.nextInt();
        
        PaymentMethod payment;
        if (choice == 1) payment = new CreditCard();
        else payment = new UPI();
        
        payment.pay(amt);
        sc.close();
    }
}