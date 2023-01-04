package errorAndExceptions;

public class exceptionSample {
    public static void main(String[] args){
        //if we do not handle the exception, the program will stop
        //test(1,0);

        //but if we handle it it can conintue
        try{
            Object obj = null;
            obj.toString();
        }catch(NullPointerException e){
            e.printStackTrace();
        }
        //we can have multiple cacthes
        catch(ArrayIndexOutOfBoundsException | ArrayStoreException e){
            System.out.println("some other error");
        }
        //finally block after try catch always excucte
        finally{
            System.out.println("this is finally");
        }
        System.out.println("after error");
    }
    
    private static int test(int a, int b){
        if(b == 0){
            throw new ArithmeticException("can't be 0 in the bottom");
        }
        return a / b;
    }

    //if we have a exception other than running-time error
    //it means if it is a compiling error, we must throw it
    //on top of the method signature
    //or use try catch within
    private static int test2(int a, int b) throws Exception{
        if(b == 0){
            throw new Exception("bottom cannot be 0");
        }
        return a / b;
    }
}
