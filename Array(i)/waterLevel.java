import java.util.*;
public class waterLevel {
    private static final Scanner scan = new Scanner(System.in);
    public static int total_trapping_rain_water(int[] arr){
        if(arr.length <= 2) return 0;
        int total = 0;
        for(int i = 0; i < arr.length; i++){
        int left_max = Integer.MIN_VALUE;
        int right_max = Integer.MIN_VALUE;
            for(int j = i; j >= 0; j--){
                if(arr[j] > left_max) left_max = arr[j];
            }
            for(int j = i; j < arr.length; j++){
                if(arr[j] > right_max) right_max = arr[j];
            }
            int traped_water = Math.max(Math.min(left_max, right_max) - arr[i], 0);

            total += traped_water;
        }
        return total;
    }

    public static void main(String args[]){
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter "+size+" elements in the array : ");

        for(int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        int total = total_trapping_rain_water(arr);
        System.out.print("Total traped rain water : "+total);
    }
}
