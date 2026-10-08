import java.io.*;

public class p122 {

    public static void main(String[] args) {

        String word1 = "Java";
        String word2 = "Python";

        int count = 0;

        try {

            BufferedReader br = new BufferedReader(
                new FileReader("file1.txt")
            );

            BufferedWriter bw = new BufferedWriter(
                new FileWriter("file2.txt")
            );

            String line;

            while ((line = br.readLine()) != null) {

                // Count word1
                String[] words = line.split(" ");

                for (String word : words) {
                    if (word.equals(word1)) {
                        count++;
                    }
                }

                // Replace word1 with word2
                line = line.replace(word1, word2);

                // Write into file2
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Replacement completed.");
            System.out.println("Number of replacements: " + count);

        }
        catch (FileNotFoundException e) {

            System.out.println("File does not exist.");

        }
        catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}