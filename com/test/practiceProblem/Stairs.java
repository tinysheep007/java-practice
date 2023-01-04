package practiceProblem;

public class Stairs {
    public static void main(String[] args){
        //n = 4 get 5
        //n = 3 get 3 
        //n = 2 get 2
        //n = 1 get 1
        //we notice the pattern is that there is only
        //arr[i] = arr[i-1] + arr[i-2];
        //ways of going to step i. Since you can only go from
        //i-1 or i-2 steps
        System.out.println(jump(3));
    }

    public static int jump(int stairs){
        if(stairs  <= 1){
            return 1;
        }
        int[] arr = new int[stairs];
        arr[0]=1;
        arr[1]=2;
        for(int i=2;i<stairs;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[stairs-1];
    }

    public static int jumpRecur(int n){
        if(n <= 1){
            return 1;
        }
        
        return jumpRecur(n-1)+jumpRecur(n-2);
    }

}
