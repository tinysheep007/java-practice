package thread;

public class DeadLockExample {
    public static void main(String[] args) {
        //create 2 lock
        Object l1 = new Object();
        Object l2 = new Object();

        Thread t1 = new Thread(()->{
            System.out.println("t1 start acrequied lock 2");
            synchronized(l2){
                System.out.println("t1 waiting for lock 1");
                synchronized (l1) {
                    System.out.println("t1 complete");
                }
            }
        });

        Thread t2 = new Thread(()->{
            System.out.println("t2 start acrequied lock 1");
            synchronized(l1){
                System.out.println("t2 waiting for lock 2");
                synchronized (l2) {
                    System.out.println("t2 complete");
                }
            }
        });
        

        t1.start();
        t2.start();
        //notice that at first 
        //t1 gets l2
        //t2 gets l1
        //t1 waits for l1 and then t1 will release l2
        //t2 waits for l2 and then t2 will release l1
        //no thread will release the lock until they get the lock they want
        // they forever stucked there cuasing dead lock

        //Thread.suspend() means pacusing the thread, however, the lock is NOT
        //released. This is why it might cause dead lock and we don't
        //suggest to use suspend()
    }
}
