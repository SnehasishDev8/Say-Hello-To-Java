import java.util.*;
public class rambas {
    public static void func(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= (row + (row - i)); j++){
                if(j > row - i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numbers of rows : ");
        int row = scan.nextInt();
        func(row);
        scan.close();
    }
}
