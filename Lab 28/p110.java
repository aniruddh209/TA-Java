public class p110 {
    public static void main(String[] args) {

        // ArithmeticException
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        }

        // ArrayIndexOutOfBoundsException
        try {
            int arr[] = { 10, 20, 30 };
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: " + e);
        }

        // NumberFormatException
        try {
            int n = Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: " + e);
        }

        // NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e);
        }
    }
}