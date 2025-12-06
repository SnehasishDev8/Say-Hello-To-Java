import java.util.*;
public class inputOutput{
    private static final Scanner scan = new Scanner(System.in);
    public static void input(int arr[]){
        System.out.print("Enter " + arr.length+" elements : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        return;
    }
    public static void output(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        return;
    }
    public static void update(int arr[]){
        System.out.print("\nEnter how mush you want to increase : ");
        int k = scan.nextInt();
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + k;
        }
    }
    public static void main(String args[]){
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        Boolean choice = true;
        while(choice){
            System.out.print("\nEnter 1 to take input\nEnter 2 for display\nEnter 3 to update\nEnter 4 to Exit : ");
            int ch = scan.nextInt();
            switch(ch){
                case 1 : input(arr);
                break;
                case 2 : output(arr);
                break;
                case 3 : update(arr);
                break;
                case 4 : choice = false;

            }
        }
        scan.close();
    }
}
