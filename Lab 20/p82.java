class Complex {

    int real;
    int imag;

    // Default Constructor
    Complex() {
        real = 0;
        imag = 0;
    }

    // Parameterized Constructor
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c1, Complex c2) {

        Complex result = new Complex();

        result.real = c1.real + c2.real;
        result.imag = c1.imag + c2.imag;

        return result;
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class p82 {

    public static void main(String[] args) {

        Complex c1 = new Complex(5, 3);
        Complex c2 = new Complex(2, 4);

        Complex result = new Complex();

        result = result.add(c1, c2);

        System.out.print("First Complex Number : ");
        c1.display();

        System.out.print("Second Complex Number : ");
        c2.display();

        System.out.print("Addition : ");
        result.display();
    }
}