package dataStructures;

import java.util.NoSuchElementException;

public class MyStack<T> {

    private static class Node<T>{
        private T element;
        private Node<T> next;

        public Node(T element){
            this.element = element;
        }
    }

    private Node<T> head = new Node<>(null); 
    private int size = 0;

    public void push(T element){
        Node<T> temp = new Node<T>(element);
        temp.next = head.next;
        head.next = temp;
        size++;
    }

    public T pop(){
        if(isEmpty()){
            throw new NoSuchElementException("empty stack 0");
        }
        T val = head.next.element;
        head.next = head.next.next;
        size--;
        return (T) val;
    }

    public boolean isEmpty(){
        return size == 0;
    }

}
