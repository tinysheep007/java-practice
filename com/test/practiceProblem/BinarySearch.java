package practiceProblem;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {20,1,-123,29,123,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(bs(arr, 20, 0, arr.length-1));
    }

    public static int bs(int[] arr, int target, int lo, int hi){
        int mid = (lo + hi) / 2;
        //edge case
        if(lo > hi || hi >= arr.length){
            //System.out.println("lo > hi");
            return -1;
        }
        System.out.println(arr[mid]);
        if(arr[mid] == target){
            System.out.println("found");
            return mid;
        //if the current num is bigger check left
        }else if(arr[mid] > target){
            return bs(arr,target,lo, mid-1);
        //if current num is smaller check right
        }else if(arr[mid] < target){
            return bs(arr, target, mid+1, hi);
        }
        return -1;
    }

    public static int iterBS(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                //check left side
                //edit right
                right = mid - 1;
            }else if(arr[mid] < target){
                //check right side
                //edit left
                left = mid + 1; 
            }
        }
        return -1;
    }
}
