import Human.Hobo;
import Human.Person;
import abstractAndInterfaceSample.Animal;
import abstractAndInterfaceSample.Dog;
import inner.Student;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{
        //testing regular class and heritence 
        System.out.println("hello world");
        Student s1 = new Student(1,18,"Peter");
        s1.print();

        //if we do father type p1 = sub type
        //we can only use the father type functionality
        //we cannot use the child type functions anymore
        Person p1 = new Hobo(10, "bobo", "girl", "next to BHS");
        p1.print();

        Person p2 = new Hobo(10, "bobo", "girl", "next to BHS");
        // p1 and p1 are not the same unless i specially make them
        Person p3 = p1;
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3 ));
        //unless you make a overriden equals function class in that class
    
        //testing abstract class
        Dog dog = new Dog("goofy", "bruh", "blue");
        System.out.println(dog.noise());
        dog.learn();
        //the clone has all the same property but not exactly the same object (address)
        //if we do .equals(), it will still return false
        Dog dog2 =  (Dog) dog.clone();
        dog2.hello();
    }
}
