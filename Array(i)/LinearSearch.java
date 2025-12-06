/*Linear search is defined as the searching algoritham where the list or data set is traversed sequentially from one end to find the desired value.*/
import java.util.*;
public class LinearSearch {
    private static final Scanner scan = new Scanner(System.in);
    public static int searchFunc(int arr[], int ele){
        int idx = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ele){
                idx = i;
                break;
            }
        }
        return idx;
    }

    public static void main(String args[]){
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();
        int array[] = new int[size];
        System.out.print("Enter "+array.length+" elements : ");
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }

        System.out.print("Taken array : ");
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");

        System.out.print("Enter the searching element : ");
        int ele = scan.nextInt();

        int idx = searchFunc(array, ele);
        if(idx >= 0 && idx < size){
            System.out.print(ele+" is found in index "+idx);
        }else{
            System.out.print(ele+"is not exist in the taken array.");
        }

        scan.close();
    }
}
