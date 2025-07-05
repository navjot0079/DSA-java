

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {
    public static void main(String[] args) {
        try {
            File file=new File("pokemon.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
