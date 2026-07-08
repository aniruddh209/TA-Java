import java.util.Scanner;

class p41
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int num, digit, sum = 0;

        System.out.print("Enter Number: ");
        num = sc.nextInt();

        while(num > 0)
        {
            digit = num % 10;

            sum = sum + digit;

            num = num / 10;
        }

        System.out.println("Sum of Digits = " + sum);
    }
}