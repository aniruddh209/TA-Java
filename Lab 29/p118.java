import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p118 {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("sample.txt"));

            bw.write("Welcome to Java Programming");
            bw.newLine();
            bw.write("BufferedWriter Example");
            bw.close();

            BufferedReader br = new BufferedReader(
                    new FileReader("sample.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}