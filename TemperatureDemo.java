import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

double cels;//declare variable
double farn;//declare variable
System.out.print("Fahrenheit:");
farn=input.nextDouble();
cels=(farn-32)/1.8;
System.out.println("Celsius : " +cels);//output result

    
}}
