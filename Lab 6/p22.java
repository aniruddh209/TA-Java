import java.util.Scanner;

class p22
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        int sum = a+b+c;

        System.out.println("Addition = " + sum);
    }
}