import java.util.Scanner;
public class PowerDemo {
    //Function to calculate power:m raise to the power n
    public static double power(double m,int n)
    {
        return Math.pow(m,n);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the base(m)");
        double base=scanner.nextDouble();
        System.out.println("Enter the exponent(n,optional for squares,default is 2):");
        int exponent;
        if(scanner.hasNextInt()){
            exponent=scanner.nextInt();

        }
        else{
            //Default value of 2 for exponent when ommited
            exponent=2;
        }
        //Calculate power using the power() function
        double result=power(base,exponent);
        System.out.println("Result is:"+result);
        scanner.close();
    }}

    

