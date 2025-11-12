import java.util.*;
public class reverse {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        scan.close();
        int ans = 0;
        for(int i = num; i != 0; i /= 10){
            int lD = i % 10;
            ans = ans * 10 + lD;
        }
        System.out.print(ans);

    }

}
