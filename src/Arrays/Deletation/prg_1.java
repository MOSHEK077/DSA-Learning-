package Arrays.Deletation;

import java.util.Scanner;

public class prg_1 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to delete: ");
        int pos = sc.nextInt();
        int size = arr.length;
        //Shifting elements to left;
        for (int i = pos; i < size -1; i++) {
            arr[i] = arr[i + 1];

        }
        size--;
        for(int i = 0 ; i < size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

