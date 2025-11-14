import java.util.Scanner;
public class simpleInterest{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Amoutn : ");
        float amount = scan.nextFloat();
        System.out.print("Enter time in year : ");
        float time = scan.nextFloat();
        System.out.print("Enter interest rate : ");
        float rate = scan.nextFloat();
        scan.close();
        float ans = (amount * time * rate)/100;
        System.out.print("Answer = "+ans);

    }
}
