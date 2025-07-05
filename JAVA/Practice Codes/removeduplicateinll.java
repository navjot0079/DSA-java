public class removeduplicateinll {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node removeduplicate(Node head){
        Node temp=head;
        while (temp!=null) {
            Node pre=temp;
            while (pre.next!=null ) {
                if(pre.next.data==temp.data){
                    pre.next=pre.next.next;
                }
                else{
                    pre=pre.next;
                }
            }
            temp=temp.next;
        }
        return head;
    }
    public static void print(Node head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(2);
        Node d=new Node(4);
        Node e=new Node(1);
        Node f=new Node(3);
        Node g=new Node(2);
        Node h=new Node(3);
        Node i=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=null;
        Node ans=removeduplicate(a);
    print(ans);
    }
}
