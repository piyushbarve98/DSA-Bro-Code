import java.util.LinkedList;

public class Linked_List_4 {
    
    public static void main(String[] args){

        LinkedList<String> list = new LinkedList<>();

        // we can use linked list as both stack and queue (all the methods of both stack and queue can be used)

        list.add("A"); // adds item to the end of the list
        list.add("B");
        list.add("C");

        list.remove("B"); // removes item
        list.add(1,"none"); // adds to the specific index

        list.addFirst("Start");
        list.addLast("Last");
        System.out.println(list.get(3));
        System.out.println(list);
    }
}

// --------------------------------------------------------------

// Linked List :- linear data structure contains/stores nodes which has two parts [data + address]
//                Nodes are in non - consecutive memory locations
//                All the elements are linked using pointers

//                                  Singly Linked List
//                     Node                 Node                  Node
//              [data | address] ---> [data | address] ---> [data  | address]

//                                  Doubly Linked List
//                     Node                 Node                  Node
//              [ address | data | address] <---> [address | data | address] <---> [address | data  | address]

// advantages of linked list ?

// 1. Dynamic data structure (allocates needed memory while running)
// 2. insertion and deletion of node is easy. O(1)
// 3. No/low memory wastage

// Disadvantages ?

// 1. No random access of elements (no index [i])
// 2. greater memory usage (additional pointer for address)
// 3. searcing/accessing element is more time consuming (O(n))

// Uses of linked list?
// 1. Stack and queue implementation
// 2. Gps navigation
// 3. music playlist
