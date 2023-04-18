package thread;

public class WithoutSynchronization {
    static int value = 0;
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(()->{
            for(int i =0;i<10000;i++){
                value++;
            }
            System.out.println("t1 done");
        });

        Thread t2 = new Thread(()->{
            for(int i =0;i<10000;i++){
                value++;
            }
            System.out.println("t2 done");
        });

        t1.start();
        t2.start();
        Thread.sleep(1000);
        //without sychonization of the value of value, since two thread are working at the same time
        //they might overwrite each other's result.
        
        //Another exmaple is when t1 and t2 grab the value of value at the same time
        //both thread has the same starting value
        //after increasing the value
        //both thread will try to write the result back without considering that 
        //the value might already been increased by the other thread
        //hence resulting in the wrong result
        System.out.println("i: "+ value);

    }
}
