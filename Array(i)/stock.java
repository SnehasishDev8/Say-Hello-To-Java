import java.util.*;
public class stock {
    private static final Scanner scan = new Scanner(System.in);

    public static void function(int[] stocks){
        int buy_price = stocks[0];
        int max_profid = 0;
        int buyDay = 0, saleDay = 0;
        for(int i = 1; i < stocks.length;  i++){
            int profid = stocks[i] - buy_price;
            System.out.print(profid + " ");
            // max_profid = Math.max(max_profid, profid);
            if(max_profid < profid){
                max_profid = profid;
                saleDay = i;
            }
            // min_price = Math.min(min_price, stocks[i]);
            if(buy_price > stocks[i]){
                buy_price = stocks[i];
                buyDay = i;
            }
        }
        System.out.println();
        System.out.print("Buy on day "+(buyDay+1)+" and sale on "+(saleDay+1)+" to get maximum profid of "+max_profid+" rs");
        return;
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
