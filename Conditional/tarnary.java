public class tarnary {
    public static void main(String args[]){
        int a = 8, b = 8,c = 4, max, n = 6;
        max = (a >= b) ?( (a >= c) ? a : c ): (b >= c) ? b : c;

        System.out.println(max);
        System.out.println((n % 2 == 0) ? "Even" : "Odd");
    }
}
