public class FrogJump {
    public static void main(String[] args) {
        int arr[]={2, 1, 3, 5, 4};
        System.out.println(solve(arr));
    }
    public static int solve(int arr[]){
        int prev2=0,prev=0;
        for(int i=1;i<arr.length-1;i++){
            int ff=prev+Math.abs(arr[i]-arr[i-1]);
            int ss=Integer.MAX_VALUE;
            if(i>1){
             ss=prev2+Math.abs(arr[i]-arr[i-2]);
            }
            int curr=Math.min(ff, ss);
            prev2=prev;
            prev=curr;

        }
        return prev;
    }
}
