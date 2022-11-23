import java.util.Scanner;

// 1672. Richest Customer Wealth

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of customer: ");
        int m=sc.nextInt();
        System.out.print("Enter no. of bank one customer has: ");
        int n=sc.nextInt();
        int [][] accounts=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter the bank balance of ["+i+"] customer of ["+j+"] bank: ");
                accounts[i][j]=sc.nextInt();
            }
        }
        System.out.print("The Richest Customer is: "+s.maximumWealth(accounts)); 
        sc.close();
    }
}
class Solution{
    public int maximumWealth(int[][] accounts)
    {
        int sum=0;
        int max=0;
        for(int i=0;i<accounts.length;i++)
        {
            for(int j=0;j<accounts[i].length;j++)
            {
                sum+=accounts[i][j];
            }
            if(sum>max){
                max=sum;
            }
            sum=0;
        }
        return max;
    }
}
