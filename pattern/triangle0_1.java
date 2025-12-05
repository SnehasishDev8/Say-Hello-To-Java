import java.util.*;
public class triangle0_1 {
    public static void func(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                if(i % 2 == 0){
                    if(j % 2 == 0) System.out.print(1);
                    else System.out.print(0);
                }else{
                    if(j % 2 == 0) System.out.print(0);
                    else System.out.print(1);
                }
            }
            System.out.println();
        }

    }
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row = scan.nextInt();
        func(row);
        scan.close();
    }
}
