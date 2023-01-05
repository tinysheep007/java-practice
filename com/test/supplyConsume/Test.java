package supplyConsume;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.swing.text.Style;

public class Test {
    public static void main(String[] args) {
        // 1.Suppliers
        // the complex way
        Supplier<Student> s = new Supplier<Test.Student>() {
            @Override
            public Student get() {
                return new Student();
            }
        };

        s.get().hello();

        // the lamda way
        Supplier<Student> s2 = () -> new Student();
        s2.get().hello();

        // using method
        Supplier<Student> s3 = Student::new;
        s3.get().hello();

        // 2.Consumer
        Consumer<Student> sc = (student) -> System.out.println(student + " yum yum");
        Student bob = new Student();
        sc.accept(bob);
        // or we can set actions after accepting
        sc.andThen(stu -> System.out.println("goofy ahh")).andThen(skr -> System.out.println(" skrrr")).accept(bob);
        
        // 3.Function
        Function<Integer, String> test = Object::toString;
        String strFromTest = test.apply(25);
        System.out.println(strFromTest);
        //compose is the opposite of andThen
        //it happends before u actually apply it
        //so in this case ooochu will be converted to its length 6
        //and then 6 will be passed to actual function and return back
        //"6"
        String newStr = test.compose(String::length).apply("ooochu");
        System.out.println(newStr);
        
        String sikeStr = test.andThen((x)->x + " finish").apply(666);
        System.out.println(sikeStr);

        // 4.Predicate
        Predicate<Student> check = (stu) -> stu.age > 20;
        if(check.test(bob) == true){
            System.out.println("student is older than 20");
        }else{
            System.out.println("young new jeans");
        }

        Predicate<Integer> boo = (a) -> a==5;
        int choke = 6;
        if(boo.test(choke) == true){
            System.out.println("i choke");
        }else{
            System.out.println("i dont");
        }

    }

    public static class Student {
        int age = 30;
        public void hello() {
            System.out.println("I am student");
        }

    }
}
