import java.util.*;
public class prap1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number  :");
        float num = scan.nextFloat();
        scan.close();
        if(num < 0){
            System.out.print("Input was "+ num +", is a negative value...");
        }else{
            System.out.print("Input was "+ num +", is a positive value...");
        }
    }
}