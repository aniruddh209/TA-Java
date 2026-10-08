class MyPoint {

    protected double x;
    protected double y;

    MyPoint() {
        x = 0;
        y = 0;
    }

    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance(MyPoint p) {

        return Math.sqrt(
                Math.pow(x - p.x, 2)
              + Math.pow(y - p.y, 2));
    }
}

class ThreeDPoint extends MyPoint {

    private double z;

    ThreeDPoint() {

        super();

        z = 0;
    }

    ThreeDPoint(double x,
                double y,
                double z) {

        super(x, y);

        this.z = z;
    }

    double getZ() {
        return z;
    }

    double distance(ThreeDPoint p) {

        return Math.sqrt(
                Math.pow(x - p.x, 2)
              + Math.pow(y - p.y, 2)
              + Math.pow(z - p.z, 2));
    }
}

public class p99 {

    public static void main(String[] args) {

        ThreeDPoint p1 =
                new ThreeDPoint(1, 2, 3);

        ThreeDPoint p2 =
                new ThreeDPoint(4, 5, 6);

        System.out.println(
                "Distance = "
                + p1.distance(p2));
    }
}