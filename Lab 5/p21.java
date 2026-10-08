class p21
{
    public static void main(String args[])
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // double d = Double.parseDouble(args[0]);

        if(a == b && b == c)
        {
            System.out.println("Equilateral Triangle");
        }
        else if(a == b || b == c || a == c)
        {
            System.out.println("Isosceles Triangle");
        }
        else if((a*a + b*b == c*c) ||
                (a*a + c*c == b*b) ||
                (b*b + c*c == a*a))
        {
            System.out.println("Right Angled Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }
    }
}




// import java.util.Scanner;

// class Triangle
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);

//         double a,b,c;

//         System.out.print("Enter three sides: ");
//         a = sc.nextDouble();
//         b = sc.nextDouble();
//         c = sc.nextDouble();

//         if(a==b && b==c)
//         {
//             System.out.println("Equilateral Triangle");
//         }
//         else if(a==b || b==c || a==c)
//         {
//             System.out.println("Isosceles Triangle");
//         }
//         else if((a*a+b*b==c*c) ||
//                 (a*a+c*c==b*b) ||
//                 (b*b+c*c==a*a))
//         {
//             System.out.println("Right Angled Triangle");
//         }
//         else
//         {
//             System.out.println("Scalene Triangle");
//         }
//     }
// }