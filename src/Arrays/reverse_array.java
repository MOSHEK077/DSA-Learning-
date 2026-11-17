package Arrays;

public class reverse_array {
    public static void main(String[] args) {


        int arr[] = {13,43,41,45,65,14};
        reverse(arr);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }

    private static void reverse(int[] arr) {
        int left = 0 ;
        int right = arr.length - 1;
        while(left<right){
            //Swap
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
