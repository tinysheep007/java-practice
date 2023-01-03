package Human;

public class Hobo extends Person {
    String location;
    public Hobo(int age, String name, String gender, String location){
        super(age, name, gender);
        this.location = location;
    }

    public void prints(){
        System.out.println("I live in "+location);
    }
}
