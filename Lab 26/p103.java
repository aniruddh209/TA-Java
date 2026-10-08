class Parent {
    void show() {
        System.out.println("Parent Class Method");
    }
}

interface Test {
    void display();
}

class Child extends Parent implements Test {

    public void display() {
        System.out.println("Interface Method");
    }
}

public class p103 {
    public static void main(String[] args) {
        Child c = new Child();

        c.show();
        c.display();
    }
}