package thread;

public class JoinTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("Thread A start");
            for(int i=0;i<50;i++){
                System.out.println("Threa A: "+i);
            }
            System.out.println("Thread A finsihed");
        });

        Thread t2 = new Thread(()->{
            System.out.println("Thread B start");
            for(int i=0;i<50;i++){
                System.out.println("Threa B: "+i);
                if(i % 25 ==0){
                    try{
                        //when we call t1.join()
                        //t1 thread will be exucted first
                        //after t1 is finished and then
                        //we continue the exucation of current thread

                        //join() does not acutally mean two thread are
                        //joining together
                        //the thread are still individually separated
                        System.out.println("t1 joined");
                        t1.join();
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                   
                }
            }
        });
        t1.start();
        t2.start();
    }
}
