package collectionsSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>(Arrays.asList("aaa","Abssad","Cats","orange"));
        //sometimes the sequence of our operation is not the same as our input code
        //don't assume they were working line by line
        li = li.stream()
            //content inside filter is for the content that stayed in list after filter
            .filter(str -> str.length() > 3)
            .filter(str -> str.charAt(0) >= 'A' && str.charAt(0) <= 'Z')
            .distinct()
            .collect(Collectors.toList());

            System.out.println(li);
        
        List<Integer> liLen = li.stream().map(str->str.length()).collect(Collectors.toList());
        System.out.println(liLen);

        Random random = new Random();
        random.ints(-100,100).limit(10).forEach(System.out::println);
    }
}
