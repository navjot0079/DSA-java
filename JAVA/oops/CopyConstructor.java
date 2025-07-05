package oops;
class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor (Deep Copy)
    Person(Person obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

    // Method to display Person details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class CopyConstructor{
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        System.out.print("Original Object: ");
        p1.display();

        // Creating a copy using the copy constructor
        Person p2 = new Person(p1);
        System.out.print("Copied Object: ");
        p2.display();
    }
}
