import java.util.*;
public class sumOFdigits {
    public static void sumOFdigit(int num){
        int result = 0;
        while(num != 0){
            result += num % 10;
            num /= 10;
        }
        System.out.print("Sum of digits = "+result);
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        scan.close();
        sumOFdigit(num);
    }
}