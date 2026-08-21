import java.util.Scanner;

public class p70 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        System.out.print("Enter Position: ");
        int pos = sc.nextInt();

        String result =
                str1.substring(0, pos)
                + str2
                + str1.substring(pos);

        System.out.println("Result = " + result);
    }
}