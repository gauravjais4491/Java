// 1470. Shuffle the Array

import java.util.Scanner;

public class Shuffle_the_Array {
    public static void main(String[] args) {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of an array in even: ");
        int length=sc.nextInt();
        int [] shuffle=new int[length];
        for(int i=0;i<length;i++)
        {
            System.out.print("Enter "+i+" element of an array: ");
            shuffle[i]=sc.nextInt();
        }
        int [] output=new int[length];
        output=s.shuffle(shuffle,length);
        System.out.print("After suffling: ");
        for(int i:output){
            System.out.print(i);
        }
        sc.close();
    }
}
class Solution{
    public int[] shuffle(int[] nums, int n){
        int[] after_shuffle=new int[nums.length];
        int temp=0;
        for(int i=0;i<n;i++)
        {
            after_shuffle[temp]=nums[i];
            after_shuffle[temp+1]=nums[i+n];
            temp+=2;
            
        }
        return after_shuffle;
    }
}
