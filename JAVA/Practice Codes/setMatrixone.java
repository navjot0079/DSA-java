import java.util.Scanner;

public class setMatrixone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        
        int row[]=new int[m];
        int col[]=new int[n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(row[i]==1){
            for(int k=0;k<m;k++){
                arr[i][k]=1;
            }
        }
        else if(col[j]==1){
            for(int k=0;k<n;k++){
                arr[k][j]=1;
            }
        }
    }
}

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
