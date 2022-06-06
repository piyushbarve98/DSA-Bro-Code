
// Linear Search :- iterate through a collection on element at a time
//                  runtime complexity :- O(n)

//                  Advantages:-
//                  1. Good for small to medium datasets
//                  2. Useful for data structures which does not have random access(Linked List)
//                  3. Does not need to be sorted

//                  Disadvantages:-
//                  1. Slow for large datasets

public class Linear_Search {
    
    public static void main(String[] args){

        int[] arr = {3,8,2,1,9,23,45,32,12};

        int index = linearSearch(arr,1);

        if(index!=-1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] arr, int value){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}
