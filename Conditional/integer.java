import java.util.*;
public class integer {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        // int a = scan.nextInt();
        // if(a < 0) a = -a;
        // System.out.print(a);
        float b = scan.nextFloat();
        scan.close();
        int temp = (int)b;
        if(temp == b)
        System.out.print("Integer");
        else System.out.print("NOT..");

    }
}
