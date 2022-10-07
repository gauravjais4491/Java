import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Game {
    Scanner sc = new Scanner(System.in);

    int number_of_guesses;
    int random_number;
    static int number_of_game=0;

    public int take_user_input() {
       
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.nextLine();
        return num;
    }

    public void start() {
        int user_input;
        do {
            user_input = take_user_input();

        } while (!is_correct_input(user_input));

    }

    public Game() {
        number_of_guesses = 0;
        ThreadLocalRandom rdm = ThreadLocalRandom.current();
        random_number = rdm.nextInt(0, 10);
        number_of_game++;
        System.out.println("You are playing game number "+number_of_game);
    }

    public boolean is_correct_input(int user_input) {

        if (user_input > random_number) {
            System.out.println("You Entered Large Number");
            number_of_guesses += 1;
            return false;
        } else if (user_input < random_number) {
            System.out.println("You Entered Small Number");
            number_of_guesses += 1;
            return false;
        } else {
            System.out.println("You Win!");
            number_of_guesses += 1; 
            System.out.println("number of guesses are " +number_of_guesses);
            return true;

        }

    }
    

}

public class Guess_the_number_game {

    public static void main(String[] args) {
        Game g1 = new Game();
        g1.start();
        Game g2 = new Game();
        g2.start();
        Game g3 = new Game();
        g3.start();
    }

}
