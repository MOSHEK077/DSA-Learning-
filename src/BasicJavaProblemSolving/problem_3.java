package BasicJavaProblemSolving;


//Calculate the sum of all numbers from 1 to a given number N.
public class problem_3 {
    public static void main(String[] args) {
        int given_number = 10;
        int sum = 0;
        for(int i = 1; i <= given_number; i++){
            sum+= i;

        }System.out.print(sum+" ");
    }
}
