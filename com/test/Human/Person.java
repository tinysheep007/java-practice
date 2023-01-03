package Human;

public class Person {
    int age;
    String name;
    String gender;
    public Person(int age, String name, String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void print(){
        System.out.println("Perosn class");
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj instanceof Person){
            Person p = (Person) obj;
            return p.name == this.name && this.age == p.age && this.gender == p.gender;
        }

        return false;
    }
}
