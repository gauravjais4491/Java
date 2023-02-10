import java.util.ArrayList;
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
    }
}
