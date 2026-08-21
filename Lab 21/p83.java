import java.util.Scanner;

class Student {

    long Enrollment_No;
    String Student_Name;
    int Semester;
    double CPI;
    double SPI;

    void GetStudentDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Enrollment No: ");
        Enrollment_No = sc.nextLong();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        Student_Name = sc.nextLine();

        System.out.print("Enter Semester: ");
        Semester = sc.nextInt();

        System.out.print("Enter CPI: ");
        CPI = sc.nextDouble();

        System.out.print("Enter SPI: ");
        SPI = sc.nextDouble();
    }

    void DisplayStudentDetails() {

        System.out.println("\nStudent Details");
        System.out.println("Enrollment No = " + Enrollment_No);
        System.out.println("Student Name = " + Student_Name);
        System.out.println("Semester = " + Semester);
        System.out.println("CPI = " + CPI);
        System.out.println("SPI = " + SPI);
    }
}

public class p83 {
    public static void main(String[] args) {

        Student s = new Student();

        s.GetStudentDetails();
        s.DisplayStudentDetails();
    }
}