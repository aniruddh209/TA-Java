import java.util.Scanner;

public class p69 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        System.out.println("Even Length Words:");

        for(String word : words) {

            if(word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}