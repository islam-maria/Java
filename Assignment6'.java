import java.util.Scanner;
public class Assignment6' {
    public static void main(String[] args)//FINDING VOWEL USING LOGICAL OR 
    {
        Scanner input = new Scanner(System.in);
        char ch;
        ch=input.next().charAt(0) ;//a
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
    
}
