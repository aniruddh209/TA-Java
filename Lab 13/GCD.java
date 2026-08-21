import java.util.Scanner;

public class GCD {

    static int gcd(int a, int b) {

        int ans = 1;

        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {

            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));
    }
}