import java.util.Scanner;

public class MatrixInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int r = sc.nextInt();

        System.out.print("Columns: ");
        int c = sc.nextInt();

        int matrix[][] = new int[r][c];

        System.out.println("Enter Matrix:");

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}