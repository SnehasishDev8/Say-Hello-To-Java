import java.util.*;
public class hollow {
    public static void holoractangle(int row, int column){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                if(i > 1 && i < row && j > 1 && j < column){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows and cloumns : ");
        int row = scan.nextInt();
        int column = scan.nextInt();
        holoractangle(row, column);
        scan.close();
    }
}
