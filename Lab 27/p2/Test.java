package p2;

import p1.Demo;

public class Test {

    public static void main(String[] args) {

        Demo obj = new Demo();

        System.out.println("Public = " + obj.a);

        // Not accessible
        // obj.b;
        // obj.c;
        // obj.d;
    }
}