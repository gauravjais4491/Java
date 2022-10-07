
import java.util.Scanner;

public class Check_Weather_a_Year_is_Leap_Year_or_not {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("This code is made for \" To Check_Weather_a_Year_is_Leap_Year_or_not \" ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which year you want to check: ");
        int Year = sc.nextInt();
        if (Year % 100 == 0) 
        {
            if (Year % 400 == 0) 
            {
                System.out.printf("%d is Leap Year", Year);
            }
            else
            {
                System.out.printf("%d is not a Leap Year",Year);
            }
        }

        else {
            if(Year%4==0)
            {
                System.out.printf("%d is Leap Year", Year);
            }
            else
            {
                System.out.printf("%d is not Leap Year",Year);
            }
        }
        sc.close();
    }

}
