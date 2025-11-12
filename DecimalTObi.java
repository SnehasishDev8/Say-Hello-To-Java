import java.util.*;
public class DecimalTObi {
    public static int decimalTObinary(int decimal){
        int ans  = 0;
        int count = 0;
        while(decimal != 0){
            int rem = decimal % 2;
            if(rem == 1)
            ans += Math.pow(10, count);
            count++;
            decimal /= 2;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();
        int ans = decimalTObinary(decimal);
        System.out.print(ans);
        scan.close();
    }

}
