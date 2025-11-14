import java.util.*;
public class avg {
    public static float averageOF(float num1, float num2, float num3){
        float  avg = (num1 + num2 + num3)/3;
        return avg;
    }
    public static float averageOF(int num1, int num2, int num3){
        float avg = (float)(num1 + num2 + num3)/3;
        return avg;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        float avg = averageOF(num1, num2, num3);
        // float avg = averageOF(5.7f, 3.2f, 9.11f);

        System.out.print("Average of "+num1+" "+num2+" "+num3+" = "+avg);
        scan.close();

    }
}
