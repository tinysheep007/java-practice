package enumSample;

//we can set names into our ENUM vars
//we can get it through .getName() which we wrote under
public enum MoreSpecs {
    BAD("really bad"), GOOD(" decent good"), BEST("best of the best");

    private final String name;

    private MoreSpecs(String name){
        this.name = name;
    }

    public void getName(){
        System.out.println(name);
    }
}
