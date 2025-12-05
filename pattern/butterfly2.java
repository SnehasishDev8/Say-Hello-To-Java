import java.util.*;
public class butterfly2 {
    public static void fun(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++){
                if(j <= i) System.out.print("*");
                else System.out.print(" ");
            }
            for(int k = 1; k <= row; k++){
                if(k <= row - i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row; j++){
                if(j <= row - i) System.out.print("*");
                else System.out.print(" ");;
            }
            for(int k = 1; k <= row; k++){
                if(k > i) System.out.print("*");
                else System.out.print(" ");
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
