import java.util.*;
public class input{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int num = scan.nextInt();
        int marks[] = new int[num];
        System.out.print("Enter the marks of "+num+" students : ");
        for(int i = 0; i < num; i++){
            marks[i] = scan.nextInt();
        }

        for(int i = 0; i < num; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.print("\nLength = "+marks.length);
        scan.close();
    }
}