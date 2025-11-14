import java.util.*;
public class calculator {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        boolean ok = true;
        while(ok){
            System.out.println("Enter two numbers and operator (like : num1 operator num2): ");
            float num1 = scan.nextFloat();
            char ch = scan.next().charAt(0);
            float num2 = scan.nextFloat();
            float result = 0f;
            switch(ch){
                case '+' : result = num1 + num2;
                break;
                case '-' : result = num1 - num2;
                break;
                case '*' : result = num1 * num2;
                break;
                case '/' : result = num1 / num2;
                break;
                case '%' : result = num1 % num2;
                break;
                default : System.out.println("Wrong Input...");
                ok = false;
            }
            if(ok)System.out.print("= "+result);
            System.out.print("\nEnter 1 to continue or 0 for exit : ");
            scan.nextLine();
            String choise = scan.nextLine();
            if(choise == "0") break;
            else continue;
            
        }
        scan.close();
    }
}
