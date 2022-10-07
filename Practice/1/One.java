import java.util.Scanner;

//Write a program in Java to check if a number is even or odd in Java? 

public class One {
    public void check()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is even number!");
        }
        else{
            System.out.println(n+" is odd number!");
        }
        
        sc.close();
    } 
    public static void main(String[] args) {
        One o=new One();
        o.check();
    }

}
