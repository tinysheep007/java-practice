package abstractAndInterfaceSample;

public abstract class Animal {
   
    String sound;
    String name;

    public Animal(String name, String sound){
        this.name = name;
        this.sound = sound;
    }

    public abstract String noise();

}
