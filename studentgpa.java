import java.util.Scanner;

class Student {
    String name;
    String roll;
    String semester;
    double[] marks;
    double[] credits;

    public Student(String name, String roll, String semester, int noSubs) {
        this.name = name;
        this.roll = roll;
        this.semester = semester;
        this.marks = new double[noSubs];
        this.credits = new double[noSubs];
    }
}

public class SGPAall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Number of Students: ");
        int noStudents = in.nextInt();
        in.nextLine();

        Student[] students = new Student[noStudents];

        for (int i = 0; i < noStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = in.nextLine();

            System.out.print("Roll: ");
            String roll = in.nextLine();

            System.out.print("Semester: ");
            String semester = in.nextLine();

            System.out.print("Number of Subjects: ");
            int noSubs = in.nextInt();
            in.nextLine();

            students[i] = new Student(name, roll, semester, noSubs);

            System.out.println("Input Marks and Credits for " + students[i].name);

            for (int j = 0; j < noSubs; j++) {
                System.out.print("CSE210" + (j + 1) + " Marks: ");
                students[i].marks[j] = in.nextDouble();
                System.out.print("CSE210" + (j + 1) + " Credits: ");
                students[i].credits[j] = in.nextDouble();
            }
            in.nextLine();
        }

        System.out.println("\nClass Result:");
        System.out.println("Name\tRoll\tSemester\tSubject\tMark\tCredit\tSGPA");

        for (Student student : students) {
            System.out.print(student.name + "\t" + student.roll + "\t" + student.semester + "\n");

            for (int j = 0; j < student.marks.length; j++) {
                double grade = point(student.marks[j]);
                double sgpa = (student.credits[j] * grade) / student.credits[j];
                System.out.println("\t\t\t\t" + "CSE210" + (j + 1) + "\t" + student.marks[j] + "\t" + student.credits[j] + "\t" + sgpa);
            }
            System.out.println("________________________________________________________");
        }

        in.close();
    }

    private static double point(double x) {
        if (x >= 80) {
            return 4.00;
        } else if (x >= 70) {
            return 3.75;
        } else if (x >= 60) {
            return 3.50;
        } else if (x >= 50) {
            return 3.00;
        } else if (x >= 45) {
            return 2.50;
        } else if (x >= 40) {
            return 2.00;
        } else {
            return 0.00;
        }
    }
}