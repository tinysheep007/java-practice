package thread;

import java.io.ObjectStreamException;

public class WaitAndNotifyExample {
    public static void main(String[] args) throws InterruptedException {
        //create lock
        Object lock = new Object();

        //lock.notify() must be called within synchronized()
        //because it has to be used while a lock is present
        Thread t1 = new Thread(()->{
            synchronized (lock){
                try {
                    System.out.println("t1 thread begin to wait");
                    lock.wait();
                    //wait til t2 finnish precess and release the lock
                    //then we print it out
                    //we DO NOT print it after lock.notify() is called
                    System.out.println("back to t1 thread");
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (lock){
                System.out.println("t2 started");
                // notify means we can awoke the previous thread 
                // under the same lock, however, we still hold the lock and
                // not release it until we finish process the entire thread
                // which is t2
                lock.notify();
                System.out.println("t2 finished precessing");
                
            }
        });

        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}
