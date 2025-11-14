import java.util.*;
public class typecost {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        scanner.close();
        // System.out.print((int)ch);// to get asscii value
        short s = 16;
        int x = 233;
        float fl = 22.355f;

        System.out.print(s + x  + ch + fl);//data type will be float because float is the largest data type among the given
    }
}
