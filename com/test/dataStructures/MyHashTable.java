package dataStructures;

public class MyHashTable<T> {
    private final int TABLE_SIZE = 10;
    // we cannot make generic array, only basic types, so we do not write the generic type 
    // on the right hand side
    private HashNode<T>[] TABLE = new HashNode[TABLE_SIZE];

    public MyHashTable(){
        for(int i=0;i<TABLE_SIZE;i++){
            TABLE[i] = new HashNode<T>(null);
        }
    }

    private int hash(T obj){
        return obj.hashCode() % TABLE_SIZE;
    }

    public void insert(T obj){
        int index = hash(obj);
        HashNode<T> head = TABLE[index];
        //insert on the front
        HashNode<T> temp = new HashNode<>(obj);
        temp.next = head.next;
        head.next = temp;
    }

    public boolean contains(T obj){
        int index = hash(obj);
        HashNode<T> head = TABLE[index].next;
        while(head != null){
            if(head.element == obj){
                return true;
            }
            head = head.next;
        }
        return false;
        
    }
    
    @Override
    public String toString(){
        StringBuilder build = new StringBuilder();
        for(int i=0;i<TABLE_SIZE;i++){
            HashNode<T> head = TABLE[i].next;
            if(head == null){
                build.append("index ").append(i).append(": ");
            }
            while(head != null){
                build.append("index ").append(i).append(": ").append(head.element).append(" -> ");
                head = head.next;
            }

            build.append("\n");
        }
        return build.toString();
    }

    public class HashNode<T>{
        T element;
        HashNode<T> next;

        public HashNode(T obj){
            element = obj;
        }
    }
}
