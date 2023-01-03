package abstractAndInterfaceSample;

//interface can extends other interface
//and you must impelement all methods in all interface
public interface Skill extends OtherSkill{
    //public static final are declared by default
    int a = 10;

    //all the static method must be public

    public void learn();
}
