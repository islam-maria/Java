import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of x: ");
        x = input.nextInt();
        
        System.out.print("Enter the value of y: ");
        y = input.nextInt();
        
        x += y;
        System.out.println("x = " + x);
    }
}
