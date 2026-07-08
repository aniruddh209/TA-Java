import java.util.Scanner;

class CountDigits {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int count = 0;

        while (n != 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Total Digits = " + count);
    }
}