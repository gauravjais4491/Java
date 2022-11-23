// 2235. Add Two Integers

import java.util.Scanner;

class Solution{
    public int Add_Two_Interger(int num1,int num2){
        return num1+num2;
    }
}

public class Add_Two_Integers {
    public static void main(String[] args) {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First number: ");
        int num1=sc.nextInt();
        System.out.print("Enter Second number: ");
        int num2=sc.nextInt();
        int sum=s.Add_Two_Interger(num1, num2);
        System.out.println("The sum of "+num1+" and "+num2+" is: "+sum);
        sc.close();
    }   
}
