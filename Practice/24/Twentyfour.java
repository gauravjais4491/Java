import java.util.*;
import java.util.stream.*;

class demo{
}

public class Twentyfour {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(67);
        al.add(1);
        al.add(67);
        al.add(23);
        al.add(67);
        al.add(34);
        al.add(35);
        al.add(23);
        al.add(88);
        al.add(34);
        al.add(67);
        al.add(21);
        Stream<Integer> st=al.stream().distinct().sorted((p,q) -> p.compareTo(q));
        st.forEach(x -> System.out.println(x));


        Stream<Integer> i=Stream.of(1,2,3,4,5,6,7,8);
        Map<Boolean,List<Integer>> m=i.collect(Collectors.groupingBy(num-> num%2==0));
        System.out.println(m);

        Stream<Integer> st2=Arrays.asList(new Integer[]{11,9,5,3,7,0,30}).stream();
        Optional <Integer> op=st2.filter(b->b%3==0).min(Integer::compareTo);
        System.out.println(op.get());
    }
}
