class Shape {

}

class Circle extends Shape {

    double radius = 5;

    void area() {

        double area = Math.PI * radius * radius;

        System.out.println("Area of Circle = " + area);
    }
}

class Triangle extends Shape {

    double base = 10;
    double height = 5;

    void area() {

        double area = 0.5 * base * height;

        System.out.println("Area of Triangle = " + area);
    }
}

class Square extends Shape {

    double side = 4;

    void area() {

        double area = side * side;

        System.out.println("Area of Square = " + area);
    }
}

public class p92{

    public static void main(String[] args) {

        Circle c = new Circle();
        Triangle t = new Triangle();
        Square s = new Square();

        c.area();
        t.area();
        s.area();
    }
}