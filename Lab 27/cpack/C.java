package cpack;

import apack.A;

public class C {

    public void display() {

        A obj = new A();

        System.out.println("Public = " + obj.z);

        // obj.x not accessible
        // obj.y not accessible
    }
}