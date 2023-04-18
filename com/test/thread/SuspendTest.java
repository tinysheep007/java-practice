package thread;

public class SuspendTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("Thread start");
            Thread.currentThread().suspend();
            System.out.println("Thread continue ...");
        });

        t1.start();

        try {
            Thread.sleep(3000);
            t1.resume();
            // System.out.println("entire program end");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
