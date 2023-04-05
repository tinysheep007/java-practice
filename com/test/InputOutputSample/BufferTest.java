package InputOutputSample;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferTest {
    public static void main(String[] args) {
        try(BufferedInputStream read = new BufferedInputStream(new FileInputStream("./com/test/data/append.txt"))){
           //functianolity is basicaly the same as fileinputstream
           //but it just has a buf[] in its source code to save the buffer
           //its implementation has fill() which is to get more content if buffer is getting read and we need more
           read.mark(0);
           System.out.println((char) read.read());
           System.out.println((char) read.read());
           System.out.println((char) read.read());

           read.reset();
           System.out.println("go back");
           System.out.println((char) read.read());
           System.out.println((char) read.read());
           System.out.println((char) read.read());
        
           
            
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
