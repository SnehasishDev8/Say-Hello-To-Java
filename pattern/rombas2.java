//     *****
//    *   *
//   *   *
//  *   *
// *****
import java.util.*;
public class rombas2 {
    public static void func(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= (row + (row - i)); j++){
                if((i  == 1) || (i == row)){
                    if(j > row - i) System.out.print("*");
                    else System.out.print(" ");
                }
                else if((j == row - i + 1) || (j == (row + row - i))) System.out.print("*");
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


