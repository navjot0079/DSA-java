import java.util.Scanner;

public class array_2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

    
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i + 1];
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) { 
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  
        }
        scanner.close();
    }
    
}