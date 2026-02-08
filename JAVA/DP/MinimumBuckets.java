public class MinimumBuckets {
     public static int minimumBuckets(String hamsters) {
        int n=hamsters.length();
        char arr[]=hamsters.toCharArray();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]=='H'){
                if( i>0 && arr[i-1]=='B'){
                    continue;
                }
                if(i+1<n && arr[i+1]=='.'){
                    arr[i+1]='B';
                    cnt++;
                }
                else if(i>0 && arr[i-1]=='.'){
                    arr[i-1]='B';
                    cnt++;
                }
                else{
                    return -1;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        String street = "H..H.H";
        System.out.println(minimumBuckets(street));
    }
}
