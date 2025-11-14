import java.util.*;

public class BinomialCoefficient {
    public static double factor(double num){
        double f = 1;
        for(double i = 2; i <= num; i++){
            f *= i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        double n = scan.nextDouble();
        System.out.print("Enter r : ");
        double r = scan.nextDouble();

        double BC = factor(n) / (factor(r) * factor(n - r));
        System.out.print(BC);
        scan.close();
    }
}
