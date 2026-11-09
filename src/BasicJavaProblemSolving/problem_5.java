package BasicJavaProblemSolving;


//Write programs to calculate a sum, maximum, and minimum.
public class problem_5 {
    public static void main(String[] args) {
        //Maximum
        int[] n = {23,44,23};
        //System.out.println(java.util.Arrays.toString(n));(method 1)
//        for(int i = 0 ; i < n.length; i++){ method 2
//            System.out.println(n[i]+" ");
//        }
        for(int j:n){
            System.out.println(j+ " "); //Method 3, for each
        }
    }
}
