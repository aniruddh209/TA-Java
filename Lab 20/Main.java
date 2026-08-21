class Mobile {

    String brand;
    String model;
    int price;
}

public class Main {

    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.brand = "Samsung";
        m.model = "S25";
        m.price = 80000;

        System.out.println(m.brand);
        System.out.println(m.model);
        System.out.println(m.price);
    }
}