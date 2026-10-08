
package p1;

public class Demo {

    public int a = 10;
    protected int b = 20;
    int c = 30;          // default
    private int d = 40;

    public void display() {
        System.out.println("Public = " + a);
        System.out.println("Protected = " + b);
        System.out.println("Default = " + c);
        System.out.println("Private = " + d);
    }
}