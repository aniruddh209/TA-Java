import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class imgcopy {

    public static void main(String[] args) {

        try {

            // Open original image for reading
            FileInputStream fis =
                new FileInputStream("Lab 29/a.png");

            // Open/create copy image for writing
            FileOutputStream fos =
                new FileOutputStream("Lab 29/copy.png");

            int data;

            // Read byte by byte
            while ((data = fis.read()) != -1) {

                // Write byte to new file
                fos.write(data);
            }

            // Close streams
            fis.close();
            fos.close();

            System.out.println("Image copied successfully.");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}