import java.util.*;
public class reverse2 {
    private static final Scanner scan = new Scanner(System.in);
    public static void reverseArray(int arr[]){
        int start = 0, end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
        return;
    }
    public static void display(int arr[]){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        return;
    }
    public static void main(String args[]){
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter "+size+" elements in the array : ");

        for(int i = 0; i < size; i++)
            arr[i] = scan.nextInt();

        display(arr);
        reverseArray(arr);
        System.out.println();
        display(arr);
    }
}
