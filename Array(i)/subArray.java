import java.util.*;
public class subArray {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        int size = 5;
        int arr[] = {2, 4, 6, 8, 10};
        int totalSA = 0;
        for(int i = 0; i < size; i++){
            for(int j = i; j < size; j++){
                System.out.print(" [");
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k]+" ");
                }
                totalSA++;
                System.out.print("]");
            }
            System.out.println();
        }
        System.out.print("Total sub arrays = "+totalSA);
        scan.close();
    }
}
