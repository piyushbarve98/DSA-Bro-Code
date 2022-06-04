
/*
 * Stack :- --> It is a LIFO (last in first out) data structure 
 *          --> The object that goes last into the stack will come out first
 *          --> Stores objects into a sort of "vertical tower"
 *          --> push() to add object to the top
 *          --> pop() to remove object from the top        
 */

 import java.util.Stack;

 public class Stack_2{

    public static void main(String [] args){

        Stack<String> proLang = new Stack<String>(); //initialize a stack through the constructor
        //proLang --> Programming Languange Stack

        System.out.println(proLang.isEmpty()); // to check if stack is empty --> op --> true

        proLang.push("Java"); // push() method to push an object on top of stack
        proLang.push("Python");
        proLang.push("C++");
        proLang.push("C"); 

        String poppedItem = proLang.pop();  // removes topmost element from stack --> returns topmost element -> C

        System.out.println(proLang); // to print whole stack --> op --> [Java, Python, C++]
        System.out.println(poppedItem); // prints the item which is removed --> op -> C

        String topmostEle = proLang.peek(); // shows the topmost element of the stack
        System.out.println(topmostEle); // op --> C++

        int itemPos = proLang.search("Python"); // search method is used to get position of item in stack
        System.out.println(itemPos); // prints 2 (python is on 2nd place) if does not found returns -1

        proLang.clear(); // removes everything from the stack
        System.out.println(proLang); // prints empty stack --> []

        /*
         *  We can use for/while loop to push or pop multiple times
         *  OutOfMemory : Java heap space ...  Error comes when we push items alot of times
         *  EmptyStackException if we try to pop from an empty stack
         */
    }
 }

 /* Uses of stacks?
    1. undo/redo feature in text editors
    2. moving back/forward through browser history
    3. Backtracking algorithms (maze/file directories)
    4. calling functions (call Stack)
 */


