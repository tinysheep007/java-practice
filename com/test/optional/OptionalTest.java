package optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args){
        check(null);
        check("not null");
    }

    public static void check(String str){
        String result;
        result = Optional.ofNullable(str).orElse("empty string");
        if(result.equals("empty string")){
            System.out.println(result);
        }else{
            int ok = Optional.ofNullable(str).map(String::length).get();
            System.out.println(result + ", length : "+ok);
        }
        
    }
    
}
