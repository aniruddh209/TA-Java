
class Test {

    static int x = 100;

    void display() {

        System.out.println("Static Variable = " + this.x);
    }
}

public class p88 {

    public static void main(String[] args) {

        Test t = new Test();

        t.display();
    }
}