import java.util.*;
 class  TreeNode{
    int left,right,val;
    public TreeNode(int val){
        this.val=val;
    }
    
}
public class HeapLearning {
    public static ArrayList<Integer> list=new ArrayList<>();

    public static int parent(int ci){
        return (ci-1)/2;
    }
    public static void insert(int data){
        list.add(data);
        int ci=list.size()-1;

        while (ci>0 && list.get(ci)<list.get(parent(ci))) {
            swap(ci, parent(ci));
        }
    }
    
    public static void swap(int ci,int pi){
        int v1=list.get(pi);
        int v2=list.get(ci);
        list.set(ci,v1);
        list.set(pi,v2);
    }
    public int get(){
       // int ans=list.get(0);
        int last=list.remove(list.size()-1);
        if (list.size()!=0) {
            list.add(0,last);
            int min=0;
            int pi=0;
            while (true) {
                int lc=2*pi+1;
                int rc=2*pi+2;
                if(lc<list.size() && list.get(lc)<list.get(pi)){
                    min=lc;
                }
                if(rc<list.size() && list.get(rc)<list.get(pi)){
                    min=rc;
                }
                if(min==pi){
                    break;
                }
                swap(pi, min);
                pi=min;
            }
        }
        
        return 0;
    }
    
    public static void main(String[] args) {
        int arr[]={50,10,40,-30,5,20};
        for (int i = 0; i < arr.length; i++) {
           insert(arr[i]);
        }
        System.out.println(list);
    }
}
