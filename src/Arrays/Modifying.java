package Arrays;

public class Modifying {
    public static void main(String[] args) {
        int data[] = {100,200,300,400,500,600};
        System.out.println("Array without modification");
        for (int i = 0 ; i < data.length; i++){

            System.out.print(data[i]+" ");
        }
        //Modifying Elements by Traversal Array.
        for(int i = 0 ; i < data.length ; i++){
            data[i] += 50;
        }
        System.out.println();
        System.out.println("Modified Arrays !");
        for(int i = 0 ; i < data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
