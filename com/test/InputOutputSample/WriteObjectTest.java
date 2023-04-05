package InputOutputSample;

import java.util.*;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectTest {
    public static void main(String[] args) throws ClassNotFoundException {
        try(ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("./com/test/data/obj.txt"));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("./com/test/data/obj.txt"))){
            
            //block 1:
            // List<Integer> li = new ArrayList<>(Arrays.asList(1,2,3,4,5,123,1,-2));
            // stream.writeObject(li);
            // Object obj = in.readObject();
            // System.out.println(obj);
            
            Student jin = new Student("jin",20);
            stream.writeObject(jin);
            System.out.println(in.readObject());

        } catch (IOException e){
            throw new RuntimeException(e);
        }

        
    }

    //we must extend the interface of Serializable or else we cannot read it from the stream
    // we need to make sure our class are Serializable so stream can work with it
    static class Student implements Serializable{
        //use this to differentiate every verison or every copy
        //for exmaple, if we change the Student class here, such as adding new variables and change the ID
        //and we try to print out the object from the outstream that was saved beforehand, it would give error because
        //version ID not match
        private final static long serialVersionID = 1;

        String name;

        //for variables that we don't want to save it into the string
        //we can add transient property
        //even if we set it in the code above, we still got 0 when reading the object
        //because the actual pre-set age is not saved in the stream
        transient int age;

        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString(){
            return this.name+" "+this.age+" ";
        }
    }
}
