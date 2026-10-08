class A {
    void showA() {
        System.out.println("Class A");
    }
}

interface B {
    void showB();
}

class C extends A implements B {
    @Override
    public void showB() {
        System.out.println("Interface B");
    }
}

public class p105 {
    public static void main(String[] args) {
        C obj = new C();

        obj.showA();
        obj.showB();
    }
}