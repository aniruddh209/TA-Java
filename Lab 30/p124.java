import java.io.*;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}


public class p124 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Aniruddh");
        Student s2 = new Student(102, "Rahul");

        try {

            FileOutputStream fos =
                    new FileOutputStream("student.txt");

            String data =
                    s1.rollNo + " " + s1.name + "\n" +
                    s2.rollNo + " " + s2.name;

            fos.write(data.getBytes());
            fos.close();

            System.out.println("Student data stored.");

            FileInputStream fis =
                    new FileInputStream("student.txt");

            int ch;

            System.out.println("\nStudent Records:");

            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}