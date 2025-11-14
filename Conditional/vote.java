import java.util.*;
public class vote {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int age = scan.nextInt();
        scan.close();
        if(age >= 18){
            System.out.print("Your age = "+age+" Adult\nYou can vote.");
        }else{
        System.out.print("Child\nYou can vote "+(18 - age) +" after years.");
        }
    }
}
