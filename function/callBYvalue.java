import java.util.*;
public class callBYvalue{
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.print("In function\na = "+a+"\nb = "+b);
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = scan.nextInt();
        System.out.print("Enter b = ");
        int b = scan.nextInt();
        scan.close();
        swap(a, b);
        System.out.print("\nIn main function\na = "+a+"\nb = "+b);
    }
}