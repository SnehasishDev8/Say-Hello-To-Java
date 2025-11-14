import java.util.*;
public class breakS {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number : ");
            int num = scan.nextInt();
            if(num % 10 == 0) {
                System.out.print(num + " is multiple of 10.");
                break;
            };
            // System.out.println(num);
        }
        scan.close();
    }
}
