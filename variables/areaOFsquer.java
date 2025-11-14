import java.util.*;
public class areaOFsquer {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the valuse of the side of Square : ");
        float side = scanner.nextFloat();
        scanner.close();
        float Area = side * side;
        System.out.print(Area);
    }
}
