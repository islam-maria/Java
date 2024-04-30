import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Donor {
    private String name;
    private String bloodGroup;
    private String contactNumber;

    public Donor(String name, String bloodGroup, String contactNumber) {
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.contactNumber = contactNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}

class DonorList {
    private List<Donor> donors;

    public DonorList() {
        donors = new ArrayList<>();
    }

    public void addDonor(Donor donor) {
        donors.add(donor);
    }

    public List<Donor> getAllDonors() {
        return donors;
    }
}

public class Main {
    private DonorList donorList;
    private Scanner scanner;

    public Main() {
        donorList = new DonorList();
        scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;
        do {
            System.out.println("1. Add a new donor");
            System.out.println("2. View all donors");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNewDonor();
                    break;
                case 2:
                    viewAllDonors();
                    break;

            }
        } while (choice != 3);
    }

    private void addNewDonor() {
        System.out.println("Enter donor details:");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Blood Group: ");
        String bloodGroup = scanner.next();
        System.out.print("Contact Number: ");
        String contactNumber = scanner.next();

        Donor newDonor = new Donor(name, bloodGroup, contactNumber);
        donorList.addDonor(newDonor);

        System.out.println("Donor added successfully!");
    }

    private void viewAllDonors() {
        List<Donor> allDonors = donorList.getAllDonors();
        System.out.println("All Donors:");

        for (Donor donor : allDonors) {
            System.out.println("Name: " + donor.getName() +
                    ", Blood Group: " + donor.getBloodGroup() +
                    ", Contact Number: " + donor.getContactNumber());
        }
    }

    public static void main(String[] args) {
        Main bloodDonationSystem = new Main();
        bloodDonationSystem.start();
    }
}