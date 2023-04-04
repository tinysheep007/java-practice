package InputOutputSample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class CopyFile {
    public static void main(String[] args) {
        //find the file we want to copy
        try(FileInputStream stream = new FileInputStream("./com/test/data/toCopy.txt")){
            //make the file that we wanna copy 
            FileOutputStream out = new FileOutputStream("./com/test/data/copied.txt");
            
            //block 1:
            //super slow way of coping because we are copying byte by byte
            int i;
            while((i = stream.read())!= -1){
                out.write(i);
            }

            //block 2:
            byte[] bt = new byte[1024];
            int len;
            //len would record how much we have copied so we don't go over size
            while((len = stream.read(bt))!= -1){
                out.write(bt, 0, len);
            }

            System.out.println("copy finishied");
        } catch (IOException e){
            System.out.println("copy failed");
            throw new RuntimeException(e);
        }
    }
}
