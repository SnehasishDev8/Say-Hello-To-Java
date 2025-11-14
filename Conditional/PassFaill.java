import java.util.*;
public class PassFaill {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
    System.out.print("Enter marks : ");
    int marks = scan.nextInt();
    scan.close();
    
    String status = (marks >= 33) ? "Pass!" : "Faill better luck next time.";
    System.out.println(status);
    }
}
