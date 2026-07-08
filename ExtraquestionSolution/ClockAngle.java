import java.util.Scanner;
public class ClockAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour, minute;
        double hourAngle, minuteAngle, angle;

        System.out.print("Enter hour (1-12): ");
        hour = sc.nextInt();

        System.out.print("Enter minutes (0-59): ");
        minute = sc.nextInt();

        if (hour == 12) {
            hour = 0;
        }

        hourAngle = (hour * 30) + (minute * 0.5);
        minuteAngle = minute * 6;

        angle = Math.abs(hourAngle - minuteAngle);

        if (angle > 180) {
            angle = 360 - angle;
        }

        System.out.println("Angle between hour and minute hands = " + angle + " degrees");

        sc.close();
    }
}