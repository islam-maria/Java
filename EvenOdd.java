import java.util.Scanner;
public class EvenOdd {
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.println("Enter a positive number : ");
         number=input.nextInt();
        if(number%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    
}
