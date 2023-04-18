package thread;

public class ThreadTest {
    public static void main(String[] args) {
        // the inside should be new Runnable () {}
        // but we can use a lambda expression to shorten it 

        Thread thread = new Thread(() -> {
            System.out.println("Version A Start");
            int sum = 0;
            for(int i =0;i<=100;i++){
                sum = sum + i;
            }
            //we can get the current thread
            Thread tNow = Thread.currentThread();
            System.out.println(tNow.getName());
            System.out.println("Version A: sum is "+sum);
        },"first thread");

        thread.start();

        Thread t2 = new Thread(() -> {
            System.out.println("verison B start");
            int sum = 0;
            for(int i =0;i<=100;i++){
                sum = sum + i;
            }
            System.out.println("version B sum is "+sum);
        });

        t2.start();
        //Thread.start() means opening a new thread in the fundamental level
        //and run it in sych with other threads

        //however, Thread.run() means running the program in the same thread as the current thread
        //if we do t1.run() and then t2.run()
        //t1 will start and finish running. Then, t2 will start
        //they will not run in the same time   

        //after we do t1.start(), we have to wait til our CPU gives the
        //resources to t1 thread, or else we have to wait until CPU has space
        //to allocate to t1 and run it


    }
}
