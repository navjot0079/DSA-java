class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class stackList{
    private Node head = null;
    private int size = 0;
    void push(int val){
        Node temp = new Node(val);
            temp.next=head;
            head=temp;
            size++;
    }
    int pop(){
        int res = head.val;
        head = head.next;
        size--;
        return res;
    }
    int peek(){
        return head.val;
    }
    boolean isEmpty(){
        return size == 0;
    }
    void display(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.val+ " -> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();

    }
    int size(){
        return size;
    }

}

public class  linkedlistImplementation{
    public static void main(String[] args) {
        stackList st = new stackList();
        st.push(4);
        st.push(20);
        st.push(450);
        st.push(300);
        st.display();

        System.out.println("size of stack " + st.size());
        System.out.println("top "+st.peek());
        System.out.println(st.pop());
        st.display();

    }
}