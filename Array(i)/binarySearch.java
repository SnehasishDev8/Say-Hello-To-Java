import java.util.*;
public class binarySearch {
    private static final Scanner scan = new Scanner(System.in);
    public static int search(int arr[], int key){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == key) return mid;
            else if(arr[mid] > key) end = mid - 1;
            else if(arr[mid] < key) start = mid + 1;
        }
        return -1;
    }
    public static void main(String args[]){
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter "+arr.length+" elements : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("Enter the target element : ");
        int key = scan.nextInt();
        int idx = search(arr, key);
        if(idx >= 0 && idx < size){
            System.out.print(key+" found in index "+idx);
        }else{
            System.out.print("Not found...");
        }
    }
}
