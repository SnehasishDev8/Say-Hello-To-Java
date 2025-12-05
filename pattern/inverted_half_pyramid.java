import java.util.*;
public class inverted_half_pyramid {
    public static void invertedHalfPyramid(int row){
        for(int i = 1; i <= row; i++){
            int k = 1;
            for(int j = 1; j <= row - i + 1; j++){
                System.out.print(k++);
            }
            System.out.println();
        }
        return;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row = scan.nextInt();
        invertedHalfPyramid(row);
        scan.close();
    }
}
