import java.util.*;
public class practice2 {
    private static final Scanner scan = new Scanner(System.in);

    public static int func(int arr[], int start, int end, int target){
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) start = mid + 1;
            else if(arr[mid] > target) end = mid - 1;
        }
        return -1;

    }

    public static int search(int arr[], int target){
        int minIdx = find_minIdx(arr);
        int x = -1;
        if(arr[minIdx] <= target && arr[minIdx] <= arr[arr.length - 1]){
            x =  func(arr, minIdx, arr.length - 1, target);
        }else if(arr[minIdx] >= target && target >= arr[0]){
            x =  func(arr, 0, minIdx, target);
        }
        return x;
    }

    public static int find_minIdx(int[] arr){
        int min = arr[0], idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                idx = i;
            }
        }
        return idx;
    }
    public static void main(String args[]){
    System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter "+size+" elements in the array : ");

        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter the target : ");
        int target = scan.nextInt();
        int result = search(arr, target);
        if(result > 0 && result < arr.length)
        System.out.print(result);
        else
        System.out.print("Not found...");
    }
}
