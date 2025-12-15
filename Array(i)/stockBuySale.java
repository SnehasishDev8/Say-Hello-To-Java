import java.util.*;
public class stockBuySale {
    private static final Scanner scan = new Scanner(System.in);

    public static void function(int[] stocks){
        int buy_price = stocks[0];
        int max_profid = 0;
        int final_buy_day = 0, final_sale_day = 0;
        for(int i = 1; i < stocks.length; i++){
            int current_price = stocks[i];
            if(buy_price < current_price){
                int profid = current_price - buy_price;
                if(profid > max_profid){
                    max_profid = profid;
                    final_sale_day = i;
                }
            }
            if(buy_price > current_price){
                buy_price = current_price;
                final_buy_day = i;
            }
        }
            System.out.print("Buy on day "+final_buy_day+" and sale on "+final_sale_day+" to get maximum profid of "+max_profid+" rs");
    }
    public static void main(String args[]){
        System.out.print("Enter the size of the array : ");
        int size = scan.nextInt();

        int stocks[] = new int[size];
        for(int i = 0; i < stocks.length; i++)
            stocks[i] = scan.nextInt();
        function(stocks);
        scan.close();
        return;
    }
}
