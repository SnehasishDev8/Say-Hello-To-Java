import java.util.*;
public class input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number);
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        System.out.println(name);
        scn.close();
        sc.close();
    }
}
