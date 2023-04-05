package InputOutputSample;

import java.util.Scanner;

public class PrintStreamTest {
    public static void main(String[] args) {
        //stick to the right
        //there's lots of format for printf
        System.out.printf("%4d\n",250);
        System.out.printf("%4d\n",22);
        System.out.printf("%4d\n",0);

        Scanner s = new Scanner(System.in);
        System.out.println(s.nextLine());
    }
}
