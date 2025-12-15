import java.util.*;
public class maxSubArr {
    private static final Scanner scan = new Scanner(System.in);
    public static int[] maxSubArray(int arr[]){
        int max = Integer.MIN_VALUE;
        int subArr[] = new int[arr.length + 1];
        int max_start = -1, max_end = -1;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                }
                if(sum > max){
                    max = sum;
                    max_start = i; max_end = j;
                }
            }
        }
        for(int i = max_start; i <= max_end; i++){
            subArr[i] = arr[i];
        }
        subArr[arr.length] = max;
        return subArr;
    }
    public static void main(String args[]){
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the "+size+ " elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        int max[] = maxSubArray(arr);
        System.out.print("Maximum sum sub array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(max[i]+" ");
        }
        System.out.print("Sum of maximum sub array : "+max[arr.length]);

    }
}
