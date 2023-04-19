package thread;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        System.out.println("main started");

        //the second parameter for timer.schedule is how much
        //time we wait until we start our task
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("after delay");
                
            }
        }, 2000);
        Thread.sleep(3000);
        //remeber to close the timer thread or else it will keep ruinning
        timer.cancel();

        // repeating task
        Timer timer2 = new Timer();
        System.out.println("exmaple for repeating task: ");
        timer2.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("repeat every 1 second");
                
            }
        }, 1000,1000);
        
        Thread.sleep(5000);
        timer2.cancel();
    }
}
