import java.util.*;
public class basics{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integer number to calculate binary operation : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        System.out.println("Sum of "+a+", "+ b +" = " + (a + b));
        System.out.println("Subtraction of "+a+", "+ b +" = " + (a - b));
        System.out.println("Multiplaction of "+a+", "+ b +" = " + (a * b));
        System.out.println("Division of "+a+", "+ b +" = " + (a / b));
    }
}
