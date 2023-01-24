package dataStructures;


public class Dstest {
    public static void main(String[] args){
        // Self Made ArrList test
        ArrList<Integer> arr = new ArrList<>();
        arr.add(2,0);
        // arr.add(1,1);
        // arr.add(10,3);
        // for(int i=0;i<20;i++){
        //     arr.add(i, i);
        // }
        arr.delete(0);
        arr.print();


        // linked list test 
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(0, 0);
        ll.add(1, 0);
        ll.add(2, 0);
        System.out.print(ll+"\n");


        // MyStack test
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.print("stack: ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
           

        // MyQueue test
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(25);
        System.out.print("queue size: "+ queue.getSize()+"\nqueue: ");
        //System.out.print(queue.dequeue()+" ");
        while(!queue.isEmpty()){
            System.out.print(queue.dequeue()+" ");
        }
        System.out.println();
        

    }
}
