final class Parent {

    final int x = 100;

    final void show() {
        System.out.println("Final Method");
        System.out.println("x = " + x);
    }
}

public class p96 {

    public static void main(String[] args) {

        Parent p = new Parent();

        p.show();
    }
}