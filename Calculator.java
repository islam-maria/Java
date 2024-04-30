import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
     while(true){
    System.out.println("Menu \n 1.Add \n 2.Subtract \n 3.Multiplication \n 4.Division \n 5.Exit \n Enter your choice : ");
    int choice=input.nextInt();
   
    switch(choice){
        case 1:
            System.out.println("Addition");
            System.out.println("Enter first number : ");
            double num1=input.nextDouble();
            System.out.println("Enter second number : ");
            double num2=input.nextDouble();
            double result1=num1+num2;
            System.out.println("Sum="+result1);
            break;
            case 2:
            System.out.println("Subtraction");
            System.out.println("Enter first number : ");
            double num3=input.nextDouble();
            System.out.println("Enter second number : ");
            double num4=input.nextDouble();
            double result2=num3-num4;
            System.out.println("Sub="+result2);
            break;
            case 3:
            System.out.println("Multiplication");
            System.out.println("Enter first number : ");
            double num5=input.nextDouble();
            System.out.println("Enter second number : ");
            double num6=input.nextDouble();
            double result3=num5*num6;
            System.out.println("Mal="+result3);
            break;
            case 4:
            System.out.println("Division");
            System.out.println("Enter first number : ");
            double num7=input.nextDouble();
            System.out.println("Enter second number : ");
            double num8=input.nextDouble();
            double result4=num7/num8;
            System.out.println("Sub="+result4);
            break;
            case 5:
            break;}}
    }
    
    }   
    
    

