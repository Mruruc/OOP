package Generics;

public class CustomArrayList<T> {
    private Object[] arr;
    private static final int DEFAULT_SIZE=10;
    private int size=0;

    public CustomArrayList() {
        this.arr =new Object[DEFAULT_SIZE];
    }

    public void add(T data){

        if(size== arr.length){
            resize();
        }
        arr[size]=data;
        size++;
    }
    private void resize() {
        //Create a new Array;
        Object[] temp=new Object[arr.length*2];

        //copy the content of current Array into new array:
        for (int i = 0; i <arr.length; i++) {
            temp[i]=arr[i];
        }
        //new array equal to old array:
        arr=temp;
    }

    public int size(){
        return this.size;
    }

    public int getIndex(T data){

        for (int i = 0; i <size; i++) {
            if(arr[i]==data){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }

    public T getValue(int index){
       return (T)(arr[index]);
    }


    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        // Shift elements to the left to remove the element at the specified index
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        // Set the last element to 0
        arr[size - 1] = 0;
        size--;
    }

    public void set(int index,T value){
        arr[index]=value;
    }

    public void print(){
        for (int i = 0; i <size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
