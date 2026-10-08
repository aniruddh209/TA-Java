import java.util.Scanner;
// * P = Principal Amount
// * r = Rate of Interest
// * n = Number of times compounded per year
// * t = Time in years
// * A = Final Amount (Compound Amount)

class p29
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double p,r,t,n,ci;

        System.out.print("Enter Principal Amount: ");
        p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        r = sc.nextDouble();

        System.out.print("Enter Time (Years): ");
        t = sc.nextDouble();

        System.out.print("Enter Compounding Frequency: ");
        n = sc.nextDouble();

        ci = p * Math.pow((1 + (r/100)), n*t);

        System.out.println("Compound Interest Amount = " + ci);
    }
}