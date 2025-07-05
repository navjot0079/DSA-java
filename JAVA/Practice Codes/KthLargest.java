public class KthLargest {
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6,4};
        int k=3;
        int m=k-1;
        int idx=0;
        int largest=Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {
            for (int i = 0; i < k-1; i++) {
                if(arr[i]>largest){
                    largest=arr[i];
                    idx=i;
                }
            }
            if(m-->0){
                arr[idx]=Integer.MIN_VALUE;
            }
            
        }
        System.out.println(largest);
    }
}
