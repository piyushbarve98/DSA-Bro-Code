import java.lang.*;

public class Create_Dynamic_Array_5 {
    
    int size=0;
    int capacity = 10;
    Object[] array;

    public Create_Dynamic_Array_5(){
        this.array = new Object[capacity];
    } 

    public Create_Dynamic_Array_5(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data){
        if(size>=capacity){
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data){
        if(size>=capacity){
            grow();
        }

        for(int i=size; i>index ; i--){
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data){

        for(int i = 0; i < size; i++) {
			if(array[i] == data) {
				for(int j = 0; j < (size - i + 1); j++){
					array[i + j] = array[i + j + 1];
				}
				array[size - 1] = null;
				size--;
				if(size <=(int) (capacity/3)) {
					shrink();
				}
				
			}
		}
    }

    public int search(Object data){
        for(int i=0; i<size; i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }

    public void grow(){

        int newCapacity = (int) capacity * 2;
        Object[] newArray = new Object[newCapacity];

        for(int i=0; i<size; i++){
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity;
    }

    public void shrink(){

        int newCapacity = capacity / 2;
        Object[] newArray = new Object[newCapacity];

        for(int i=0; i<size; i++){
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity;

    }

    public String toString(){

        String str = "";
        for(int i = 0; i<size ; i++){
            str = str + array[i] + " ,";
        }
        if(str!=""){
            str = "[" + str.substring(0,str.length() - 2) + "]";
        }
        else{
            str = "[]";
        }
        return str;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public static void main(String[] args){

        Create_Dynamic_Array_5 dyArr = new Create_Dynamic_Array_5();

        dyArr.add("A");
        dyArr.add("B");
        dyArr.add("C");
        dyArr.add("D");

        // dyArr.insert(2, "C");
        // dyArr.delete("A");

        System.out.println(dyArr);
        System.out.println("Index: " + dyArr.search("D"));
        System.out.println("Empty: " + dyArr.isEmpty());
        System.out.println("Size: " + dyArr.size);
        System.out.println("Capacity: " + dyArr.capacity);

    }
    

}
