import java.util.*;
public class pairs {
    private static final Scanner scan = new Scanner(System.in);
    public static void printPairs(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                System.out.println( "("+arr[i]+","+arr[j]+")");
            }
        }
    }
    public static void main(String args[]){
            System.out.print("Enter the size of the array : ");
            int size = scan.nextInt();
            int arr[] = new int[size];
            System.out.print("Enter "+size+" elements in the array : ");
            for(int i = 0; i < size; i++){
                arr[i] = scan.nextInt();
            }
            printPairs(arr);
            scan.close();
    }
}
