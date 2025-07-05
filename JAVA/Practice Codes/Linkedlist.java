import java.util.Scanner;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class Linkedlist {
    private Node head;

    public void addNode(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(value);
        }
    }

    public int findNextValue(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == target) {
                return (temp.next != null) ? temp.next.value : -2;
            }
            temp = temp.next;
        }
        return -1; 
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 unique values for the linked list:");
        for (int i = 0; i < 5; i++) {
            list.addNode(scanner.nextInt());
        }

        System.out.print("Enter the target value: ");
        
        int target = scanner.nextInt();

        int result = list.findNextValue(target);
        if (result == -1) {
            System.out.println("Target value not found.");
        } else if (result == -2) {
            System.out.println("No next node.");
        } else {
            System.out.println("The value of the next node is: " + result);
        }

        scanner.close();
    }
}
