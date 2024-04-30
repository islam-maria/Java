 import java.util.Scanner;
public class studentgpa{
    private String stdname;
    private String stdrollNumber;
    private int semester;
    private String[] subjectCodes;
    private int[] Credits;
    private double[] Marks;
    public Student(String stdname, String stdrollNumber, int semester, String[] subjectCodes, int[] Credits, double[] Marks) {
        this.stdname = stdname;
        this.stdrollNumber = stdrollNumber;
        this.semester = semester;
        this.subjectCodes =subjectCodes;
        this.Credits=Credits;
        this.Marks = Marks;
    }
    public String getName() {
        return stdname;
    }

    public String getRollNumber() {
        return stdrollNumber;
    }

    public int getSemester() {
        return semester;
    }

    public String[] getSubjectCodes() {
        return subjectCodes;
    }

    public int[] getSubjectCredits() {
        return Credits;
    }

    public double[] getSubjectMarks() {
        return Marks;
    }
    private static double GradePoint(int marks) { 
        if (marks >= 90) { 
            return 4.0;  } 
            else if (marks >= 85) { 
            return 3.5; } 
            else if (marks >= 80) { 
            return 3.0; }
             else if (marks >= 75) { 
            return 2.5; } 
            else if (marks >= 70) { 
            return 2.0; } 
            else if (marks >= 65) { 
            return 1.5;  } 
            else if (marks >= 60) { 
            return 1.0;  } 
            else { 
            return 0.0; } 
    }
   
    public static void main(String[] args) {
    int n;
    System.out.println("Enter the number of students");
    Scanner input = new Scanner(System.in); 
    n = input.nextInt();

    }
     
}

