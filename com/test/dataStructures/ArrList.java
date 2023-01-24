package dataStructures;

public class ArrList<T> {
    private int size = 0;
    private int capacity = 20;
    public Object[] arr = new Object[capacity];

    public void add(T element, int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("must add at location from 0 to " + size);
        }
        if(size >= capacity){
            //shift by 1 means double the size
            int newCap = capacity + (capacity >> 1);
            Object[] newArr = new Object[newCap];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr; 
            capacity = newCap;
        }
        //start from the end of array and copy the element over one by one
        for(int i = size ; i>index ; i--){
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
        size++;
    }

    public T delete(int index){
        //check if out of bound (-1 index or higher than last index)
        if(index < 0 || index > size-1){
            throw new IndexOutOfBoundsException("must delete at location from 0 to " + size);
        }
        //save the element before delete
        T element = (T) arr[index];
        for(int i=index ; i < size ; i++){
            arr[i] = arr[i+1];
        }
        size--;
        return element;
    }

    public T get(int index){
        if(index < 0 || index > size-1){
            throw new IndexOutOfBoundsException("must get at location from 0 to " + size);
        }
        T element = (T) arr[index];
        return element;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void print() {
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("capacity: " + capacity);
        System.out.println("size: " + size);
    }

    
}
