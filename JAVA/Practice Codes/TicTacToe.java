import java.util.Scanner;

public class TicTacToe {

   public static void main(String[] var0) {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter your num: ");
      int n = s.nextInt();
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                arr[i][j] = s.next().charAt(0);
            }
        }
        
     //1case
     for(int i=0;i<n;i++){
      char first= arr[0][i];
      int cnt=0;
      for(int j=0;j<n;j++){
          if(arr[i][j]==first){
            cnt++;
          }
      }
      if(cnt==n){
         System.out.println(first);
      }
     }
//2case
     for(int i=0;i<n;i++){
      char first= arr[i][0];
      int cnt=0;
      for(int j=0;j<n;j++){
          if(arr[j][i]==first){
            cnt++;
          }
      }
      if(cnt==n){
         System.out.println(first);
      }
     }

//3case
char first=arr[0][0];
char sec=arr[0][n-1];
int cntfirst=0,cntsecond=0;
for(int i=0;i<n;i++){
   if(arr[i][i]==first) cntfirst++;
   if(arr[i][n-i-1]==sec) cntsecond++;
}
if(cntfirst==n){System.out.println(first);}
if(cntsecond==n){System.out.println(sec);}
System.out.println("Draw");
   s.close();
   }
}
