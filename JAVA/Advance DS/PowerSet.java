import java.util.ArrayList;

public class PowerSet {
    public static void main(String[] args) {
        int arr[]={3,5,6,7};
        ArrayList<Integer> list=new ArrayList<>();
        int target=9;
        solve(arr,list,0,0,target);

    }
    public static void solve(int[] arr,ArrayList<Integer> list,int idx,int sum,int target){
        if(idx==arr.length ){
            if(sum<=target){ 
                System.out.println(list);
            }
            return;
        }
        if(idx>arr.length) return;
        if (sum>target) {
            return;
        }
        solve(arr, list, idx+1,sum,target);
        list.add(arr[idx]);
        solve(arr, list, idx+1,sum+arr[idx],target);
        list.remove(list.size()-1);
    }
}

