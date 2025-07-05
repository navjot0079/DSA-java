public class intersectionOfLL {
    
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to find the intersection node
    Node findIntersection(Node head1, Node head2) {
        // Get lengths of both linked lists
        Node temp1 = head1;
        int m = 0;
        while (temp1 != null) {
            temp1 = temp1.next;
            m++;
        }

        Node temp2 = head2;
        int n = 0;
        while (temp2 != null) {
            temp2 = temp2.next;
            n++;
        }

        // Reset temp pointers to heads
        temp1 = head1;
        temp2 = head2;

        // Adjust longer list's head to match shorter list's start
        int diff = Math.abs(m - n);
        if (m > n) {
            for (int i = 0; i < diff; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                temp2 = temp2.next;
            }
        }

        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1; // Intersection point found
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null; // No intersection
    }

    public static void main(String[] args) {
        Node common = new Node(8);
        common.next = new Node(10);
        common.next.next = new Node(12);

        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);
        head1.next.next.next = common;  

        Node head2 = new Node(2);
        head2.next = new Node(6);
        head2.next.next = common; 

        intersectionOfLL obj = new intersectionOfLL();
        Node intersection = obj.findIntersection(head1, head2);

        if (intersection != null) {
            System.out.println("Intersection point: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
