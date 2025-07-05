import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);  
        queue.offer(20); 
        queue.offer(30);


        System.out.println("Removed element: " + queue.remove()); 
        System.out.println("Queue after deletion: " + queue);


        System.out.println("Front element (peek): " + queue.peek());

        System.out.println("Removed element: " + queue.poll()); 
        System.out.println("Queue after deletion: " + queue); 

        System.out.println("Is queue empty? " + queue.isEmpty()); 

        System.out.println("Queue size: " + queue.size()); 

        System.out.println("Removed element: " + queue.remove()); 
        System.out.println("Queue after deletion: " + queue);

        // System.out.println("Removed element: " + queue.remove()); 
        // System.out.println("Front element (peek): " + queue.element());
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        Queue<Integer> queue2=new LinkedList<>();
        while (queue.size()>0) {
            System.out.print(queue.peek()+" ");
            queue2.add(queue.remove());
        }
        
        while (queue2.size()>0) {
            queue.add(queue2.remove());
        }


    }
}
