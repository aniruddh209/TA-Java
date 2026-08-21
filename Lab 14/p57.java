import java.util.Scanner;

public class p57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        int flag = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                flag = 1;
                break;
            }
        }

        if(flag==1)
            System.out.println("Number Found");
        else
            System.out.println("Number Not Found");
    }
}