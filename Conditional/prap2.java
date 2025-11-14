import java.util.*;
public class prap2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter tempereture : ");
        float temp = scan.nextFloat();
        scan.close();
        boolean status = true;
        if(temp >100){
            status = false;
        }
        if (status){System.out.print("NO FEVER...");}
        else{System.out.print("FOUND FEVER...");}
    }
}
