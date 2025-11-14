import java.util.*;
public class sumOfOddEven {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        scan.close();
        int sumOfOdd = 0;
        int sumOfEven = 0;
        for(int i = 1; i <= num; i++){
            if(i % 2 == 0) sumOfEven += i;
            else sumOfOdd += i;
        }
        System.out.println("Sum of even numbers = "+sumOfEven);
        System.out.println("Sum of odd numbers = "+sumOfOdd);
    }
}
