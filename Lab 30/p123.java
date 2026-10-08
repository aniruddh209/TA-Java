import java.io.FileInputStream;
import java.io.IOException;

public class p123 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Provide file name.");
            return;
        }

        int count = 0;

        try {
            FileInputStream fis =
                    new FileInputStream(args[0]);

            int ch;

            while ((ch = fis.read()) != -1) {

                if ((char) ch == '5')
                    count++;
            }

            fis.close();

            System.out.println(
                    "Occurrences of digit 5 = " + count);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}