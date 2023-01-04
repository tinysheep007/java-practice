package lamdaSample;

public class DriveTest {
    public static void main(String[] args){
        //you can use lamda to shorten it
        Drive go = ()-> System.out.println("I am braking");
        go.brake();

        //we must use an actual object before the ::
        DriveTest main = new DriveTest();
        Drive re = main::hello;
        re.brake();

        //we can use other functions in lamda
        Num n = Integer::sum;
        System.out.println(n.sum(20,4));

        //we can use outside variable in the lamda here
        //but we can not change the var even once
        int apple = 5;
        AppleTree app = () -> System.out.println("I grabbed "+apple+ " apple/s");
        app.grab();
    }

    public String hello(){
        System.out.println("i shall cry now");
        return "i shall cry now";
    }
}
