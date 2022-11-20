// 1108. Defanging an IP Address

import java.util.Scanner;

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}

public class Defanging_an_IP_Address {
    public static void main(String[] args) {
        Solution s=new Solution();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an IP Address: ");
        String IP_Address=sc.next();
        System.out.println(s.defangIPaddr(IP_Address)); 
        sc.close();
    }
}
