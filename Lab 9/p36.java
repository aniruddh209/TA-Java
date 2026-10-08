import java.util.Scanner;

class p36
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int totalDays, year, week, day;

        System.out.print("Enter Number of Days: ");
        totalDays = sc.nextInt();

        year = totalDays / 365;

        week = (totalDays % 365) / 7;

        day = (totalDays % 365) % 7;

        System.out.println(year + " Year");
        System.out.println(week + " Week");
        System.out.println(day + " Day");
    }
}