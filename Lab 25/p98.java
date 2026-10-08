class MyPoint {

    private double x;
    private double y;

    // No-argument constructor
    MyPoint() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    // Distance between two MyPoint objects
    double distance(MyPoint p) {
        return Math.sqrt(
                Math.pow(x - p.x, 2)
              + Math.pow(y - p.y, 2));
    }

    // Distance using coordinates
    double distance(double x, double y) {
        return Math.sqrt(
                Math.pow(this.x - x, 2)
              + Math.pow(this.y - y, 2));
    }
}

public class p98 {

    public static void main(String[] args) {

        MyPoint p1 = new MyPoint();       // (0,0)
        MyPoint p2 = new MyPoint(3, 4);  // (3,4)

        System.out.println("X = " + p2.getX());
        System.out.println("Y = " + p2.getY());

        System.out.println("Distance between p1 and p2 = "
                + p1.distance(p2));

        System.out.println("Distance from p2 to (6,8) = "
                + p2.distance(6, 8));
    }
}