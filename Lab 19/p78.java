import java.util.Scanner;

class Employee {

    int Employee_ID;
    String Employee_Name;
    String Designation;
    int Age;
    double Salary;

    void GetEmployeeDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        Employee_ID = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        Employee_Name = sc.nextLine();

        System.out.print("Enter Designation: ");
        Designation = sc.nextLine();

        System.out.print("Enter Age: ");
        Age = sc.nextInt();

        System.out.print("Enter Salary: ");
        Salary = sc.nextDouble();
    }

    void DisplayEmployeeDetails() {

        System.out.println("\nEmployee Details");
        System.out.println("Employee ID = " + Employee_ID);
        System.out.println("Employee Name = " + Employee_Name);
        System.out.println("Designation = " + Designation);
        System.out.println("Age = " + Age);
        System.out.println("Salary = " + Salary);
    }
}

public class p78 {
    public static void main(String[] args) {

        Employee e = new Employee();

        e.GetEmployeeDetails();
        e.DisplayEmployeeDetails();
    }
}