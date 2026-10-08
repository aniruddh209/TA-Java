import java.util.Scanner;

class p24
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double f,c;

        System.out.print("Enter Fahrenheit: ");
        f = sc.nextDouble();

        c = (5.0/9.0)*(f-32);

        System.out.println("Celsius = " + c);
    }
}