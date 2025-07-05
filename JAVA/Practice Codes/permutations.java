import java.util.Scanner;

public class permutations { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        sc.close();
        if(n==2 || n==3){
            System.out.print("NO Solution");
            return;
        }
        for (long index = 1; index <= n; index=index+2) {
            System.out.print(index+" ");
                
        }
        for (int index = 2; index <= n; index=index+2) {
            System.out.print(index+" ");
                
        }
        
        
    }
}
