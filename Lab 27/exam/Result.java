package exam;

import student.Student;

public class Result extends Student {

    int m1, m2, m3;

    public Result(int rollNo, String name,
                  int m1, int m2, int m3) {

        super(rollNo, name);

        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void display() {

        int total = m1 + m2 + m3;
        double per = total / 3.0;

        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Total : " + total);
        System.out.println("Percentage : " + per);
    }

    public static void main(String[] args) {

        Result r = new Result(
                101,
                "Aniruddh",
                80,
                90,
                85);

        r.display();
    }
}