//Q.Banking System(Account-SavingsAccount-Premium Saving Account)
import java.util.Scanner;
class Account {
    String accHolder;
    void getAccHolder() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Account Holder: ");
        accHolder = obj.nextLine();
    }
    void displayAccHolder() {
        System.out.println("Account Holder: " + accHolder);
    }
}
class SavingsAccount extends Account {
    double balance;
    void getBalance() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Balance: ");
        balance = obj.nextDouble();
    }
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
class PremiumSavingsAccount extends SavingsAccount {
    double bonusInterest;
    void calculateBonusInterest() {
        bonusInterest = balance * 0.1;
        System.out.println("Bonus Interest: " + bonusInterest);
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        PremiumSavingsAccount acc = new PremiumSavingsAccount();
        acc.getAccHolder();
        acc.getBalance();
        acc.displayAccHolder();
        acc.displayBalance();
        acc.calculateBonusInterest();
    }
}