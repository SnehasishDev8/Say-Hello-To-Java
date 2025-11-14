import java.util.*;
public class avg{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers  : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        float avg = (float)(a + b + c)/3;
        System.out.print("Average = ");
        System.out.print(avg);


    }
}
