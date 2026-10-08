import java.util.Scanner;

class p35
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double per;

        System.out.print("Enter Percentage: ");
        per = sc.nextDouble();

        if(per > 90)
            System.out.println("Grade A+");
        else if(per >= 80)
            System.out.println("Grade A");
        else if(per >= 70)
            System.out.println("Grade B+");
        else if(per >= 60)
            System.out.println("Grade B");
        else if(per >= 50)
            System.out.println("Grade C");
        else if(per >= 35)
            System.out.println("Grade P");
        else
            System.out.println("FT");
    }
}