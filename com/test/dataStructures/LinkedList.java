package dataStructures;

public class LinkedList<T> {
    
    private static class Node<T>{
        private T element;
        private Node<T> next;

        public Node(T element){
            this.element = element;
        }
    }

    private Node<T> head = new Node<>(null); 
    private int size = 0;

    public void add(T element, int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("must add at location from 0 to " + size);
        }
        Node<T> temp = new Node<T>(element);
        Node<T> prev = head;
        for (int i=0;i<size;i++){
            prev = prev.next;
        }
        temp.next = prev.next;
        prev.next = temp;
        size++;
    }

    public T delete(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("must delete at location from 0 to " + size);
        }
        Node<T> prev = head;
        for(int i=0;i<index;i++){
            prev = prev.next;
        }
        T val = prev.next.element;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public T get(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("must get at location from 0 to " + size);
        }
        Node<T> prev = head;
        while(index-- >= 0){
            prev = prev.next;
        }
        return (T) prev.element;
    }

    public int getSize(){
        return size;
    }
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("LL: ");
        //values start at head.next cuz head is empty
        Node<T> node = head.next;
        while(node != null){
            builder.append(node.element).append(" ");
            node = node.next;
        }
        return builder.toString();
    }
}
