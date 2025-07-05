import java.util.Scanner;

public class Graycode {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close(); 
        int value=1;
        for(int i=0;i<n;i++){
             value=value*2;
        }
        for(int i=0;i<value;i++){
            String binaryRepresentation = Integer.toBinaryString(i);
            System.out.println(binaryRepresentation);
        }

    }
}
