import java.util.*;
public class tax{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount : ");
        int amount = scan.nextInt();
        scan.close();
        float tax;
        if(amount >= 1000000){
            tax = (amount * 0.3f);
        }else if(amount >= 500000){
            tax = (amount * 0.2f);
        }else{
            tax = 0;
        }

        System.out.print("Your amount "+amount + " so tax for this year = "+tax);
    }

}