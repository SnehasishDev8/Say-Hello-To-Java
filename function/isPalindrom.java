import java.util.*;
public class isPalindrom {
    public static Boolean isPalin(int num){
        int copy = num, reverse = 0;
        while(copy != 0){
            int lastD = copy % 10;
            reverse = reverse * 10 + lastD;
            copy /= 10;
        }
        if(reverse == num) return true;
        else return false;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check palindrom or not : ");
        int num = scan.nextInt();
        scan.close();
        if(isPalin(num)){
            System.out.print(num+" is palindrom.");
        }else{
            System.out.print("NOt palindrom.");
        }
    }
}
