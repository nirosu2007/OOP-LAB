import java.util.Scanner;
class Payment {
    void processPayment() {
        System.out.println("Processing cash payment");
    }
}
class MobilePayment extends Payment {
    void processPayment() {
        System.out.println("Processing mobile wallet payment");
    }
}
public class TransferApp {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Pay with mobile? (y/n): ");
        String choice = obj.next();
        Payment payment = choice.equals("y") ? new MobilePayment() : new Payment();
        payment.processPayment();
    }
}