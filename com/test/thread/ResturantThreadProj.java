package thread;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;

public class ResturantThreadProj {
    static final Queue<Object> table = new LinkedList<>();
    public static void main(String[] args) throws InterruptedException {
        
        //create 2 chef
        Thread c1 = new Thread(()->{
            addDish();
        });
        c1.setName("Bob");


        Thread c2 = new Thread(ResturantThreadProj::addDish);
        c2.setName("Nguyen");

        c1.start();
        c2.start();

        new Thread(ResturantThreadProj::eatDish,"Andy").start();
        new Thread(ResturantThreadProj::eatDish,"Florence").start();
        new Thread(ResturantThreadProj::eatDish,"Yosuke").start();

        Thread.sleep(10000);
    }

    static void addDish(){
        try {
            //every 3 second chef finish cooking a dish
            //always be cooking
            while(true){
                Thread.sleep(3000);
                String name = Thread.currentThread().getName();
                System.out.println("chef " + name + " cooking. At " + new Date());
                //lock the queue so chefs don't put food on the table at the same time
                synchronized(table){
                    table.offer(new Object());
                    //tells other customer, you guys can began taking food
                    //from the table
                    table.notifyAll();
                }
            }
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void eatDish(){
        while(true){
            try {
                String name = Thread.currentThread().getName();
                //only 1 customer can take food at one time
                synchronized(table){
                    //if no food
                    while(table.isEmpty()){
                        table.wait();
                    }
                    //there is food now
                    table.poll();
                    System.out.println(name+" is devouring ... ");
                }
                //we can wait at the same time without lock
                //each customer can eat at the same time
                Thread.sleep(4000);
                System.out.println(name + " finished eating");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
