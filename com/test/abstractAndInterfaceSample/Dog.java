package abstractAndInterfaceSample;

public class Dog extends Animal implements Skill, Cloneable{
    String color;
    public Dog(String name, String sound, String color) {
        super(name, sound);
        this.color = color;
    }

    @Override
    public String noise() {
        return "woof woof";
    }

    @Override
    public void learn() {
        System.out.println("dog cannot learn");
    }

    //we must change protected to public or else we cannot use it in other package
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void hello() {
        System.out.println("hello world!");
    }

    
    
}
