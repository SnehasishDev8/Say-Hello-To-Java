import java.util.*;
public class switc {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter commant : ");
        int commant = scan.nextInt();
        scan.close();
        switch(commant){
            case 1 : System.out.print("Samosa");
            break;
            case 2 : System.out.print("Burger");
            break;
            case 3 : System.out.print("Mango Shake");
            break;
            default : System.out.print("Wrong Input");
        }
    }
}
