import java.util.Scanner;
public class AndDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char masters;
        char english;
        System.out.println("Have you completed Masters? (y/n)");
        masters = input.next().charAt(0);
        System.out.println("Have you fluent in English? (y/n)");
        english = input.next().charAt(0);
        if(masters == 'y' && english == 'y')
        {
            System.out.println("You are eligible for the job");
        }
        else {
            System.out.println("You are not eligible for the job");
        }
    }
    
}
