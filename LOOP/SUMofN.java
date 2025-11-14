import java.util.*;
public class SUMofN {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter nth number : ");
        int n = scan.nextInt();
        int count = 1;
        int sum = 0;
        scan.close();
        while(count <= n){
            sum += count++;
        }
        System.out.print("Sum of "+n +" = "+ sum);
    }
}
