import java.util.Scanner;

class Bank_Account {

    long Account_No;
    String User_Name;
    String Email;
    String Account_Type;
    double Account_Balance;

    void GetAccountDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        Account_No = sc.nextLong();

        sc.nextLine();

        System.out.print("Enter User Name: ");
        User_Name = sc.nextLine();

        System.out.print("Enter Email: ");
        Email = sc.nextLine();

        System.out.print("Enter Account Type: ");
        Account_Type = sc.nextLine();

        System.out.print("Enter Account Balance: ");
        Account_Balance = sc.nextDouble();
    }

    void DisplayAccountDetails() {

        System.out.println("\nAccount Details");
        System.out.println("Account No = " + Account_No);
        System.out.println("User Name = " + User_Name);
        System.out.println("Email = " + Email);
        System.out.println("Account Type = " + Account_Type);
        System.out.println("Account Balance = " + Account_Balance);
    }
}

public class p77 {
    public static void main(String[] args) {

        Bank_Account b = new Bank_Account();

        b.GetAccountDetails();
        b.DisplayAccountDetails();
    }
}