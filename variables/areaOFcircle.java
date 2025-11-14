import java.util.*;
public class areaOFcircle {
    public static void main(String args[]){
        float pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radious of the circle : ");
        int r = sc.nextInt();
        sc.close();
        float area = pi * r * r;
        System.out.print("Area = ");
        System.out.print(area);
    }
}
