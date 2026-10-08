import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p115 {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("Destination.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("\nFile Copied Successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}