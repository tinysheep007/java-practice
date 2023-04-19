package Reflection;

public class ClazzTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> c1 = Student.class;
        Class<?> c2 = new Student().getClass();
        Class<?> c3 = Class.forName("Reflection.Student");
        // it is true because they are the same singular object stored in the memory
        System.out.println(c1 == c2);
        System.out.println(c3 == c2);
        System.out.println(c1.getMethods());
        
        Class<Integer> i = int.class;
        //returns true
        System.out.println(Integer.TYPE == i);

        //note primitive type's actual class is different
        //returns false
        System.out.println(Integer.class == i);
    }
}
