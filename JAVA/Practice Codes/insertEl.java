import java.util.Scanner;

public class  insertEl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = sc.nextInt();
        int value = sc.nextInt();
        for (int i = n - 2; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = value;
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}