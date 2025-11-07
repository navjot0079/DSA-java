import java.util.*;

public class JobScheduling {
    static class pair {
        int d;
        int v;

        pair(int d, int v) {
            this.d = d;
            this.v = v;
        }

    }

    public static void main(String[] args) {
        int delay[]={2,1,3,3,4,4};
        int val[]={15,25,20,40,20};

        ArrayList<pair> list=new ArrayList<>();
        for(int i=0;i<val.length;i++){
            pair p=new pair(delay[i], val[i]);
            list.add(p);
        }

        Collections.sort(list,new Comparator<pair>() {
            @Override
            public int compare(pair a1,pair a2){
                return a2.v-a1.v;
            }
        });
        int vis[]=new int[list.size()+1];

        int total=0;
        for(int i=0;i<list.size();i++){
           pair p=list.get(i);
           int start=p.d;
           while(start>=0){
            if(vis[start]==0){
                vis[start]=1;
                total+=p.v;
                break;
            }
            start--;
           }
        }
        System.out.println(total);
    }
}