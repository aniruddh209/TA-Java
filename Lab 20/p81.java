import java.util.Scanner;

public class p81 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        while (true) {

            System.out.print("Enter a sentence: ");
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("quit")) {
                break;
            }

            for (int j = 0; j < str.length(); j++) {

                char ch = Character.toLowerCase(str.charAt(j));

                if (ch == 'a') {
                    a++;
                }
                else if (ch == 'e') {
                    e++;
                }
                else if (ch == 'i') {
                    i++;
                }
                else if (ch == 'o') {
                    o++;
                }
                else if (ch == 'u') {
                    u++;
                }
            }
        }

        System.out.println("\nTotal Vowel Count:");
        System.out.println("A = " + a);
        System.out.println("E = " + e);
        System.out.println("I = " + i);
        System.out.println("O = " + o);
        System.out.println("U = " + u);

        sc.close();
    }
}