package infiniteInputParam;

public class infinite {
    public static void main(String[] args){
        //you can pass in nothing
        run();
        //or any amount of int
        run(2,4,5);
    }

    static void run(int... n){
        if(n.length == 0){
            System.out.println("no valid input");
            return;
        }
        System.out.println("start");
        for(int num : n){
            System.out.println(num);
        }
        System.out.println("end");
    }
}
