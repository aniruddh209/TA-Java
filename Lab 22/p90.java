class Rectangle {

    int length;
    int width;

    static int count;

    static {
        count = 0;
        System.out.println("Static initializer block executed");
    }

    {
        System.out.println("Initializer block executed");
    }

    Rectangle() {
        length = 1;
        width = 1;
        count++;
        System.out.println("Default constructor executed");
    }
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        count++;
        System.out.println("Parameterized constructor executed");
    }

    Rectangle(Rectangle r) {
        this.length = r.length;
        this.width = r.width;
        count++;
        System.out.println("Copy constructor executed");
    }

    void area() {
        System.out.println("Area = " + (length * width));
    }


    void display() {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
    }

    static void displayCount() {
        System.out.println("Number of objects = " + count);
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        Rectangle r1 = new Rectangle();
        r1.display();
        r1.area();

        System.out.println();

        Rectangle r2 = new Rectangle(10, 5);
        r2.display();
        r2.area();

        System.out.println();
        Rectangle r3 = new Rectangle(r2);
        r3.display();
        r3.area();

        System.out.println();


        Rectangle.displayCount();
    }
}