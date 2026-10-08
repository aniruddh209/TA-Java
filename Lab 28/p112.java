class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

class DivisibleByTenException extends Exception {
    DivisibleByTenException(String msg) {
        super(msg);
    }
}

class RangeException extends Exception {
    RangeException(String msg) {
        super(msg);
    }
}

class GreaterThan7000Exception extends Exception {
    GreaterThan7000Exception(String msg) {
        super(msg);
    }
}

public class p112 {
    public static void main(String args[]) {

        int sum = 0;

        for (String s : args) {
            try {
                int num = Integer.parseInt(s);

                if (num < 0)
                    throw new NegativeNumberException("Negative Number");

                if (num % 10 == 0)
                    throw new DivisibleByTenException("Divisible by 10");

                if (num > 1000 && num < 2000)
                    throw new RangeException("Between 1000 and 2000");

                if (num > 7000)
                    throw new GreaterThan7000Exception("Greater than 7000");

                sum += num;

            } catch (Exception e) {
                System.out.println(numMessage(s) + " -> " + e.getMessage());
            }
        }

        System.out.println("Total Sum = " + sum);
    }

    static String numMessage(String s) {
        return "Skipped Number " + s;
    }
}