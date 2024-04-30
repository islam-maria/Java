import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n, count = 0;//declare variable
        
        System.out.println("Enter the initial number : ");

        m = input.nextInt();//scan first number
        System.out.println("Enter the final number : ");
        n = input.nextInt();//scan last number
        for (int i = m; i <= n; i++) {
            for (int j = 2; j <= i - 1; j++) {

                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i>1)
                System.out.println(i);//print result
            count = 0;

        }

    }
}
