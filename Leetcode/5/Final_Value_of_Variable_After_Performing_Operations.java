import java.util.Scanner;

// 2011. Final Value of Variable After Performing Operations
public class Final_Value_of_Variable_After_Performing_Operations {
    public static void main(String[] args) {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of an array string: ");
        int length=sc.nextInt();
        String [] operations=new String[length];
        for(int i=0;i<length;i++)
        {
            System.out.print("Enter "+i+" element of string array: ");
            operations[i]=sc.next();
        }
        System.out.print("Final_Value_Affer_Operations is: "+s.finalValueAfterOperations(operations));
        sc.close();
    }
    
}
class Solution{
    int count=0;
    public int finalValueAfterOperations(String[] operations) {
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("++X")|| operations[i].equals("X++"))
            {
                count++;
            }
            else{
                count--;
            }
        }
        return count;
    }
        
}

