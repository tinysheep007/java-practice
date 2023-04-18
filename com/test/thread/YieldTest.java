package thread;

public class YieldTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread A start");
            for(int i =0;i<50;i++){
                if(i % 5 == 0){
                    System.out.println("yield .. ");
                    //gives out space and allocation for other thread
                    //lower its own piority
                    Thread.yield();
                }
                System.out.println("A print: "+i);
            }
            System.out.println("Thread A complete");
        });

        Thread t2  = new Thread(()->{
            System.out.println("Thread B start");
            for(int i = 0;i<50;i++){
                System.out.println("Thread B: "+i);
            }
        });
        //thread t2 will finish first because t2 got more yieled reaousces
        //from t1
        t1.start();
        t2.start();
    }
}
