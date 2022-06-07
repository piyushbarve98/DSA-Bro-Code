
//---------------------------------------------------------------------------------------------
// Selection Sort :- search through an array and keep track of minimum value in each iteration, 
//                   and after every iteration we swap values

//                   Quadratic time O(n^2)
//                   small dataset = okay
//                   large dataset = bad
//----------------------------------------------------------------------------------------------

public class Selection_Sort_2 {
    
    public static void main(String[] args) {
        int[] arr = {3,2,6,1,9,4,2,5,7};

        selectionSort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr){

        int n = arr.length - 1;
        for(int i=0; i<n; i++){
            int temp;
            int min = i;
            for(int j = i+1 ; j<=n ; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    
}
