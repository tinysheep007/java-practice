package thread;

public class ThreadRunAfterMainDone {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        //we noticed that even if main thread has finished,
        //our main program won't end until our new thread has finished
        //now we need DAEMON thread which means it automatically ends
        // when all other threads has finished
        new Thread(()->{
            try {
                System.out.println(main.getState());
                Thread.sleep(1000);
                while(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
