package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreateClassTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        //we can create class through relfection
        Class<Wow> wClz = Wow.class;
        Wow w = wClz.newInstance();
        //class is created through reflection of class
        System.out.println(w);
        w.wow();
        //notice our class don't have a construtor that requires to pass in any value
        //so we can use its default constructor
        
        //if we have to pass in parameter in constructor
        //we need to get constructor and pass in the correspondning class
        //and then create with new parameters
        Class<withParam> with = withParam.class;
        //note we have to pass in the primitive type's class
        Constructor<withParam> constrcutor = with.getConstructor(String.class,int.class);
        withParam bob =  constrcutor.newInstance("Bob", 10);
        bob.test();

        //if the class constructor is private
        Class<Privatec> p = Privatec.class;
        //note we have to pass in the primitive type's class
        //we use getDeclaredConstructor
        Constructor<Privatec> pConstrcutor = p.getDeclaredConstructor(String.class,int.class);
        //we made the private constructor accessible
        pConstrcutor.setAccessible(true);
        Privatec alan =  pConstrcutor.newInstance("alan", 20);
        alan.test();

        Class<Wow> wClzMethod = Wow.class;
        //if there is parameter we have to pass in 
        //we have to pass in the primitive class as following parameter of .getMethod()
        Method test = wClzMethod.getMethod("wow");
        //we have to pass in a object in the first parameter
        //we have to pass in the parameter needed for the method in the second parameter
        //unless it don't ask for any, then leave it to nothing
        test.invoke(w);
        Method privateTest = wClzMethod.getDeclaredMethod("privateWow");
        privateTest.setAccessible(true);
        privateTest.invoke(w);

        //sometimes we don't even need the class in the same folder
        //becasue you can use Class.forName("package path")

         

    
    }

    static class Wow {
        //the constrcutor CANNOT be private unless we bypass it
        public Wow( ){
            System.out.println("created");
        }
        public void wow(){
            System.out.println("wowing ...");
        }
        private void privateWow(){
            System.out.println("wow's private method");
        }
    }

    static class withParam{
        String name;
        int id;
        public withParam(String name, int id){
            this.name = name;
            this.id = id;
        }

        void test(){
            System.out.println(name + " " +id);
        }
    }

    static class Privatec{
        String name;
        int id;
        private Privatec(String name, int id){
            this.name = name;
            this.id = id;
            System.out.println("created through private constrcutor");
        }

        void test(){
            System.out.println(name + " " +id);
        }
    }
}
