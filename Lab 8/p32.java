import java.util.Scanner;

class p32
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int m1, m2, m3, m4, m5;
        int total;
        double percentage;

        System.out.print("Enter marks of Subject 1: ");
        m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        m3 = sc.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        m4 = sc.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        m5 = sc.nextInt();

        total = m1 + m2 + m3 + m4 + m5;

        percentage = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);
    }
}