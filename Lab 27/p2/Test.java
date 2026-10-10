
//Run code main inside pkg 
//commands:
// compile
//javac p1/Demo.java p2/Test.java
//Run
//java p2.Test (Here meaning of that is we run class inside another pkg so first package name --> java p2.Test (main class name ))

//Way of run (main inside pkg)
//javac p1/Demo.java p2/Test.java
//java p2.Test 

//When main outside pkg
//javac student/Student.java exam/Result.java Main.java
//java Main

package p2;

import p1.Demo;

public class Test  {

    public static void main(String[] args) {

        Demo obj = new Demo();

        System.out.println("Public = " + obj.a);

        // Not accessible
        // obj.b;
        // obj.c;
        // obj.d;
    }
}