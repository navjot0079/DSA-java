public class sortzeroonetwo {
    public static void sorting(int arr[]) {
        int cntz=0;
        int cnto=0;
        int cntt=0;
        int n=arr.length;
        //Write your code herei=0
        for(int i=0;i<n;i++){
            if(arr[i]==0) cntz++;
            else if(arr[i]==1) cnto++;
            else cntt++;
        }
        int k=0;
        for(int i=0;i<cntz;i++){
            arr[k]=0;
            k++;
        }
        for(int i=0;i<cnto;i++){
            arr[k]=1;
            k++;
        }
        for(int i=0;i<cntt;i++){
            arr[k]=2;
            k++;
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,2,1,2};
        sorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
