public class AccomodateCities {
    public static void main(String[] args) {
        int n=5;
        int m=3;
        int cnt=0;
        int city[]=new int[n];
        int arr[][]={{2,4,5},{1,3,3},{3,5,2}};
        for(int i=0;i<m;i++){
            int a=arr[i][0];
            int b=arr[i][1];
            int k=arr[i][2];
            for(int j=a-1;j<b;j++){
                city[j]+=k;
            }
        }
        for(int i=0;i<n;i++){
            cnt+=city[i];
        }
        System.out.println(cnt);
        

    }
}
