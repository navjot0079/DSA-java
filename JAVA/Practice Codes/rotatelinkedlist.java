import java.util.Scanner;

public class rotatelinkedlist {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node rotatell(Node head,int k){
        if(head==null || k==0) return head;
        Node temp=head;
        int len=1;
        while (temp.next!=null) {
            len++;
            temp=temp.next;
        }

        k=k%len;
        if(k==0) return head;
        temp.next=head;

        Node temp2=head;
        for(int i=1;i<len-k;i++){
            temp2=temp2.next;
        }

        Node newhead=temp2.next;
        temp2.next=null;
        return newhead;

    
    }
    public static void print(Node head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head=head.next;
        }
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
        int k=3;
    Node ans=rotatell(a,k);
    print(ans);
    }
    
}
