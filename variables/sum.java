import java.util.*;
public class sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        sc.nextLine();
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();
    }
}
