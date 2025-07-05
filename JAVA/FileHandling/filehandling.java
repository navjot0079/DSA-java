//package FileHandling;
import java.io.File;
import java.io.IOException;

public class filehandling {
    public static void main(String[] args) {
       try{
        File file=new File("pokemon.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        else{
            System.out.println("file already exists.");
        }
       }
       catch(IOException e){
        System.out.println("an error occured");
        e.printStackTrace();
       }
    }
}
