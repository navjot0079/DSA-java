import java.util.Scanner;

public class TargetEle {
    public static void main(String[] args) {
        int target=4;
        Scanner scanner=new Scanner(System.in);
        int[] arr= {1,4,6,12,19,25};
        int left=0;
        int right=6;
        int mid=left+(right-left)/2;
        while(left<right){
            if(target==arr[mid]){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
            
        mid=left+(right-left)/2;
        }
        scanner.close();
    }
}
