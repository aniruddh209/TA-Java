import java.util.Scanner;

class p40
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int calls;
        double bill;

        System.out.print("Enter Number of Calls: ");
        calls = sc.nextInt();

        if(calls <= 100)
        {
            bill = 200;
        }
        else if(calls <= 150)
        {
            bill = 200 + (calls-100)*0.60;
        }
        else if(calls <= 200)
        {
            bill = 200 + (50*0.60) + (calls-150)*0.50;
        }
        else
        {
            bill = 200 + (50*0.60) + (50*0.50)
                   + (calls-200)*0.40;
        }

        System.out.println("Bill = Rs." + bill);
    }
}