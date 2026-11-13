package Arrays.Deletation;

import java.util.Scanner;

public class prg_1 {
    public static void main(String[] args) {
        //Given array
        int arr[] = {12,43,45,53,24,65};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to delete: ");
        int pos = sc.nextInt();//Target number to delete;
        for(int i = pos; i < arr.length-1;i++){
            arr[i] = arr[i+1];

        }
        //Traversing Array;
        for(int no : arr){
            System.out.print(no+" ");
        }
    }
    }

