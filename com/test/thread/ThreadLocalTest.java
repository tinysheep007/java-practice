package thread;

public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal<String> local = new ThreadLocal<>();
        local.set("goodbye");
        System.out.println(local.get());

        new Thread(()->{
            System.out.println("inside thread, try to get main's local");
            System.out.println("first test: "+local.get());
            // System.out.println("it's null?");
        }).start();

        ThreadLocal local2  = new InheritableThreadLocal<>();
        local2.set("new local can be inhereted to child threads");

        new Thread(()->{
            //once we get inside of the thread, we can change its value
            //of the inhereted local to any value we want and use it
            //however, the changed value won't be passed back to parents
            //the inital passed in value is still the same as the outside
            //parent use the local2
            System.out.println("inside new thread");
            System.out.println("first get inside thread: "+local2.get());
            local2.set("outside to main");
            System.out.println("second get inside thread: "+local2.get());
            
        }).start();
        
        System.out.println("main's get: "+local2.get());
    }
}
