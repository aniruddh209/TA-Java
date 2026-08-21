public class p68 {
    public static void main(String[] args) {
        int num1=12;
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "   Java   ";

        System.out.println("Length: " + str1.length());

        System.out.println("charAt(1): " + str1.charAt(1));

        System.out.println("Concat: " + str1.concat(str2));

        System.out.println("IndexOf l: " + str1.indexOf('l'));

        System.out.println("Equals: " + str1.equals("Hello"));

        int num = 100;
        String s = String.valueOf(num);
        System.out.println("ValueOf: " + s);

        System.out.println("ToString: " + num1.toString());

        System.out.println("Trim: " + str3.trim());

        System.out.println("Substring: " + str1.substring(1,4));
    }
}