package collectionsSample;
import java.util.*;
import java.util.Arrays;


public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>(Arrays.asList(0,5,-10,205));
        System.out.println(Collections.min(li));
        Collections.sort(li);
        System.out.println(li);
        Collections.fill(li, 2);
        System.out.println(li);
    }
}
