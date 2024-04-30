import java.util.Scanner;
public class InputDemo 
    {
    
   public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        String name;
        System.out.println("Enter Your name :");
        name = input.nextLine();
        System.out.println("WElcome : "+name);
       input.close();
    }
}

