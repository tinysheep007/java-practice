package innerClass;

public class In {
    int id;

    public In(){
        this.id = 0;
    }

    public In(int id){
        this.id = id;
    }

    public class SuperIn{
        int id;
        public void print(int id){
            this.id = id;
            System.out.println("my id: "+ this.id);
            System.out.println("outside id: "+In.this.id);
        }
    }
}
