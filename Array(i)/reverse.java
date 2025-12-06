import java.util.*;
public class reverse{
    private static final Scanner scan = new Scanner(System.in);
        public static void display(int arr[]){
            for(int i = 0; i < arr.length; i++)
                System.out.print(arr[i]+" ");
        }
        public static int[] reverseArr(int arr[]){
            for(int i = 0; i < arr.length/2; i++){
                int temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }
            return arr;
        }
        public static void main(String args[]){
            System.out.print("Enter the size of the array : ");
            int size = scan.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter "+size+" elements in the array : ");
            for(int i = 0; i < size; i++){
                arr[i] = scan.nextInt();
            }
            display(arr);
            arr = reverseArr(arr);
            System.out.print("After reverse : ");
            display(arr);
            scan.close();
        }
}
