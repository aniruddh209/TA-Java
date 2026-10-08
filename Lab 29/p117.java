import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p117 {
    public static void main(String[] args) {

        try {
            FileReader fr1 = new FileReader("file1.txt");
            FileReader fr2 = new FileReader("file2.txt");
            FileWriter fw = new FileWriter("merged.txt");

            int ch;

            while ((ch = fr1.read()) != -1) {
                fw.write(ch);
            }

            while ((ch = fr2.read()) != -1) {
                fw.write(ch);
            }

            fr1.close();
            fr2.close();
            fw.close();

            System.out.println("Files Merged Successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}