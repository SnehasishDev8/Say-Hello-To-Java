import java.util.*;
public class isEVEN {
    public static Boolean isEven(int num){
        if(num % 2 == 0) return true;
        else return false;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check odd or even : ");
        int num = scan.nextInt();
        Boolean status = isEven(num);
        if(status) System.out.print(num +" is a even number.");
        else System.out.print(num+" is odd.");
        scan.close();
    }
}
