import java.util.Scanner;
public class character {
    public static void main(String args[]){
        char x = 'A';
        int y = 97;
        char z = (char)y;//explicit type casting
        System.out.println(z);
        char a = ' ';
        System.out.println((int)a);
        System.out.println(x + 0);//65 + 0
        System.out.println(x * 1);// 65 x 1
        System.out.println(x - 0);// 65 - 0
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        scan.close();
        System.out.println(name);
    }
}
