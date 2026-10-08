import java.util.Scanner;

class p30
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double meter, feet;

        System.out.print("Enter meters: ");
        meter = sc.nextDouble();

        feet = meter * 3.28084;

        System.out.println("Feet = " + feet);
    }
}