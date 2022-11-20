// 1480. Running Sum of 1d Array

import java.util.Scanner;

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        Solution s=new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of ans array: ");
        int length = sc.nextInt();
        int[] nums=new int[length];
        for(int i=0;i<nums.length;i++)
        {
            System.out.print("Enter "+i+" element of an array: ");
            nums[i]=sc.nextInt();
        }
        int[] ans=new int[length];
        ans=s.runningSum(nums);
        for(int a:ans){
            System.out.println(a);
        }
        sc.close();
    }
}
