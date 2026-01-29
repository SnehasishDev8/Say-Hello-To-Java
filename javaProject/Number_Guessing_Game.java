import java.util.*;
public class Number_Guessing_Game{
    private static final Scanner scan = new Scanner(System.in);
    public static int count = 1;
    public static void main(String args[]){
        game();
    }
    public static void game(){
        while(count <= 5){
            System.out.print("Enter the number of guesses you want (maximum 10): ");
            int guesses = scan.nextInt();
            if(guesses < 1 || guesses > 10){
                System.out.print("Please enter valied number : ");
            }
            else{
                number_gessing_game(guesses);
                return;
            }
        }

    }
    public static void number_gessing_game(int guesses){
        int number = 1 + (int)(100 * Math.random());
        boolean pass = false;
        System.out.println("Enter a number between 1 to 100 : ");
        System.out.println("You have "+guesses +" attempts to win the game : ");
        while(!pass){
            ArrayList<Integer> history = new ArrayList<>();

            for(int i = 0; i < guesses; i++){

                System.out.println("Enter your guess : ");
                int num = scan.nextInt();
                
                if(num == number){
                    System.out.println(" Congratulations! You guessed the correct number.");
                    restart_game();
                    return;
                }else{
                    if(num < number){
                    System.out.println("The number is grater then "+ num);
                    }else if(num > number){
                    System.out.println("The number is less then "+num);
                    }
                    history.add(num);
                }
            
            }
            System.out.println("You loss all "+guesses+" the attempts.");
            System.out.println("The number was : "+number);
            System.out.println("Your attempts are : ");
            for(int ele : history) System.out.print(ele + " ");
            System.out.println();

            restart_game();
            return;
        }
    }
    public static void restart_game(){
        count++;
        if(count > 5){
            System.out.print("You can only play for 5 times continously...\nNow queek exit requered\nThanks");
            return;
        }
        System.out.println("If you want to continue enter 1 otherwise 0 to exit : ");
        int choice = scan.nextInt();
        if(choice == 1){
            game();
        }else{
            return;
        }
    }
}