import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        boolean []used=new boolean[arr.length];
        ArrayList<Integer> list=new ArrayList<>();
        solve(arr,list,used);
    }
    public static void solve(int arr[], ArrayList<Integer> list,boolean used[]){
        if (list.size()==arr.length) {
            System.out.println(list);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if (used[i]==true) continue;
            used[i]=true;
            list.add(arr[i]);
            solve(arr, list, used);
            list.remove(list.size()-1);
            used[i]=false; 
        }
    }
}
