package Arrays;

import java.util.Scanner;

public class SearchingElements {
    public static void main(String[] args) {
        int data[] = {14,42,55,42,55,442,134};
        boolean found = false;
        System.out.print("Enter the target element: " );
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        //Linear Searching using Traversal.
        for(int i = 0 ; i < data.length;i++){
            if(data[i]==target){
                found = true;
            }
        }
        if(found){
            System.out.println("Element found! "+target);
        }
        else{
            System.out.println("Element not found!");
        }
    }
}
