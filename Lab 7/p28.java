import java.util.Scanner;

class p28
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}