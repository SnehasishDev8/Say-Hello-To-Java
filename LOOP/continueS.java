public class continueS {
    public static void main(String args[]){
        for(int i = 1; i < 3 ; i++){
            for(int j = 0; j < 3; j++){
                if(i == 2 && j == 0) {continue;}
                System.out.println(i+ "."+j);
            }
        }
    }
}
