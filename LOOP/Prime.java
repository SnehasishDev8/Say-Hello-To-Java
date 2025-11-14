import java.util.*;
public class Prime {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        scan.close();
        while(number <= 100){
            boolean isPrime = true;
            if(number <= 0) isPrime = false;
            else{
                for(int i = 2; i < Math.sqrt(number); i++){
                    if(number % i == 0) {
                        isPrime = false;
                        break;
                    }

                }
            }

            if (isPrime) System.out.println(number + " is prime.");
            // else System.out.println(number + " is not prime.");
            number++;
        }
        
    }
}
