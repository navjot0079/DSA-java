import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
}
public class SerializeDemo {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "John");

            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.close();
            fos.close();

            System.out.println("Object has been serialized");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
