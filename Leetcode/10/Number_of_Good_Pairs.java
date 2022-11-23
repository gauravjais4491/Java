// 1512. Number of Good Pairs

import java.util.Scanner;

public class Number_of_Good_Pairs {
    public static void main(String[] args) {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of ans array: ");
        int length=sc.nextInt();
        int [] nums=new int[length];
        for(int i=0;i<length;i++)
        {
            System.out.print("Enter "+i+" element of an array:");
            nums[i]=sc.nextInt();
        }
        System.out.print("The number of good pairs are: "+s.numIdenticalPairs(nums));
        sc.close();
    }
}
class Solution{
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
        }
        return count;

    }
}