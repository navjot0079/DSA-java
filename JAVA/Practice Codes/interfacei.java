interface Animal {
    int eyes=2;
    void walk();
    
}
interface herbivore {
    int nose=1;
    
}
class horse implements Animal,herbivore {
    public void walk(){
        System.out.println("has 4 legs " + eyes+" eyes "+nose+" nose");
    }
    
}
public class interfacei {
    public static void main(String[] args){
        horse hor=new horse();
        hor.walk();
    }
}
