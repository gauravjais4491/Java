import java.util.Scanner;

//1929. Concatenation of Array


class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] ans=new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}

public class input{
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
        int [] ans=s.getConcatenation(nums);
        for(int a:ans)
        {
            System.out.print(a+" ");
        } 
        sc.close();
    }
}

