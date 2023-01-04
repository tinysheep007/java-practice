package innerClass;

public class inTest {
    public static void main(String[] args){
        In a = new In(10);
        //werid syntax to make inner class
        In.SuperIn s = a.new SuperIn();
        //inside class can access outside var
        //but outside class cannot access inside var
        s.print(1000);
    }
   
    
}
