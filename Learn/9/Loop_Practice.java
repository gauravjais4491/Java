import java.util.Scanner;

public class Loop_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter which operation you want to perform: \n 1 for Star Pattern \n 2 for Sum of Even Number \n 3 for  Multiplication Table \n 4 for Multiplication Table in Reverse order \n 5 for Factorial of a number \n 6 for Repeat 5 using while loop \n 7 for Repeat 1 using For loop \n 8 for Sum of ouput of Multiplication Table \n 9 for to check whether an alphabet is vowel or consonant");
        int Input = sc.nextInt();

        if (Input == 1) {
            System.out.println("Enter number of column you want in star pattern: ");
            int n = sc.nextInt();
            System.out.println("\nStar Pattern\n");
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }

        }

        else if (Input == 2) {
            System.out.println("Enter Sum of Even Number upto: ");
            int n = sc.nextInt();
            int a = 0;
            int sum = 0;
            System.out.println("\nSum of even number");
            while (a < n) {
                if (a % 2 == 0) {
                    sum = sum + a;
                }
                a++;
            }
            System.out.println(sum);
        }

        else if (Input == 3) {

            System.out.println("Multiplication Table");

            System.out.println("\nYou want Multiplicaion table of: ");
            int n = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (i * n));
            }
        }

        else if (Input == 4) {

            System.out.println("Multiplication Table in Reverse order: ");
            System.out.println("\nYou want Multiplicaion table in Reverse order of: ");
            int n = sc.nextInt();
            for (int i = 10; i >= 1; i--) {
                System.out.println(n + " x " + i + " = " + (i * n));
            }
        }

        else if (Input == 5) {

            Long Factorial = 1L;
            System.out.println("Here we Find Factorial of a given number\n");
            System.out.println("You want Factorial of which number");
            int n = sc.nextInt();
            for (int i = n; i >= 1; i--) {
                Factorial = Factorial * i;
            }
            System.out.println("The Factorial Of " + n + " is " + Factorial);
        }

        else if (Input == 6) {

            System.out.println("Repeat 5 using while loop");
            while (true) {
                System.out.println(5);
            }
        }

        else if (Input == 7) {

            System.out.println("Repeat 1 using For loop");
            for (int i = 1;;) {
                System.out.println(i);
            }
        }

        else if (Input == 8) {

            int sum = 0;
            System.out.println("Sum of output of Multiplication Table");

            System.out.println("\nYou want Sum of which Multiplicaion table of: ");
            int n = sc.nextInt();
            for (int i = 1; i <= 10; i++) {
                sum = sum + (i * n);
            }
            System.out.println("The sum of Output of multiplication table of " + n + " is " + sum);

        }

        else if (Input == 9) {
            System.out.println("Here we check whether an alphabet is vowel or consonant");
            char c = sc.next().charAt(0);
            if(c == 65 || c == 69 || c == 73 || c == 79 || c == 85 || c == 97 || c == 101
                    || c == 105 || c == 111 || c == 117)
                    {
                System.out.println(c+" is an Vowel");
            }
            else if (c >= 65 && c<= 90 || c >= 97 && c <= 125)
            {
                System.out.println(c+" is a Consonant");
            }
            else{
                System.out.println(c+" is a Special Character");
            }

        }

        else {
            System.out.println(" Oops, You Selcted the wrong input. \nPlease select between given Range!");
        }
        sc.close();
    }
}
