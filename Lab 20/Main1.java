class Mobile1 {

    String brand;
    String model;
    int price;

    Mobile1(String brand, String model, int price) {

        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void display(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }
}

public class Main1{

    public static void main(String[] args) {

      Mobile1 m = new Mobile1("Samsung", "S25", 80000);
      m.display();
    }
}