import java.util.*;
public class maxSubAArr {
    private static final Scanner scan = new Scanner(System.in);

    public static int kadans_lagorithm(int arr[]){
        int sum = 0, max = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            sum = Math.max(sum , 0);
            max = Math.max(sum, max);
        }
        return max;
    }

    public static int prefixx(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                sum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static void main(String args[]){
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements in the array : ");
        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        int max = prefixx(arr);
        int max2 = kadans_lagorithm(arr);
        System.out.print(max2+" "+ max);
    }
}
