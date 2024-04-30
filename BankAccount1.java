abstract class BankAccount1 {
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    public BankAccount1(String depositorName, String accountNumber, String accountType) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0;
    }

    public abstract void assignInitialValues(double initialBalance);

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void display() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String depositorName, String accountNumber, String accountType) {
        
    }

   
    public void assignInitialValues(double initialBalance) {
        if (initialBalance >= 0) {
            this.Balance = initialBalance;
        } else {
            System.out.println("Initial balance must be non-negative.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

// Example usage:
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("John Doe", "123456", "Savings");
        savingsAccount.assignInitialValues(1000);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.display();
    }
}
