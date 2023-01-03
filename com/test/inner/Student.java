package inner;

public class Student {
    int id;
    int age;
    String name;

    public Student(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void print(){
        System.out.println("Name: "+ name + ", age: " + Integer.toString(age) + ", id: "+ Integer.toString(id));
    }
}
