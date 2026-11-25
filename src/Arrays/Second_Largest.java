package Arrays;

//Find the second_largest array in an given Array.
public class Second_Largest {
    static int getSecondLargest(int[] arr){
        int n = arr.length;
        int largest = -1, secondLargest = -1;//nothing found
        for(int i = 0 ; i< n;i++){
            if(arr[i]> largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i]  > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    public static void main(String[] args) {
        int arr[] = {13,33,43,14,45,12};
        System.out.println(getSecondLargest(arr));

    }
}
