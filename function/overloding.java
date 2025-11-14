public class overloding {
    public static int sum(int a, int b, int c){
        return a + b+ c;
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static float sum(float a, float b, float c){
        return a + b+ c;
    }
    public static void main(String args[]){
        int sum1 = sum(1, 2);
        int sum2 = sum(1, 2, 3);
        float sum3 = sum(2.3f, 4.5f, 6f);
        System.out.print("sum1 = "+sum1+"\nsum2 = "+sum2+"\nsum3 = "+sum3);
    }
}
