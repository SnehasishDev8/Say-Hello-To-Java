import java.util.*;
public class factorOfN {
    public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int num = scan.nextInt();
            scan.close();
            int factorial = 1;
            for(int i = 2; i <= num; i++){
                factorial *= i;
            }
            System.out.print("Factorial of "+ num + " is "+ factorial);
    }
}
