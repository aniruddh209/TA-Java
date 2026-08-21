public class p46_1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i % 2 != 0) {      // Odd rows -> @
                for (int j = 1; j <= i; j++) {
                    System.out.print("@ ");
                }
            } else {               // Even rows -> #
                for (int j = 1; j <= i * 2 - 2; j++) {
                    System.out.print("#");
                }
            }

            System.out.println();
        }
    }
}