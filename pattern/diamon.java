//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *
import java.util.*;
public class diamon {
    public static void func(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= row - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = row; i >= 1; i--){
            for(int j = 1; j <= row - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        func(row);
        scan.close();
    }
}
