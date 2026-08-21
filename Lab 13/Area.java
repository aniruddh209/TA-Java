import java.util.Scanner;

public class Area {

    static double area(double radius) {
        return 3.14 * radius * radius;
    }

    static int area(int side) {
        return side * side;
    }

    static double area(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Circle = " + area(5.0));
        System.out.println("Square = " + area(4));
        System.out.println("Triangle = " + area(5.0, 6.0));
    }
}