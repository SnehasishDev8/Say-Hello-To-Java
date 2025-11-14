import java.util.*;
public class binaryTO{
    public static int decimalConversion(int binary){
        int result = 0;
        int count = 0;
        while(binary != 0){
            int lastDigit = binary % 10;
            if(lastDigit == 1){
                result += Math.pow(2, count);
            }
            binary /= 10;
            count++;
        }
        // System.out.print(count);
        return result;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int binary = scan.nextInt();
        int ans = decimalConversion(binary);
        System.out.print(binary +" = " +ans);
        scan.close();
    }
}
