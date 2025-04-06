import java.util.Scanner;

abstract class BankAccount {
    protected String accountNumber;
    protected double balance;
    
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract void displayBalance();
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited.");
    }
   
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    
    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
    
    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest: " + interest);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter account number:");
        String accNum = sc.next();
        
        System.out.println("Enter initial balance:");
        double balance = sc.nextDouble();
        
        System.out.println("Enter interest rate:");
        double rate = sc.nextDouble();
        
        SavingsAccount account = new SavingsAccount(accNum, balance, rate);
        
        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Display Balance\n4. Calculate Interest\n5. Exit");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    account.calculateInterest();
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}