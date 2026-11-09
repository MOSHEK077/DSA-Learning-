package BasicJavaProblemSolving;

public class problem_6 {
    public static void main(String[] args) {
        int arr[] = {177,3,42,13,424,523,556,252,564};
        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]<min) min = arr[i];
            if(arr[i]>max) max = arr[i];
        }
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
    }
}
