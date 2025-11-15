public class Solution {
    public static int ninjaTraining(int n, int points[][]) {

        // Write your code here..
        int prev[]=new int[4];
       
        for(int last=0;last<4;last++){
            int best=0;
            for(int task=0;task<3;task++){
                if(task!=last){
                    best=Math.max(best,points[0][task]);
                }
            }
            prev[last]=best;
        }

        for(int i=1;i<n;i++){
            int curr[]=new int[4];
            for(int last=0;last<4;last++){
            int best=0;
            for(int task=0;task<3;task++){
                if(task!=last){
                    int val=points[i][task]+prev[task];
                    best=Math.max(best,val);
                }
            }
            curr[last]=best;
           
        }
         prev=curr;
        }
        return prev[3];
    }

}
