package enumSample;

public class EnumTest {
    public static void main(String[] args){
        System.out.println(Status.RUNNING);
        Status s1 = Status.SELLING;
        System.out.println(s1);

        MoreSpecs s2 = MoreSpecs.BEST;
        s2.getName();
    }   
    
    
}
