import java.util.*;
public class onetoN{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int count = scan.nextInt();
        int num = 1;
        scan.close();
        while(num <= count){
            System.out.print((num++) + " ");
        }
    }
}