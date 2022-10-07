
import java.util.Scanner;

public class IF_ELSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total marks in each subject: ");
        int Total_Marks = sc.nextInt();
        System.out.print("Enter Marks you got in Mathmatics: ");
        int Mathmatics = sc.nextInt();
        System.out.print("Enter Marks you got in Science: ");
        int Science = sc.nextInt();
        System.out.print("Enter Marks you got in English: ");
        int English = sc.nextInt();

        float Percentage = (Mathmatics + Science + English)*100 / (Total_Marks * 3.0f);
        System.out.println("\nYour overall percentage is "+Percentage);
        float Percentage_in_Mathmatics = (float)(Mathmatics*100 /Total_Marks);
        System.out.println("\nYou percentage in Mathmatics is "+Percentage_in_Mathmatics);
        float Percentage_in_Science = (float)(Science*100 / Total_Marks);
        System.out.println("\nYou percentage in Science is "+Percentage_in_Science);
        float Percentage_in_English = (float)(English*100 / Total_Marks);
        System.out.println("\nYou percentage in English is "+Percentage_in_English);

        if (Percentage >=40 && Percentage_in_Mathmatics >=33 && Percentage_in_Science >= 33 && Percentage_in_English >= 33) 
        {
            System.out.println("\nYou Pass!");
        } 
        else 
        {
            System.out.println("\nYou Fail!");
        }
        sc.close();

    }
    

}
