import java.util.*;

public class isPrimee {
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
        System.out.print("Enter a number to check prime or not : ");
        int num = scan.nextInt();
        if(isPrime(num)){
            System.out.print(num +" is a prime number.");
        }else{
            System.out.print(num +" is not a prime number.");
        }
        scan.close();
    }
}
