public class doublell{
    public static class Node {
    int data;
    Node next;
    Node prev;
    Node (int data){
        this.data=data;
    }
        
    }
    public static Node insertionathead(Node head,int x){
        Node t=new Node(x);
        t.next=head;
        head.prev=t;
        head=t;
        
        return head;
    }
    public static Node insertionathead(Node head,int idx,int x){
        Node t=new Node(x);
        Node temp=head;
        for (int i = 1; i < idx; i++) {
            temp=temp.next;
        }
        temp.next.prev=t;
        t.prev=temp;
        t.next=temp.next;
        temp.next=t;
        return head;
    }
    public static void displayLL(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void displayrevLL(Node tail){
        Node temp=tail;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.prev=null;
        a.next=b;
        b.next=c;
        b.prev=a;
        c.next=d;
        c.prev=b;
        d.next=e;
        d.prev=c;
        e.prev=d;
        e.next=null;
        displayLL(a);
        displayrevLL(e);
        Node newhead=insertionathead(a, 34);
        insertionathead(a,3, 100);
        displayLL(a);
        
    }
}