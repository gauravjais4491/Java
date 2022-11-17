import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row=sc.nextInt();
        for(int i=0;i<row;i++)
    {
        for(int j=0;j<row-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
        sc.close();
    }
    
}
