public class MatrixChainMultiplication {
    public static int matrixMultiplication(int arr[]) {
        // code here
        int n=arr.length;
        int dp[][]=new int[n][n];
         
        for(int i=0;i<n;i++) dp[i][i]=0;
        
        for(int i=n-1;i>=1;i--){
            for(int j=i+1;j<n;j++){
                int mini=Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int steps=arr[i-1]*arr[j]*arr[k]+dp[i][k]+dp[k+1][j];
                    if(steps<mini){
                        mini=steps;
                    }
                }
                dp[i][j]=mini;
            }
        }
        return dp[1][n-1];
    }

    public static void main(String[] args) {
        int arr[]={2,1,3,4};
        System.out.println(matrixMultiplication(arr));
    }
}
