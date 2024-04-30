import java.util.Scanner;
public class VowelConsonant   
 {
    public static void main(String[] args)//FINDING VOWEL USING LOGICAL OR 
    {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character : ");
        ch=input.next().charAt(0) ;//a
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
    
}


