

public class Unique_Element_Question {
    
    public static void main(String[] args){
    int[] arr = {2,3,3,4,4,5,5,8};
    int n = arr.length;
    for(int i = 0; i<n; i++){
        
        if(i==0 && arr[i] != arr[i+1])  System.out.print(arr[i] +" ");

        else if(i>0 && i<n-1 && arr[i]!=arr[i-1] && arr[i] != arr[i+1]){
            System.out.print(arr[i] +" ");
        }

        else if(i==n-1 && arr[i] != arr[i-1]) System.out.print(arr[i] +" ");
    }
}
}
