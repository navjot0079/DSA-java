public class nthNodefromend {
public static Node nthNode(Node head,int n){
    Node slow=head;
    Node fast=head;
    for(int i=1;i<=n;i++){
        fast=fast.next;
    }
    while(fast!=null){
        slow=slow.next;
        fast=fast.next;
    }
    return slow;
}

public static void display(Node head){
    Node temp =head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
}

public static void deleteNthNode(Node head,int n){
    Node slow=head;
    Node fast=head;
    for(int i=1;i<=n;i++){
        fast=fast.next;
    }
    while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;
    }
    slow.next=slow.next.next;
}
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(3);
        Node e=new Node(12);
        Node f=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node temp=nthNode(a,2);
        System.out.println(temp.data);
        display(a);
    }
}
