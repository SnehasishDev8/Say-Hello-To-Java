// import java.util.*;
// public class basic{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter the value of radious : ");
//         float pi = 3.14f, radious = scan.nextFloat();
//         scan.close();
//         float area = pi * radious * radious;
//         System.out.print("Area of Circle = "+area);
//     }
// }
// import java.util.Scanner;
// public class basic{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter a number  : ");
//         float num = scan.nextFloat();
//         scan.close();
//         System.out.println("Square of "+num+" is : "+num*num);
//     }
// }
import java.util.Scanner;
public class basic{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        int sum = a +b +c;
        System.out.print("Sum of "+a+", "+b+", "+c+" = " + sum);
    }
}
