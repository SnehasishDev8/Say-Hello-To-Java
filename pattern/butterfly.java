
public class butterfly {
    public static void main(String args[]){
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                if(j <= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int k = 1; k <= 4; k++){
                if(k < 4 - i + 1) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                if(j <= 4 - i) System.out.print("*");
                else System.out.print(" ");
            }
            for(int k = 1; k <= 4; k++){
                if(k > i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
