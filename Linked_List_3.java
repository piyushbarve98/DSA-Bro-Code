import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;

// -----------------------------------------------------------------------------
// Queue :- FIFO (First In First Out) data structure ex- line of people
//          The object that enters first will removed first (first come first serve)
//          The collection designed for holding the elements prior to processing
//          Linear Data Structure

//          add- enqueue -> offer() --> enters from last
//          remove- dequeue -> poll() --> removes from start
// -----------------------------------------------------------------------------
public class Linked_List_3 {
    

    public static void main(String[] args){
    // Queue<String> queue = new Queue<String>(); we can not instantiate queue like this because 
    // it is an interface not a class so we can implement it through linked list 

    Queue<String> ticketLine = new LinkedList<String>();

    ticketLine.offer("Person1"); // adds element to the last of the queue
    ticketLine.offer("Person2");
    ticketLine.offer("Person3");
    
    Iterator iterator = ticketLine.iterator(); // method iterates over the queue and returns the elements(iterator)

    while(iterator.hasNext()){
        System.out.println(iterator.next()); // --> Person1 --> Person2 --> Person3
    }

    ticketLine.poll(); // removes first element from the queue --> Person1 deleted

    System.out.println(ticketLine.peek()); // shows the start element of the queue --> Person2
    System.out.println(ticketLine); // op --> [Person2, Person3]

    System.out.println(ticketLine.size()); // returns size of the queue
    System.out.println(ticketLine.isEmpty());  // checks if queue is empty
    System.out.println(ticketLine.contains("Person1")); // checks if the object is in the queue or not 

    }
}

// where are queues useful?

// 1. Keyboard Buffer (letter should appear on the screen in the order they are pressed)
// 2. Printer Queue (Print jobs should be completed in order) 
// 3. Uses in linked list, priority queue, breadth first search
