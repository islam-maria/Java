abstract class BankAccount1 //Initializing an abstruct class Bank Account1
{
    private String depositorName;//initializing a bank depositor name 
    private String accountNumber;//initializing a bank Account Number 
    private String accountType;//initializing a bank Accoun Type 
    private double balance;//initializing a bank doublr balance

    public BankAccount1(String depositorName, String accountNumber, String accountType) //this is a constructor
    {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0;
    }

    public abstract void assignInitialValues(double initialBalance);//To assign initial values

    public abstract void deposit(double amount);//This is a abstruct method named deposit

    public abstract void withdraw(double amount);//This is a abstruct method named withdraw 

    public void display() {
        System.out.println("The Depositor Name: " + depositorName);
        System.out.println("The Account Number: " + accountNumber);
        System.out.println("The Account Type: " + accountType);
        System.out.println("The Balance: $" + balance);
    }
}


    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
            display();
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

   
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
            display();
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }


// Example usage:
public class Main //main class
{
    public static void main(String[] args) //main function
    {
        
        
    }
}
