
package pack2;

import pack1.A;

public class B extends A {
    public void show() {
        System.out.println("Public: " + a);
        System.out.println("Protected: " + b);

        // System.out.println(c); // Error: default
        // System.out.println(d); // Error: private
    }

    public static void main(String[] args) {
        B obj = new B();

        obj.show();
        obj.display();
    }
}
