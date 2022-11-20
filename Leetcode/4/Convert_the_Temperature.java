import java.util.Scanner;

// 2469. Convert the Temperature


class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans=new double[2];
        ans[0]=celsius+273.15;
        ans[1]=celsius*1.80+32.00;
        return ans;
    }
}
public class Convert_the_Temperature{
    public static void main(String[] args) {
        Solution s= new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of celsius: ");
        double celsius=sc.nextDouble();
        double [] d=new double[2];
        d=s.convertTemperature(celsius);
        for(double ans:d)
        {
            System.out.printf("%.5f\n",ans);
        }  
        sc.close();
    }
}