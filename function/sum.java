import java.util.*;
public class sum {
    public static int sumOF(int x, int y){
        int result = x + y;
        return result;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int sum = sumOF(a, b);
        System.out.print("Sum of "+a+" + "+b+" = "+sum);
    }
}
