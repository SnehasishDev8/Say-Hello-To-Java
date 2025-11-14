import java.util.*;
public class triangle {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter three sides : ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        scan.close();
        if(((a + b) > c) && ((b + c) > a) && ((a + c) > b)){
            System.out.print("Triangle");
        }else{
            System.out.print("Not Triangle");
        }
    }
}
