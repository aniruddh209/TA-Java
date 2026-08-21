import java.util.Scanner;

public class SimpleInterest {

    static double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        double p = sc.nextDouble();

        System.out.print("Rate: ");
        double r = sc.nextDouble();

        System.out.print("Time: ");
        double t = sc.nextDouble();

        System.out.println("Simple Interest = " + simpleInterest(p, r, t));
    }
}