package dataStructures;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    private static class Node<T>{
        private T element;
        private Node<T> next;

        public Node(T element){
            this.element = element;
        }
    }

    private Node<T> head = new Node<>(null); 
    private Node<T> tail = null;
    private int size = 0;

    public void enqueue(T element){
        Node<T> temp = new Node<T>(element);
        // if no tail yet
        if(tail == null){
            head.next = temp;
            tail = temp;
            size++;
            return;
        }
        // if there is already tail
        tail.next = temp;
        tail = temp;
        size++;
    }

    public T dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("empty queue");
        }
        T val = head.next.element;
        head.next = head.next.next;
        if(head.next == null){
            tail = null;
        }
        size--;
        return val;
    }

    public T peek(){
        if(isEmpty()){
            throw new NoSuchElementException("empty queue");
        }
        return head.next.element;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }
}
