package annotation;

import java.lang.reflect.Method;

public class TestAno {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {

        Class<TestAno> mainC = TestAno.class;
        Method o = mainC.getMethod("ok");
        Good anotate =  o.getAnnotation(Good.class);
        //since we are retriving the value of annotation at run time
        //the Good anotation's retation has to be at RUNTIME also
        System.out.println(anotate.value());
       
    }

    @Good(value ="test")
    public static void ok(){
        System.out.println("ok");
    }
}
