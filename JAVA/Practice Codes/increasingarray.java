import java.util.Scanner;

public class increasingarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        long sum=0;
        long gap=0;
        for (int index = 0; index < n; index++) {
            arr[index]=sc.nextInt();
        }
        for (int index = 1; index < n; index++) {
            if(arr[index]<arr[index-1]){
                sum+=arr[index-1]-arr[index];
                gap=gap+sum;
                arr[index]=arr[index-1];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
