

//-------------------------------------------------------------------------------------
// Bubble Sort :- Pairs of adjacent elements are compared, and swapped with each other 
//                if they are not in order

//                Quadratic time complexity O(n^2)
//                small data set - okay-ish
//                large data set - bad
//-------------------------------------------------------------------------------------
public class Bubble_Sort_1 {
   
    public static void main(String[] args) {
        
        int[] arr = {4,2,6,1,7,2,8,3,1};

        bubbleSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    private static void bubbleSort(int arr[]){

        int temp;
        int n = arr.length-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
}
