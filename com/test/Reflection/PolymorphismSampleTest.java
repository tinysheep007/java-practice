package Reflection;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class PolymorphismSampleTest {
    public static void main(String[] args) {
        Object str = new String();
        System.out.println(str.getClass() == String.class);

        //as long as there is no error, it means
        //str is a subclass of Object
        System.out.println(str.getClass().asSubclass(Object.class));

        System.out.println(str instanceof String);

        Class<?> clz = String.class.getSuperclass();
        System.out.println(clz);

        Class<?> arClz = ArrayList.class.getSuperclass();
        System.out.println(arClz);

        Class<?> arClz2 = ArrayList.class.getSuperclass().getSuperclass();
        System.out.println(arClz2);

        Class<?>[] clzz = ArrayList.class.getInterfaces();
        for(Class<?> ar: clzz){
            System.out.println(ar);
        }

        //by getting info from reflection, we can only get the things written in the class doc
        //we can not get the implementation or interfaces used in the super class
        //we can only get the ones explicitly declared in the class we are looking for

        //we force to cast classes
        //but class must be matching 
        Number cast = Number.class.cast(new Integer(5));
        System.out.println(cast);

        Type t = ArrayList.class.getGenericSuperclass();
        System.out.println(t.getClass());


    }
 
}
