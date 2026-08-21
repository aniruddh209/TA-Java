import java.util.Scanner;

public class p75{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");  
        int b = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));

        System.out.println("Largest Number = " + largest);
    }
}