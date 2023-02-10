import java.util.Arrays;

class Min_Even_Number {
    int Find_Min_Even_Number(int[] arr) {
        Arrays.sort(arr);
        for(int a:arr)
        {
            if(a%2==0)
            {
                return a;
            }
            else{
                return b;
            }
            
        }
    }
}

public class Twentythree {
    public static void main(String[] args) {
        int arr[]={4,6,67,34,72,53};
        Min_Even_Number a=new Min_Even_Number();
        int min_even_number=a.Find_Min_Even_Number(arr);
        System.out.println(min_even_number);
    }
}
