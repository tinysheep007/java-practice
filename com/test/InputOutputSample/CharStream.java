package InputOutputSample;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CharStream {
    public static void main(String[] args) {
        //we can use FileWriter to write also
        //writer.write("asd a sad");
        //we can also add append=true also to append

        //by using file reader, we would read one unit at a time instead of one char at a time
        try(FileReader reader = new FileReader("./com/test/data/chinese.txt")){
            System.out.println((char) reader.read());
            System.out.println((char) reader.read());
            System.out.println((char) reader.read());
            System.out.println((char) reader.read());
            System.out.println((char) reader.read());
            System.out.println((char) reader.read());
            System.out.println((char) reader.read());
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
