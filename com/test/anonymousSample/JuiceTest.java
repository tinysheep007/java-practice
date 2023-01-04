package anonymousSample;

public class JuiceTest {
    public static void main(String[] args){
        //instiate without a real class
        //we can just make a class without a proper class
        //even though Juice is abstract
        Juice j = new Juice() {
            @Override
            public void taste(){
                System.out.println("yum yum");
            }
        };

        j.taste();

        BetterJuice bj = new BetterJuice() {
            @Override
            public void newTaste() {
                System.out.println("super yum yum");
            }
            
        };

        bj.newTaste();
    }
}
