package InputOutputSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextFileTest {
    public static void main(String[] args) {
        //open both file
        try(FileReader reader = new FileReader("./com/test/data/chinese.txt");
            FileWriter writer = new FileWriter("./com/test/data/chineseCopy.txt")){
            char[] chars = new char[5];
            int len;
            while((len = reader.read(chars))!= -1){
                writer.write(chars, 0, len);
            } 
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
