package bpack;

import apack.A;

public class B extends A {

    public void display() {

        System.out.println("Protected = " + x);
        System.out.println("Public = " + z);

        // y not accessible
    }
}