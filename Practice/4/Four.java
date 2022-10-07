import java.util.Scanner;

// How to reverse a String in Java?
public class Four {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which string you want to reverse: ");
        String str = sc.nextLine();
        for (int i = str.length(); i > 0; --i) {
            System.out.print(str.charAt(i-1));
        }
        sc.close();

    }

}
