import java.util.Scanner;

public class max {
    public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
        int a, b, c, max = 0;
        System.out.print("Enter three sides : ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        scan.close();
        if(a >= b){
            if(a > c) max = a;
            else max = c;
        }else if(b >= a){
            if(b > c) max = b;
            else max = c;
        }
        System.out.println(max);
    }
}
