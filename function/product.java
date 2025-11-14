import java.util.*;
public class product {
    public static int prod(int num1, int num2){
        int result = num1 * num2;
        return result;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = scan.nextInt();
        System.out.print("Enter b : ");
        int b = scan.nextInt();
        int ans = prod(a, b);
        System.out.print("Product of "+a +" & "+b + " = "+ans);
        scan.close();
    }
}
