import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        sc.close();
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=array[i];
        }
        int max=0;
        System.out.println(sum);
        for(int i=0;i<n;i++){
            if(max>array[i]){
                max=array[i];
            }
        }
        System.out.println(max);

    }
}
