import java.util.Scanner;

public class DistinctNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println();
        int cnt=0;
        for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1]){
                continue;
            }
            else{
                cnt++;
            }
        }
        cnt++;
        System.out.println(cnt);
        sc.close(); 
    }
}
