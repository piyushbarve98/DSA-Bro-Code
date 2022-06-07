
public class Insertion_Sort_3 {
    
    public static void main(String[] args){
        
        int[] arr = {3,2,6,2,1,8,5};

        insertionSort(arr);

        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] arr){

        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]> temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
