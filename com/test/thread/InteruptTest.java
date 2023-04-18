package thread;

public class InteruptTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            //firts mark print
            while(true){
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("I am marked interupted once");
                    break;
                }
            }
            //go back to the uninterrupted state
            //or else it both while loop will be triggered
            Thread.interrupted();
            //second mark print
            while(true){
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("I am marked interupted second");
                    break;
                }
            }

            System.out.println("system ending NOW");
        });

        t1.start();

        try {
            Thread.sleep(3000);
            t1.interrupt();
            Thread.sleep(3000);
            t1.interrupt();
            System.out.println("entire program end");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        //t1.stop() will immeidatly stop the program whereas
        //t1.interupt will simply mark the program as interupted
        //we can use Thread.currentThread.isInterrupted()
    }
}
