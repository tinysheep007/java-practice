package generics;

public class Pokemon<T> {
    int id;
    String name;
    T var;
    public Pokemon(int id, String name, T var){
        this.id = id;
        this.name = name;
        this.var = var;
    }

    public T getVar(){
        return var;
    }
}
