import java.util.Scanner;

class Circle {

    double radius;

    void getRadius() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        radius = sc.nextDouble();
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class p80 {
    public static void main(String[] args) {

        Circle c = new Circle();

        c.getRadius();

        System.out.println("Area = " + c.area());
        System.out.println("Perimeter = " + c.perimeter());
    }
}