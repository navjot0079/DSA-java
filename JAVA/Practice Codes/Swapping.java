import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i=i+2){
            int temp = array[i+1];
            array[i+1] = array[i];
            array[i] = temp;
        }
        for(int i=0;i<n;i++){
           System.out.println(array[i]);
        }
        sc.close();
    }
}
