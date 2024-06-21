import java.util.ArrayDeque;
import java.util.Queue;

public class Queuee { // Use FIFO system. First in first out
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>(); // Create Queue

        queue.add("C");
        queue.add("C#");
        queue.add("Java"); // Add Elements on Queue

        for (String item : queue) {
            System.out.println(item);
        }// Print the Queue

        System.out.println("\nElement removed from the queue: " + queue.remove());
        //Remove the first elements on queue

        System.out.println("\nElements in the queue after removal:");
        for (String item : queue) {
            System.out.println(item);
        }//Print the new queue

        System.out.println("\nElement at the front of the queue: " + queue.peek());
        //Print the first elenments on queue
    }
}
