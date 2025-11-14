import java.util.*;
public class even{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = scan.nextInt();
        scan.close();
        if(a % 2 == 0) 
        System.out.println("Even..");
        else System.out.print("ODD...");
    }
}