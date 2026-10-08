interface Transport {
    void deliver();
}

class Camel implements Transport {
    public void deliver() {
        System.out.println("Camel delivers goods");
    }
}

class Donkey implements Transport {
    public void deliver() {
        System.out.println("Donkey delivers goods");
    }
}

public class p104 {
    public static void main(String[] args) {

        Camel c = new Camel();
        Donkey d = new Donkey();

        c.deliver();
        d.deliver();
    }
}