import java.util.*;
public class SortIntegerwiththeNumberof1Bits {
     public static int[] sortByBits(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        Integer ans[]=new Integer[n];
        for(int a:arr){
            map.put(a,solve(a));
        }
        for(int i=0;i<n;i++){
            ans[i]=arr[i];
        }
        Arrays.sort(ans, (a, b) -> {
            if (map.get(a) != map.get(b)) {
                return map.get(a) - map.get(b); 
            }
            return a - b;                          
        });
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
        return arr;
    }
    public static int solve(int n){
        int cnt=0;
        while(n!=0){
            n=n & (n-1);
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] sortedArr = sortByBits(arr);
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}