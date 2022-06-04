import java.util.PriorityQueue;
import java.util.Queue;

// Priority Queue :- Priority Queue is a special type of queue where all the elements
// are ordered on based of there natural ordering (priority) or based on a custom comparator 
// given at the time of creation
// Higher prioriy elements are served or processed first before elements of lower priority

public class Priority_Queue_4 {
    
    public static void main(String[] args){
    Queue<Double> cgpa = new PriorityQueue<>(); // instantiate PriorityQueue 

    cgpa.offer(7.8);  // offer adds element to the priorityqueue
    cgpa.offer(9.2);  
    cgpa.offer(6.4);
    cgpa.offer(8.2); 

    while(!cgpa.isEmpty()){
        System.out.println(cgpa.poll());
    }
    // op --> 6.4 , 7.8 , 8.2, 9.2 (Arranged in ascending order)

    // priority queue of grades a,b , c, d
    Queue<Character> grades = new PriorityQueue<>(); // instantiate PriorityQueue 

    grades.offer('D'); // offer adds element to the priorityqueue
    grades.offer('A'); 
    grades.offer('C');
    grades.offer('B'); 

    while(!grades.isEmpty()){
        System.out.println(grades.poll());
    }

    // op--> A, B, C, D
    
    }
}

// Uses of Priority Queue
// Operating System: To select the next process to run, to ensure that high priority task 
// run before low priority tasks 
