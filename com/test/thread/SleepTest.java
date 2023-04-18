package thread;

import java.util.*;

public class SleepTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        Thread.sleep(1000);
        System.out.println("in progress.");
        Thread.sleep(1000);
        System.out.println("...");
        Thread.sleep(1000);
        System.out.println("finish");

    }
}
