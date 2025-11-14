import java.util.*;
public class profidLoss {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the cost of Item : ");
        float cost = scan.nextFloat();
        System.out.print("Enter the salling price of Item : ");
        float price = scan.nextFloat();
        float deff = price - cost;
        scan.close();
        if(cost < price) 
        System.out.print("profid = "+deff+"rs");
        else if(cost > price)
        System.out.print("LOSS! = " + (-deff)+"rs");
        else System.out.print("No profid no loss...");
    }
}
