import java.util.Scanner;

class Fibonacci_Series {

    static void Fibonacci_series_without_Recursion(int n) {
        int n1 = 0, n2 = 1, n3;
        for (int i = 0; i < n; i++) {
            if (i == 0)
            {
                System.out.print(n1+" ");
            }
            else if (i == 1) 
            {
                System.out.print(n2+" ");
            }
            else {
                n3 = n1 + n2;
                System.out.print(n3+" ");
                n1 = n2;
                n2 = n3;

            }
        }

    }
    static int Fibonacci_Series_With_Recursion(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else{            
            return Fibonacci_Series_With_Recursion(n-2)+Fibonacci_Series_With_Recursion(n-1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many element you want in Fibonacci series: ");
        int num = sc.nextInt();
        System.out.println("Without_Recursion");
        Fibonacci_series_without_Recursion(num);

        System.out.println("\nWith Recursion");
        for(int i=0;i<num;i++)
        {
            System.out.print(Fibonacci_Series_With_Recursion(i)+" ");
        }
        sc.close();

    }
}