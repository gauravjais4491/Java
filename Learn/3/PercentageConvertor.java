import java.util.Scanner;

public class PercentageConvertor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Number of Marks in Each Subject: ");
        int TotalMarks = sc.nextInt();
        System.out.println("Enter Marks you Got in Math");
        int Math = sc.nextInt();
        System.out.println("Enter Marks you Got in Science");
        int Science = sc.nextInt();
        System.out.println("Enter Marks you Got in Hindi");
        int Hindi = sc.nextInt();
        System.out.println("Enter Marks you Got in English");
        int English = sc.nextInt();
        System.out.println("Enter Marks you Got in Social_Science");
        int Social_Science = sc.nextInt();
        int Total = Math + Science + Hindi + English + Social_Science;
        float Percentage =  (Total*100/(5*TotalMarks));
        System.out.println("you got " +Percentage + " Percent ");
        sc.close();
      
    }
}
