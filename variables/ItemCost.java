import java.util.*;
public class ItemCost{
    public static void main(String args[]){
        float pencil, pen, eraser;
        Scanner scanner = new Scanner(System.in);
        pencil = scanner.nextFloat();
        pen = scanner.nextFloat();
        eraser = scanner.nextFloat();
        scanner.close();

        float total = pencil + pen + eraser;
        total = (total +(total * 18 /100));
        System.out.print("Total cost with gst = ");
        System.out.print(total);

    }
}
