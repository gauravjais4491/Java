import java.util.Scanner;

public class Income_Tax_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your yearly salary: ");
        int Income=sc.nextInt();
        float Tax=0;
        
        if (Income<=250000) {
            System.out.println("You are tax free!");
        } 
        else if(Income>250000 && Income<=500000)
        {
            Tax=Tax+ (0.05f*(Income-250000));
            System.out.println("You are eligible to pay taxes and the amount you need to pay as per government rule is "+Tax);
        }
        else if(Income>500000 && Income<=1000000)
        {
            Tax=Tax+(0.05f*(5000000-250000));
            Tax=Tax+ (0.2f*(Income-500000));
            System.out.println("You are eligible to pay taxes and the amount you need to pay as per government rule is "+Tax);   
        }
        else
        {
            Tax= Tax + (0.05f*(500000-250000));//tax for income 250000 to 500000
            Tax= Tax + (0.2f*(1000000-500000));//tax for income 500000 to 1000000
            Tax= Tax + (0.3f*(Income-1000000));
            System.out.println("You are eligible to pay taxes and the amount you need to pay as per government rule is "+Tax);
        }
        sc.close();
    }
    
}
