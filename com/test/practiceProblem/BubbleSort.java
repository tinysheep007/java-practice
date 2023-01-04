package practiceProblem;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] a = {20,1,-123,29,123,2};
        System.out.println(Arrays.toString(a));
        int [] ans = bubble(a);
        System.out.println(Arrays.toString(ans));
    } 

    public static int[] bubble(int[] arr){
        int flag = 0;
        for(int i=0;i<arr.length -1 ;i++){
            flag = 0;
            //we -i here because we already sorted the last i element
            for(int j=0;j<arr.length-i -1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
        return arr;
    }
}
