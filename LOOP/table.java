import java.util.*;
public class table {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number to print table : ");
            int n = scan.nextInt();
            scan.close();
            for(int i = 1; i <=  10; i++){
                System.out.println(i + " x " + n + " = "+ i * n);
            } 
    }
}
