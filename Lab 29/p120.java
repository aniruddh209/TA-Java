import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class p120 {
    public static void main(String[] args) {

        try {
            FileOutputStream fs=new FileOutputStream("buffer.txt");
            BufferedOutputStream bos =
                    new BufferedOutputStream(fs);

            String str = "Buffered Stream Example";

            bos.write(str.getBytes());
            bos.close();

            BufferedInputStream bis =
                    new BufferedInputStream(
                            new FileInputStream("buffer.txt"));

            int ch;
                        
            while ((ch = bis.read()) != -1) {
                System.out.print((char) ch);
            }

            bis.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}