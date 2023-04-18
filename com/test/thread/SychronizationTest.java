package thread;

public class SychronizationTest {
    private static int value = 0;

    static synchronized void addVal(){
        value++;
    }
    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();

        // Thread t = new Thread(()->{
        //     for(int i=0;i<10;i++){
        //         synchronized(o){
        //             value++;
        //         }
        //     }
        //     System.out.println("done");
        // });
        
        //start of group 1
        new Thread(()->{
            for(int i=0;i<10000;i++){
                //must pass in the same object 
                //like VIP card, we have to use the same card
                //to represent the same lock
                synchronized (o){
                    value++;
                }
            }
            System.out.println("t1 done");
        }).start();

        new Thread(()->{
            for(int i=0;i<10000;i++){
                synchronized (o){
                    value++;
                }
            }

            System.out.println("t2 done");
        }).start();
        //we put sleep here so that we can make sure both thread finish computing
        Thread.sleep(1000);
        //we synchornized the value which means it will has a lock if 
        //1 thread is operating on it, then the lock would be released
        //and it can be used by another thread and lock and operate and release
        //this will always repeat until everything is done
        //other thread must wait til the lock is released
        System.out.println("i: "+value);
        //end of group 1

        //return back to 0
        value = 0;
        System.out.println("value back to 0");

        //group 2 
        new Thread(()->{
            for(int i=0;i<10000;i++){
                synchronized (o){
                    addVal();
                }
            }
            System.out.println("t1 done");
        }).start();

        new Thread(()->{
            for(int i=0;i<10000;i++){
                synchronized (o){
                    addVal();
                }
            }
            System.out.println("t2 done");
        }).start();

        new Thread(()->{
            for(int i=0;i<10000;i++){
                //this is the same lock as our addVal() method
                //because our addVal()'s lock is binded to the current SychronizationTest class
                synchronized (SychronizationTest.class){
                    addVal();
                }
            }
            System.out.println("t3 done");
        }).start();
        Thread.sleep(1000);
        System.out.println("i from second group: "+value);
        //end of group 2 

        //return to 0
        value = 0;
        System.out.println("value back to 0");
        
        //group 3
        //for this group
        //we lock will be on the acutal processing part
        //so that one thread must finish process everything
        //and then the next thread can process its own
        new Thread(()->{
            System.out.println("t1 start");
            synchronized (o){
                for(int i =0 ;i<5;i++){
                    System.out.println("t1 is processing ...");
                }
            }
            System.out.println("t1 procedure done");
        }).start();

        new Thread(()->{
            System.out.println("t2 start");
            synchronized (o){
                for(int i =0 ;i<5;i++){
                    System.out.println("t2 is processing ...");
                }
            }
            System.out.println("t2 procedure done");
        }).start();

    }
}
