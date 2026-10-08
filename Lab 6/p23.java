import java.util.Scanner;

class p23
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double area,radius,diameter;

        System.out.print("Enter Area: ");
        area = sc.nextDouble();

        radius = Math.sqrt(area/3.14159);

        diameter = 2*radius;

        System.out.println("Diameter = " + diameter);
    }
}