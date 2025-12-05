import java.util.*;
public class floyd_triangle {
    public static void fun(int row){
        int k = 1;
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row = scan.nextInt();
        fun(row);
        scan.close();
    }
}
