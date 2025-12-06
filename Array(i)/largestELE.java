import java.util.*;
public class largestELE {
    private static final Scanner scan = new Scanner(System.in); 
    public static int[] findLargest(int arr[], int ans[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        ans[0] = max; ans[1] = min;
        return ans;
        
    }
    public static void input(int arr[]){
        System.out.print("Enter "+arr.length+" elements : ");

        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        return;
    }
    public static void main(String args[]){
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        int ans[] = new int[2];
        input(arr);
        ans = findLargest(arr, ans);
        System.out.print("Maximum element = "+ans[0]+" and minimum element = "+ans[1]);
    }
}
