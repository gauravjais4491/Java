import java.util.Scanner;

public class Method_or_Function
{
    static int sum(int a,int b){
        int z=a+b;
        a=40;
        return z;
        
    }
    static void hello(int ...arr)
    {

    }
    static void multiplication(int n){
        System.out.println("The multiplication table of "+n+" is: ");
        for(int i=1;i<=10;i++)
        {
            
            System.out.println(n+" X "+i+" = "+n*i); 
        }
       
    }

    static void Star_Pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
            
        }
    }

    static int Sum_of_Natural_number(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else{
            return n+ Sum_of_Natural_number(n-1);
        }
    }

    static int Average_of_Number(int ...a)
    {
        
        
        return 0;
    }





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter first number: ");
        // int a=sc.nextInt();
        // System.out.println("Enter second number: ");
        // int b=sc.nextInt();
        // int sum=sum(a,b);
        // System.out.println("The sum of "+a+" and "+b+" is "+sum);
        // System.out.println(a);
        // System.out.println("Multiplication table of: ");
        // int num=sc.nextInt();
        // multiplication(num);
        // int num=sc.nextInt();
        // Star_Pattern(num);
        // System.out.println("Enter Natural numbers upto: ");
        // int n=sc.nextInt();
        // System.out.println("The sum of first " +n+" natural number is "+Sum_of_Natural_number(n));
        // int n;

        int Average=Average_of_Number();
        System.out.println(Average);








        sc.close();
    }
}