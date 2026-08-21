import java.util.Scanner;

class Time {

    int hour;
    int minute;

    void getTime() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hours: ");
        hour = sc.nextInt();

        System.out.print("Enter Minutes: ");
        minute = sc.nextInt();
    }

    Time add(Time t1, Time t2) {

        Time result = new Time();

        result.minute = t1.minute + t2.minute;
        result.hour = t1.hour + t2.hour;

        if (result.minute >= 60) {
            result.hour += result.minute / 60;
            result.minute %= 60;
        }

        return result;
    }

    void display() {
        System.out.println(hour + " Hour " + minute + " Minute");
    }
}

public class p79 {
    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time();

        System.out.println("Enter First Time");
        t1.getTime();

        System.out.println("Enter Second Time");
        t2.getTime();

        Time result = new Time();

        result = result.add(t1, t2);

        System.out.println("\nTotal Time:");
        result.display();
    }
}