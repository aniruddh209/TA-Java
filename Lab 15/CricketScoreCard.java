import java.util.Scanner;

public class CricketScoreCard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        int score[][] = new int[players][4];

        for(int i = 0; i < players; i++) {

            System.out.println("Player " + (i + 1));

            System.out.print("Runs: ");
            score[i][0] = sc.nextInt();

            System.out.print("Balls: ");
            score[i][1] = sc.nextInt();

            System.out.print("Fours: ");
            score[i][2] = sc.nextInt();

            System.out.print("Sixes: ");
            score[i][3] = sc.nextInt();
        }

        System.out.println("\nScore Card");

        System.out.println("Runs Balls 4s 6s");

        for(int i = 0; i < players; i++) {

            for(int j = 0; j < 4; j++) {
                System.out.print(score[i][j] + "\t");
            }

            System.out.println();
        }
    }
}