
import java.io.FileWriter;
import java.io.IOException;

public class writefile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("pokemon.txt");
            writer.write("hello main hoon ash ketchum pallet town se aur ye hai mera partner pikachu");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
