package InputOutputSample;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BetterCopy {
    public static void main(String[] args) {
        File f = new File( "./com/test/data/append.txt");
        try(FileInputStream read = new FileInputStream("./com/test/data/append.txt");
            FileOutputStream write = new FileOutputStream("./com/test/data/appendCopy.txt")){
            byte[] bt = new byte[5];
            int len;
            long total = f.length();
            int sum = 0;
            while((len = read.read(bt)) != -1){
                write.write(bt, 0, len);
                sum += len;
                System.out.println("process: "+ (sum * 100 / total)  + "%");
            }
           
            
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
