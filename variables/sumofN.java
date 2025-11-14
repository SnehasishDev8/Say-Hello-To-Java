import java.util.*;
public class sumofN {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n , sum = 0;
        System.out.print("Enter a number : ");
        n = scanner.nextInt();
        scanner.close();
        for(int i = 1; i <= n ; i++){
            sum += i;
        }
        System.out.print("Sum of "+n+" numbers is "+sum);
    }
}
