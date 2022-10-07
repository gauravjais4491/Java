import java.util.Scanner;

//Write a program in Java to find out if a number is prime? 

public class Two {
    public void check() {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n > 1) {
            for (int i = 2; i <=n; i++) {
                if (n % i == 0) {
                    temp++;
                }
            }
        } else {
            System.out.println(n + " is a prime number!");
        }
        if (n > 1) {
            if (temp == 1) {
                System.out.println(n + " is a prime number!");
            } else {
                System.out.println(n + " is not a prime number");
            }

        }
        sc.close();
    }

    public static void main(String[] args) {
        Two t = new Two();
        t.check();
    }
}
