package InputOutputSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputTest {
    public static void main(String[] args) {
        try(FileOutputStream stream = new FileOutputStream("./com/test/data/output.txt")){
            stream.write("apple".getBytes());

            //we force everything to be written inside
            //acts like a refresh
            //if we don't do it we might not see the change happends right after
            stream.flush();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
