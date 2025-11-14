import java.util.*;
public class nTable{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to print its table\n");
        int n = scan.nextInt();
        scan.close();
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = "+ n*i);
        }
    }
}
