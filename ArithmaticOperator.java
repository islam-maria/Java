
import java.util.Scanner;
public class ArithmaticOperator {
  public static void main(String[] args)
  {
    int num1,num2,result;
    Scanner input = new Scanner(System.in);
   
     System.out.print("Enter first number :\n");
    num1 = input.nextInt();
     System.out.print("Enter second number :\n");
     num2 = input.nextInt();
    result = num1+num2;
    System.out.println("Sum = "+result);
     result = num1-num2;
    System.out.println("Sub = "+result);
     result = num1*num2;
    System.out.println("Mul = "+result);
     result =  (num1/num2) ;
    System.out.println("Div = "+result);
  }
    
}
