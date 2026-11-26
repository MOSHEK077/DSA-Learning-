package Arrays;

public class check_sorted {
    static boolean isSorted(int[] arr) {
        int n = arr.length;//Gets length of array into n
        for(int i = 1 ; i < n ; i++) //iteration through for_loop
            if(arr[i-1]>arr[i])// index 0 > 1 , 1 > 2 , 2 > 3, 4 > 5
                return false;
            return true;
    }


    public static void main(String[] args) {
        int arr[] = {12,31,34,53,54};//array initialize
        int n = arr.length; //Length of given
        if(isSorted(arr)){ //print conditions.then we created static method with argumentss.
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

}
