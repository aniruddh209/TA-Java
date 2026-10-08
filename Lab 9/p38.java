import java.util.Scanner;

class p38
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.print("Enter Three Numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a > b)
        {
            if(a > c)
                System.out.println(a + " is Largest");
            else
                System.out.println(c + " is Largest");
        }
        else
        {
            if(b > c)
                System.out.println(b + " is Largest");
            else
                System.out.println(c + " is Largest");
        }
    }
}