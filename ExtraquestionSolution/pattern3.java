public class pattern3 {
    public static void main(String[] args) {
        int n = 5;
        char ch1 = 'a';
        for (int i = 1; i <= n; i++) {
            int num = 5;
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(ch1);
                } else {
                    System.out.print(num);
                    num--;
                }
            }
            if (i % 2 == 0) {
                ch1 += 2;
            }
            System.out.println();

        }
    }
}
