import java.util.*;
public class max3 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of A : ");
        int A = scan.nextInt();
        System.out.print("Enter value of B : ");
        int B = scan.nextInt();
        System.out.print("Enter value of C : ");
        int C = scan.nextInt();
        scan.close();
        if(A >= B && A >= C){
            System.out.print("Maxx = A = "+ A);
        }else if(B >= C){
            System.out.print("Maxx = B = "+ B);
        }else{
            System.out.print("Maxx = C = "+ C);
        }

        
    }

}
