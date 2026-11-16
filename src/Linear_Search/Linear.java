package Linear_Search;

import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        //Get input find element from list of array.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int search = sc.nextInt();
        int array[] = {14,55,42,54,78,44,51,93};

        int index = linearSearch(array,search);
        if(index != -1){
            System.out.println("Element found at "+index);
        }
        else {
            System.out.println("Element not found !");
        }
        }

    private static int linearSearch(int[] array, int search) {

        for(int i = 0 ; i < array.length; i++){
            if(array[i] == search){
                return i;
            }
        }
        return -1;
    }
}
