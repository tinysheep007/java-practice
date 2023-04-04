package collectionsSample;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectCompareTest {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();
        Flight f1 = new Flight("NY");
        Flight f2 = new Flight("NY");
        flights.add(f1);
        //after insertion there is f1
        System.out.println(flights);
        flights.remove(f2);
        //but after removing f2 when f2 is not even in the list
        //f1 still got removed because our comparasion method
        // of equals() returned TRUE if we compare f1 and f2 so 
        // the system would treat them like the same thing
        System.out.println(flights);

        Map<Flight, Integer> map = new HashMap<>();
        map.put(f1,1);
        // map.put(f2, 2);
        System.out.println(map.get(f2));
        //it will return null here because
        // the hashmap would use both the hashcode AND the overriden equals()
        //to compare the key. 
        //Since only our equals() return true, but their hashcode is different
        //the map would consider f1 and f2 different key

        //everytime when we rewrite equals() method for a class
        //plz return the hashcode funtion to compare as well
        //or else hashmap and set would not work as intended
    }

    static class Flight {
        String name;

        public Flight(String name){
            this.name = name;
        }

        @Override
        public boolean equals(Object obj){
            return this.name.equals(((Flight) obj).name);
        }

        //if we override public int hashCode(), then hashmap or hashset would treat f1 and f2 the same
        // @Override
        // public int hashCode(){
        //     //as long as we have same this.name, we would be treated as same object
        //     return Objects.hash(this.name);
        // }
    }
}