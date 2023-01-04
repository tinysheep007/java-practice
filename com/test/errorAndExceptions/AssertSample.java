package errorAndExceptions;

public class AssertSample {
    public static void main(String[] args){
        //in order to use assert, we must enabled it in JVM
        int a = 20;
        assert a > 200 : "a is not 200";
    }
}
