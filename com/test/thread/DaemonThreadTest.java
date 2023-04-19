package thread;

public class DaemonThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            try {
                while(true){
                    Thread.sleep(1000);
                    System.out.println("new thread processing ...");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        //we have to set DAEMON status before it starts running
        //we cannot change its status when its already running
        t1.setDaemon(true);
        t1.start();
        Thread.sleep(5000);
        //when main program/thread ended, our new thread endded too 
        //unlike ThreadRunAfterMainDone.java
        
    }
}
