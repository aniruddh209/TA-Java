import java.util.Scanner;

public class p42 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int start = sc.nextInt();

        System.out.print("Enter second number: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            if (i % 2 == 0 && i % 3 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}