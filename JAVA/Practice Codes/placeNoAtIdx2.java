import java.util.Scanner;

public class placeNoAtIdx2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int targetidx = sc.nextInt();
        sc.close();
        int low=0;
        int high=n;
        for(int i=0;i<n;){
            if(arr[i]<arr[targetidx]){
                int temp=arr[i];
                arr[i]=arr[low];
                arr[low]=temp;
                low++;
                i++;
            }
            else if(arr[i]>arr[targetidx]){
                int temp=arr[i];
                arr[i]=arr[high];
                arr[high]=temp;
                high--;
            }
            else{
                i++;
            }
        }
        // int cnt=0;
        // int k=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]<=arr[targetidx]){
        //         int temp=arr[cnt];
        //         arr[cnt]=arr[k];
        //         arr[k]=temp;
        //         cnt++;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }

}
