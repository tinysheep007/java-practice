package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ChangeObjectVariable {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, InvocationTargetException {
        Class<?> f = Food.class;
        Field fId = f.getField("name");
        //note that the varialbe have to be public
        System.out.println(fId.get(new Food(1,"fried chicken")));

        //get access to private variables
        Field fName = f.getDeclaredField("id");
        fName.setAccessible(true);
        System.out.println(fName.get(new Food(2,"slaty tofu")));


        Integer i = new Integer(10);
        Field val = Integer.class.getDeclaredField("value");
        val.setAccessible(true);
        val.set(i,25);
        //reflect can even change the final int 
        //ONLY IN CERTAIN JAVA VERSION not all
        System.out.println(i);

        //we can also get static variables or method
        //for exmaple
        Method e = Food.class.getDeclaredMethod("eat");
        //if it is static we don't need to pass any specific object
        //into the parameter of invoke(), but we still need to put
        //null
        e.invoke(null);
        Field s = Food.class.getDeclaredField("xxx");
        System.out.println(s.get(null));

    }

    static class Food {
        static String xxx = "xxx";
        private int id;
        public String name;
        Food(int id, String name){
            this.id=id;
            this.name=name;
        }
        void test(){
            System.out.println(id+" "+name);
        }
        static void eat(){
            System.out.println("eating");
        }
    }
}
