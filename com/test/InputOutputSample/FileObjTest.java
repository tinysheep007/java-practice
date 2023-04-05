package InputOutputSample;

import java.io.*;

public class FileObjTest {
    public static void main(String[] args) throws IOException {
        File f = new File("./com/test/data/created.txt");
        //return true if creat sucess and false if did not create
        System.out.println(f.createNewFile());

        File fo = new File("./com/test/data/newFolder");
        System.out.println(fo.mkdir());

        File co = new File("./com/test/data/copied.txt");
        System.out.println(co.length());

        File sp = new File("./");
        System.out.println(sp.getAbsolutePath());

        for(String s : sp.list()){
            System.out.println(s);
        }
    }
}
