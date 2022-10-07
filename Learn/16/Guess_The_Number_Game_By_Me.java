import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Game {
    Scanner sc = new Scanner(System.in);
    int number_of_guess = 0;

    public int take_user_input() {
        
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
   
        return num;
    }

    public int start() {
        ThreadLocalRandom rdm = ThreadLocalRandom.current();
        int Computer = rdm.nextInt(0, 100);
        return Computer;
    }

    public  void is_correct_input(int Computer, int num) {
        while (true) {

            if (num > Computer) {
                System.out.println("You Entered Large Number");
                number_of_guess += 1;
                

            } else if (num < Computer) {
                System.out.println("You Entered Small Number");
                number_of_guess += 1;
                

            } else {
                System.out.println("You Win!");
                number_of_guess += 1;
                System.out.println(number_of_guess);
                break;

            }
            num=take_user_input();
           
        }
    }
}

public class Guess_The_Number_Game_By_Me {

    public static void main(String[] args) {
        Game gaurav = new Game();
        int user_input = gaurav.take_user_input();
        int Computer = gaurav.start();
        gaurav.is_correct_input(Computer, user_input);
        System.out.println(Computer);

    }

}

