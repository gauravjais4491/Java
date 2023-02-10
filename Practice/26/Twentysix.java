import java.util.*;
import java.util.stream.Stream;
public class Twentysix {
    public static void main(String[] args) {
        Integer []arr={90,20,5,60};
        Stream <Integer> st=Arrays.stream(arr);
        // Optional<Integer> op=st.filter(x -> x%2 !=0).reduce((a,b)->a+b);
        // if(op.isPresent()){
        //     System.out.println("Sum is: "+op.get());
        // }

        // Integer result =st.filter(x->x%2!=0).reduce(0, (a,b)->a+b);
        Integer result1=st.filter(x->x%2!=0).reduce(0, (a,b)->a+a,(a,b)->a+b);
        // System.out.println(result);
        System.out.println(result1);
    }
}
