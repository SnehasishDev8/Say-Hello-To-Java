import java.util.*;
public class nprimes {
   public static Boolean isPrime(int num){
    if(num <= 1) return false;
    else if(num == 2) return true;
    else if(num % 2 == 0) return false;
    else{
        for(int i = 3; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
    }
    return true;
   }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = scan.nextInt();
        scan.close();
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
