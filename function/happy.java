import java.util.*;

public class happy {
        public static void ishappy(int num){
            if(num == 1) System.out.print("Happy Number..");
            else{
                squerSum(num);
            }
        }
        public static void squerSum(int num){
            int sum = 0;
            int copy = num;
            while(num != 0){
                int lastD = num % 10;
                sum += Math.pow(lastD, 2);
                num /= 10;
            }
            if(copy == sum){
                System.out.print("Not a happy number...");
                return;
            }else ishappy(sum);
        }

        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number to check : ");
            int number = scan.nextInt();
            squerSum(number);
            scan.close();
        }
}
