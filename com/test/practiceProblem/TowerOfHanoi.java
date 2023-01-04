package practiceProblem;

public class TowerOfHanoi {
    public static void main(String[] args){
        solve('a','b','c',3);
    }

    public static void move(char from, char to, int target){
        System.out.println("moved "+ target + "th plate" +"from "+from+" to "+to);
    }

    public static void solve(char a, char b, char c, int n){
        //only 1 plate left 
        if(n==1){
            move(a,c,1);
        }
        else {
            // move all n-1 plate to b
            solve(a, c, b, n-1);
            //move last plate from a to c
            move(a, c, n);
            //move all n-1 plate from b to c
            solve(b, a, c, n-1);
        }
    }
}
