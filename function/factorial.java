import java.util.*;
public class factorial {
    public static int factor(int num){
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to calculate factonr : ");
        int n = scan.nextInt();
        int ans = factor(n);
        System.out.print("Facctorial of "+n+" = "+ans);
        scan.close();
    }
}
