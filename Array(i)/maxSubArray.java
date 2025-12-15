import java.util.*;
public class maxSubArray {
    private static final Scanner scan = new Scanner(System.in);
    public static int prefixSum(int arr[]){
        int prefix[] = new int[arr.length];
        int sum = 0, max = Integer.MIN_VALUE;
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                sum = (i == 0)? prefix[j] : prefix[j] - prefix[i - 1];
                if(sum > max) max = sum;
            }
        }
        return max;
    }
    public static int maxSubArrSum(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                }
                if(max < sum) max = sum;
            }
        }
        return max;
    }

    public static void main(String args[]){
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter the elements : ");

        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }

        int ans = maxSubArrSum(arr);
        int ans2 = prefixSum(arr);
        System.out.print(ans+" "+ ans2);
    }
}
