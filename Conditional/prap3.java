import java.util.*;
public class prap3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        boolean ok = true;
        while(ok){
            System.out.print("\nEnter a number (1-7) or 0 to exit: ");
            int num = scan.nextInt();
            if(num == 0) break;
            String day;
            switch(num){
                case 1 : day = "Monday";
                break;
                case 2 : day = "Tuesday";
                break;
                case 3 : day = "Wednesday";
                break;
                case 4 : day = "Thersday";
                break;
                case 5 : day = "Friday";
                break;
                case 6 : day = "Saturday";
                break;
                case 7 : day = "Sunday";
                break;
                default : day = "INVALIED";
                
            }
            System.out.print(day);

        }
         scan.close();
        
    }
}
