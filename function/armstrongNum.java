import java.util.*;
public class armstrongNum {
    public static boolean armstrong(int num){
        boolean flag = false;
        int original = num;
        int copy = num;
        int power = 0; 
        int sum = 0;
        while(num != 0){
            power++;
            num /= 10;
        }
        while(original != 0){
            int lastDigit = original % 10;
            sum += Math.pow(lastDigit, power);
            original /= 10;
        }
        if(copy == sum){
            flag = true;
        }

        return flag;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scan.nextInt();
        scan.close();
        for(int i = 1; i <= number; i++){
            if(armstrong(i)){
                System.out.print(i+"\t");
            }
        }
        // if(armstrong(number)){
        //     System.out.print(number + " is armstrong");
        // }else{
        //     System.out.print(number + " is not armstrong");
        // }

    }
}
