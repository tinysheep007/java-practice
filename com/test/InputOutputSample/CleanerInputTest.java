package InputOutputSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;

public class CleanerInputTest {
    public static void main(String[] args) {
        //in this syntactic sugar, we don't need to call FINALLY to close the stream
        //it would automatically close for us 
        //if we put our stream inside the parathenes after TRY

        // there is a autocloseable interface for this syntactic sugar
        try (FileInputStream stream = new FileInputStream("./com/test/data/text.txt")){
            //when trying other blocks to print out, make sure to
            //comment out other blocks becasue they are reading the files too

            //block 1:
            //stream.read() would return a int to represent the char
            // when reaching eof, it would return -1
            int i;
            while((i = stream.read()) != -1){
                System.out.print((char) i);
            }

            //block 2:
            byte[] bt = new byte[3];
            //if there is not enough byte left over, it would either return -1 or a array with less than the full size
            while(stream.read(bt) != -1){
                //new String(bt) can convert bt from byte into string
                System.out.println(new String(bt));
            }

            //block 3:
            //stream.available() returns back the left over size of the stuff that we
            //didn't read yet 
            byte[] btEnough = new byte[stream.available()];
            stream.read(btEnough);
            System.out.println(new String(btEnough));

            //block 4:
            //we can use stream.skip() to skip chars
            stream.skip(3);
            System.out.println((char)stream.read());
            //would print out l
            //because helLo 
            //L is the fourth letter after skipping the first 3
            
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
