import java.util.*;
public class verbDtype{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a numbere : ");
        int a = scan.nextInt();
        scan.close();
        for(int i = 1; i <= a; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
