import java.util.Scanner;

public class missingnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n]; 
        int[] freq=new int[n+1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            freq[arr[i]]=1;
        }
        for (int index = 1; index <=n; index++) {
            if(freq[index]==0){
                System.out.println(index);
                break;
            }
        }
        
        sc.close();
    }
}
