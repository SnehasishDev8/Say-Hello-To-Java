import java.util.*;
public class fourD {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = scan.nextInt();
        scan.close();
        if((x / 1000) >= 1 && (x / 1000) <= 9) System.out.print("4 digit number...");
        else System.out.print("Not");
    }
}
