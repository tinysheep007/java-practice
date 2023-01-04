package practiceProblem;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println("word entered : "+ str);
        System.out.println(palin(str));
        System.out.println(pa(str));
    } 

    public static boolean palin(String str){
        if(str == null){
            return false;
        }
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static boolean pa(String str){
        char[] a = str.toCharArray();
        int l = 0;
        int r = a.length-1;
        while(l < r){
            if(a[l] != a[r]){
                return false;
            }
            l++;
            r--;
        }
        return false;
    }
}
