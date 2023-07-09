import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sixtyFour {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // while(n1 != n2) { 
        //     if(n1>n2) {
        //         n1 = n1 - n2;
        //     } 
        //     else {
        //         n2 = n2 - n1;
        //     }
        // }
        // System.out.println("GCD is : "+ n2);
        // sc.close();
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2=new ArrayList<>(list1);
        list2.remove(1);

        System.out.println("list 1 :" +list1);
        System.out.println("list 2 :" +list2);
    }   
}
