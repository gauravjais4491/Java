import java.util.Scanner;

// 1920. Build Array from Permutation

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

public class Build_Array_from_Permutation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of an array: ");
        int length_of_array=sc.nextInt();
        int[] nums=new int[length_of_array];
        for(int i=0;i<nums.length;i++)
        {
            System.out.print("Enter "+i+" element of array: ");
            nums[i]=sc.nextInt();
        }
        Solution s=new Solution();
        int [] ans=s.buildArray(nums);
        for(int a:ans)
        {
            System.out.print(a+" ");
        } 
        sc.close();
    }
}