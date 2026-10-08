class Parent {

    int x = 100;

    Parent() {
        System.out.println("Parent Constructor");
    }

    void display() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {

    int x = 200;

    Child() {

        super();

        System.out.println("Child Constructor");
    }

    void show() {

        System.out.println("Parent Variable = " + super.x);

        super.display();
    }
}

public class p95 {

    public static void main(String[] args) {

        Child c = new Child();

        c.show();
    }
}