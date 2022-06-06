import java.lang.reflect.Array;
import java.util.Arrays;


// Binary Search :- searching algorithm that finds the target value withtin a sorted array.
//                  Half of the array is eliminated during each step
//                  using repeated halving, each time we divide into two parts to maintain smaller searching space
//                  Runtime Complexity : O(log n)

public class Binary_Search {
    
    public static void main(String[] args){

        int[] arr = {1, 4, 7, 8, 13, 15, 18};
        int index = binarySearch(arr,13);

        System.out.println(index);
    } 

    public static int binarySearch(int[] arr, int value){

        int l = 0;
        int r = arr.length - 1; 
        while(l<=r){

            int mid = (l + r)/2;

            if(arr[mid] == value) return mid;

            else if(arr[mid] > value) r = mid-1;

            else l = mid + 1;
        }
        return -1;
    }
}
