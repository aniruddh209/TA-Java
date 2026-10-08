interface Greeting {

    void sayHello();
}

public class p85 {

    public static void main(String[] args) {

        Greeting g = new Greeting() {

            public void sayHello() {
                System.out.println("Hello Aniruddh");
            }
        };

        g.sayHello();
    }
}