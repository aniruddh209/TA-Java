// public class p46_3 {
//     public static void main(String[] args) {
//         int n=5;
//         for (int i = 1; i <= n; i++) {
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }

//             if (i % 2 != 0) {     // Odd rows

//                 for (int j = 5; j >= 6 - i; j--) {
//                     System.out.print(j);
//                 }

//             } else {              // Even rows

//                 char ch;

//                 if (i == 2)
//                     ch = 'a';
//                 else
//                     ch = 'b';

//                 for (int j = 1; j <= i; j++) {
//                     System.out.print(ch);
//                 }
//             }

//             System.out.println();
//         }
//     }
// }


import java.util.Scanner;

public class p46_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd number: ");
        int n = sc.nextInt();

        char ch = 'a';

        for (int i = 1; i <= n; i++) {

            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            if (i % 2 != 0) {          // Odd rows

                // Print n, n-1, ...
                for (int j = n; j >= n - i + 1; j--) {
                    System.out.print(j);
                }

            } else {                   // Even rows

                for (int j = 1; j <= i; j++) {
                    System.out.print(ch);
                }

                ch++;                  // a -> b -> c -> d ...
            }

            System.out.println();
        }

        sc.close();
    }
}