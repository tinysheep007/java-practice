package dataStructures;

public class Dstest {
    public static void main(String[] args){
        ArrList<Integer> arr = new ArrList<>();
        arr.add(2,0);
        // arr.add(1,1);
        // arr.add(10,3);
        // for(int i=0;i<20;i++){
        //     arr.add(i, i);
        // }
        arr.delete(0);
        arr.print();
    }
    

}
