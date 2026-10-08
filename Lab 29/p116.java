import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class p116 {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("data.txt");

            String str = "Hello Java";
            fos.write(str.getBytes());
            fos.close();

            FileInputStream fis = new FileInputStream("data.txt");

            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}