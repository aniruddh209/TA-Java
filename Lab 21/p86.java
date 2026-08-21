public class p86 {

    public static void main(String[] args) {

        // Autoboxing
        int a = 50;

        Integer obj = a;

        System.out.println("Autoboxing:");
        System.out.println("Primitive Value = " + a);
        System.out.println("Wrapper Object = " + obj);

        // Unboxing
        Integer num = 100;

        int b = num;

        System.out.println("\nUnboxing:");
        System.out.println("Wrapper Object = " + num);
        System.out.println("Primitive Value = " + b);
    }
}