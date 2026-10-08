class p89 {

    static {

        System.out.println("Static Block Executed");
    }

    static void show() {

        System.out.println("Static Method Executed");
    }

    public static void main(String[] args) {

        System.out.println("Main Method Executed");

        show();
    }
}