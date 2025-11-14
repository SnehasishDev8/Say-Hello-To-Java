import java.util.*;
public class prap4 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year  : ");
        int year = scan.nextInt();
        scan.close();
        if(year % 4 == 0 && ((year % 100 != 0) || (year % 100 == 0 && year % 400 == 0))) System.out.print("Leap year");
        else System.out.print("Not");
    }
}
