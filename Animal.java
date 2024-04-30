import java.util.Scanner;

abstract class Janoar {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void suck();
}

class Dog extends Janoar {

    public void suck() {
        System.out.println(getName() + " is eating.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pet Name: ");
        String dogName = scanner.nextLine();

        Dog myDog = new Dog();

        myDog.setName(dogName);

        System.out.println("Pet name: " + myDog.getName());
        myDog.eat();
    }
}