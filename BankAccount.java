
import java.util.Scanner;

class MariaBank {
    String accountName;
    int accNumber;
    double balance;

    public MariaBank(String accountName, int accountNumber, double balance) {

        this.accountName = accountName;
        this.accNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 1000) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayInfo() {
        System.out.println("Account Holder: " + accountName);
        System.out.println("Account Number: " + accNumber);
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args) main method 
    {
        Scanner scanner = new Scanner(System.in);

    
        
        MariaBank account = createAccount();

        int value;
        do {
            System.out.println("\nMenu: \n 1.Deposit \n 2.Withdraw \n 3.Account Information \n 4.Exit \n Enter your choice:");//printing the main menu
            
            value = scanner.nextInt();

            switch (value) {
                case 1:
                    System.out.print("Credited: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Debited: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;

                case 3:
                    account.displayInfo();
                    break;

                case 4:
                    System.out.println("Finished");
                    break;

                default:
                    System.out.println("!!!Error!!!");
                    break;
            }

        } while (value != 4);

        scanner.close();
    }

    private static MariaBank createAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shagotom");
        System.out.print("Insert NAME: ");
        String accountName = scanner.nextLine();

        System.out.print("Insert acc. no: ");
        int accNumber = scanner.nextInt();

        return new MariaBank(accountName, accNumber, 10500);
    }
}
