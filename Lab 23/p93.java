import java.util.Scanner;

class Account_Details {

    int accNo;
    String name;
    double principal;

    void getDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Principal Amount: ");
        principal = sc.nextDouble();
    }
}

class Interest extends Account_Details {

    double rate = 5;
    double time = 2;

    void calculateInterest() {

        double interest = (principal * rate * time) / 100;

        System.out.println("\nAccount Number = " + accNo);
        System.out.println("Name = " + name);
        System.out.println("Principal Amount = " + principal);
        System.out.println("Interest = " + interest);
    }
}

public class p93 {

    public static void main(String[] args) {

        Interest i = new Interest();

        i.getDetails();

        i.calculateInterest();
    }
}