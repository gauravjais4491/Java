import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Rock_Paper_Scissor_Game
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ThreadLocalRandom rdm = ThreadLocalRandom.current();
        int i = 1;
        int won_by_Gaurav = 0, won_by_Computer = 0, Number_of_Game_Ties = 0;
        while (i <= 5)
        {

            System.out.println("\nAre you Ready to Play this Game " + i + "st Times");
            System.out.println("\nEnter which one you want to take \n 1 for Paper \n 2 for Scissor\n 3 for Rock");

            int Gaurav = sc.nextInt();
            int Computer = rdm.nextInt(1, 3);

            System.out.println("\nThe Number choosed by Gaurav is: " + Gaurav);
            System.out.println("The Number choosed by Computer is: "+Computer);

            if (Gaurav == 2 && Computer==1 ||Gaurav==3 && Computer==2 || Gaurav==1 && Computer==3 )
            {
                System.out.println("\nHurry! Gaurav Won");
                won_by_Gaurav = won_by_Gaurav + 1;
            }
            else if(Gaurav==Computer)
            {
                System.out.println("Oops, Match Ties!");
                Number_of_Game_Ties=Number_of_Game_Ties+1;
            }
            else
            {
                System.out.println("\nOops! Computer Won");
                won_by_Computer = won_by_Computer + 1;
            }
            i++;
        }

        System.out.println("\nThe number of Times Gaurav won are " + won_by_Gaurav);
        System.out.println("The number of Times Computer won are " + won_by_Computer);
        System.out.println("The Number of Times Game Ties are" + Number_of_Game_Ties);
        sc.close();

    }
}
