package generics;

import java.util.Arrays;
import java.util.Comparator;

public class Ptest {
    public static void main(String[] args){
        //must declare the type of generic when making it
        Pokemon<String> ditto = new Pokemon<String>(1, "ditto", "transform");
        System.out.println(ditto.getVar());

        //or we can leave it blank for the system to describe the type
        Pokemon<?> dog = new Pokemon<>(1, "doggo", 300);
        System.out.println(dog.getVar());

        A<String> str = new A<String>("bozo");
        System.out.println(str.drink());

        String st = same("same");

        Integer[] temp = {0,123,2,12,98,133,-7};
        Arrays.sort(temp, (o1,o2)->o2-o1);

        int[] t1 = {3,0,1};
        Arrays.sort(t1);
        
        //you can set upper bound for the generic types
        //extends Numbers means any class that it's Number's subclass
        //or Number class its self
        A<? extends Number> a = new A<>(2.5);
        System.out.println(a.drink());
        A<? extends Number> b = new A<>(50);
        System.out.println(b.drink());
        //in this case it can be double or int
        //because Integer and Double are within Number class
        //However, if we used upper bound, we will have trouble
        //using setter, since the program can;t determine which 
        //type of gerenric will be used. In lower bound, below, 
        //we can use setter fine
        
        //we can also set lower bound
        //we can only use Object itself or any superclass
        A<? super Object> c = new A<Object>((Object) 5);
        System.out.println(c.drink());
    }

    //class with interface with genrics
    public static class A<T> implements Cup<T>{
        T s;
        public A(T s){
            this.s = s;
        }
        @Override
        public T drink() {
            return s;
        }
    }

    //method with generaic types
    public static <T> T same(T s){
        return s;
    }
}
