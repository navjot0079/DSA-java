class Pokemon {
    void start() {
        System.out.println("Ready Set Go.");
    } 
}

class Pikachu extends Pokemon {
    @Override
    void start() {
        System.out.println("Go Pikachu, use Thunderbolt!");
    }
}

class Darkrai extends Pokemon {
    @Override
    void start() {
        System.out.println("Darkrai, use Shadow Ball!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        Pokemon p2 = new Pikachu();  // Upcasting
        Pokemon p3 = new Darkrai();  // Upcasting

        p1.start();  // Calls Pokemon version
        p2.start();  // Calls Pikachu's overridden method
        p3.start();  // Calls Darkrai's overridden method
    }
}
