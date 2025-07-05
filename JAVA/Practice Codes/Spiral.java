import java.util.Scanner;

public class Spiral {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int firstrow=0;
        int lastrow=m;
        int firstcol=0;
        int lastcol=n;
        int count=0;
        int total=m*n;
       while(count<total){
            for(int i=0;i<lastcol && count<total;i++){
                System.out.print(arr[firstrow][i]+" ");
                count++;
            }
            firstrow++;
            for(int i=1;i<lastrow && count<total;i++){
                System.out.print(arr[i][lastcol-1]+" ");
                count++;
            }
            lastcol--;
                for(int i=lastcol;i>0 && count<total;i--){
                    System.out.print(arr[lastcol][i-1]+ " ");
                    count++;
                }
            lastrow--;
                for(int i=lastrow-1;i>0 && count<total;i--){
                    System.out.print(arr[i][firstcol]+" ");
                    count++;
                }
            firstcol++;
            
            }
        sc.close();
    }
}
