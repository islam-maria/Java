import java.util.Scanner;
public class BankAccountTest {
    public static void main(String[] args) {
        System.out.println("Menu\n What do you want? \n 1.Create Account \n 2.Deposit\n 3.Withdraw");
        Scanner input=new Scanner(System.in);
        int choice=input.nextInt();
        if(choice==1)
        {
            System.out.println("Enter your name:");
            String name=input.next();
            System.out.println("Enter your account number:");
            int accountNumber=input.nextInt();
            System.out.println("Enter your account type:");
            String accountType=input.next();
            System.out.println("Enter your balance:");
            double balance=input.nextDouble();
            BankAccount account=new BankAccount(name,accountNumber,accountType,balance);
            account.display();
            account.deposit( balance);
            account.withdraw(balance);

        }

       
    }
    
}
