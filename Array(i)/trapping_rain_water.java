import java.util.*;
public class trapping_rain_water {
    private static final Scanner scan = new Scanner(System.in);

    public static int total_trapping_rain_water(int[] arr){
        if(arr.length <= 2) return 0;
        int total = 0;
        int maxBound_left[] = new int[arr.length];
        maxBound_left[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            maxBound_left[i] = Math.max(arr[i], maxBound_left[i - 1]);
        }
        int maxBound_right[] = new int[arr.length];
        maxBound_right[arr.length - 1] = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            maxBound_right[i] = Math.max(arr[i], maxBound_right[i + 1]);
        }

        for(int i = 0; i < arr.length; i++){
            total += Math.max((Math.min(maxBound_left[i], maxBound_right[i]) - arr[i]), 0);
        }
        return total;
    }
    
    public static void main(String args[]){
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter the elements : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }

        int ans = total_trapping_rain_water(arr);
        System.out.print("Total water = "+ans);
    }
}
