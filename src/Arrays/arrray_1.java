package Arrays;

import java.util.Arrays;

public class arrray_1 {
    public static void main(String[] args) {

        String my_arr[] = {"Punjab","Haryana","Chennai","Nagercoil","Mumbai","Delhi"};


        //Sort order
        Arrays.sort(my_arr);
        for( String city : my_arr){
            System.out.println(city);

        }
        System.out.println("Length of Array: "+my_arr.length);

    }
}
