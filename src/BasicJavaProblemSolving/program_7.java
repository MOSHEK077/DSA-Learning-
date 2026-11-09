package BasicJavaProblemSolving;

import javax.crypto.spec.PSource;

public class program_7 {

    public static void main(String[] args) {
        //Swapping Values
        int n = 10, m = 15;
        //before swap
        System.out.println("Numbers before swap: "+"m = "+m+", n = "+ n);
        int temp = m ;
        m = n;
        n = temp;
        System.out.println("Numbers after swapping: "+"m = "+m+", n = "+ n);
    }
}
