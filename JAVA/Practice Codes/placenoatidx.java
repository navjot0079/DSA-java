import java.util.Scanner;

public class placenoatidx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int arr2[]=new int [n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]<arr[target]){
                arr2[k]=arr[i];
                k++;
            }
        }
        arr2[k]=arr[target];
        k++;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[target]){
                arr2[k]=arr[i];
                k++;
            }
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]+" ");
        }
        sc.close();
    }
}
