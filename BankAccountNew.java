
    
import java.util.Scanner;

class Bank {
    private String accountHolderName;
    private int accountNumber;
    private double balance;
     

    // Constructor
    public Bank(String accountHolderName, int accountNumber, double balance) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Display account information
    public void displayInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        displayBalance();
    }

    // Display account balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

public class BankAccountNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a bank account
        
        Bank account = createAccount();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Account Information");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;

                case 3:
                    account.displayInfo();
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (choice != 4);

        scanner.close();
    }

    private static Bank createAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Banking System!");
        System.out.print("Enter your name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();

        return new Bank(accountHolderName, accountNumber, 1000);
    }
}

