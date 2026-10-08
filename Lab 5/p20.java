class p20 {
    public static void main(String args[]) {
        if (args.length < 2) {
            System.out.println("Not much arguments");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Addition = " + (a + b));
    }
}