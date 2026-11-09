package BasicJavaProblemSolving;
//Print the first 10 natural numbers using a while loop.
public class problem_1 {//Actual declaration
    public static void main(String args[]){
        int n = 1; //Declare variable of n
        while(n<=20){ //install while loop, and keep with condition.s
            System.out.println(n);//Print the output;
            n++;//add increment operator for increase the value that mentioned in condition.(it avoids infinity)
        }
    }
}