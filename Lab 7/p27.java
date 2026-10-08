import java.util.Scanner;

class p27
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double side,length,breadth;

        System.out.print("Enter side of square: ");
        side = sc.nextDouble();

        System.out.println("Area of Square = " + (side*side));
        System.out.println("Perimeter of Square = " + (4*side));

        System.out.print("Enter length: ");
        length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();

        System.out.println("Area of Rectangle = " + (length*breadth));
        System.out.println("Perimeter of Rectangle = " + 2*(length+breadth));
    }
}