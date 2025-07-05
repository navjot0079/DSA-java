public class ReverseLL {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public static Node reverse(Node head){
            if (head.next==null) {
                return head;
            }
            Node newhead=reverse(head.next);
            head.next.next=head;
            head.next=null;
            return newhead;
        } 

        public static void display(Node head){
            if(head==null)return;
            System.out.print(head.data+" ");

            display(head.next);
            System.out.println();

        } 
    

    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        display(a);
        a=reverse(a);
        display(a);
    }
}
