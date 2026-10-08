import java.util.Scanner;

class p25
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        float pound,heightInch;
        float kg,meter,bmi;

        System.out.print("Enter weight in pounds: ");
        pound = sc.nextFloat();

        System.out.print("Enter height in inches: ");
        heightInch = sc.nextFloat();

        kg = (float)(pound * 0.45359237);

        meter = (float)(heightInch * 0.0254);

        bmi = kg / (meter * meter);

        System.out.println("BMI = " + bmi);
    }
}


// Below 18.5 ----> Underweight


// 18.5 - 24.9 -----> Normal


// 25 - 29.9 -------> Overweight


// 30+ --------> Obese
