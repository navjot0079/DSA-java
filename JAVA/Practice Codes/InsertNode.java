public class InsertNode {
    public static class Node {
        int data;
        Node next;

        Node (int data){
            this.data=data;
        }    
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertatend(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }


        void insertAt(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size){
                insertatend(val);
                return;
            }
            else if(idx==0){
                insertathead(val);
                return;
            }
            else if(idx<0 || idx>size){
                System.out.println("wrong index");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }


        void insertathead(int val){
            Node temp=new Node(val);
            if(head==null){
                insertatend(val);
            }
            else{
                temp.next=head;
                head=temp;
            }
            size++;
        }

        int getAt(int idx){
            if(idx<0 || idx>size){
                System.out.println("wrong index");
                return -1;
            }
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void deleteNodeat(int idx){
            Node temp=head;
            if(idx==0){
                head=temp.next;
                size--;
                return;
            }
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            size--;
        }

        void display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
     
    public static void main(String[] args) {
        linkedlist list=new linkedlist();
        list.insertatend(10);
        list.insertatend(20);
        //list.display();
        list.insertathead(30);
        list.insertathead(50);
        //list.display();
        list.insertAt(2,60);
        list.display();
        //System.out.println(list.getAt(3));
        list.deleteNodeat(0);
        list.display();
        System.out.println(list.head.data);
    }
}
