
import java.util.Scanner;

class p33 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int totalSeconds;
        int hours, minutes, seconds;

        System.out.print("Enter seconds: ");
        totalSeconds = sc.nextInt();

        hours = totalSeconds / 3600;

        minutes = (totalSeconds % 3600) / 60;

        seconds = totalSeconds % 60;

        System.out.printf("%02d:%02d:%02d",
                hours,
                minutes,
                seconds);
    }
}
