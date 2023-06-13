import java.util.Scanner;

public class sixtyThree {

    // Enter 3 numbers from the user & make a function to print their average.
    public static int calculateAverageOfThreeNumber(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    // Write a function to print the sum of all odd numbers from 1 to n.
    public static int calculateSumOfOddNumber(int n) {
        int sum = 0;
        int i = 0;
        while (i < n) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }

    // Write a function which takes in 2 numbers and returns the greater of those two.
    public static int greaterBetweenTwoNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Write a function that takes in the radius as input and returns the circumference of a circle.
    public static float calcuteCircumferenceOfCircle(int Radius) {
        return (2 * 22 * Radius) / 7;
    }

    // Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static void eligibleForVoteOrNot(int age) {
        while (age >= 18) {
            System.out.println("You are Eligible for vote... ");
            return;

        }
        System.out.println("Sorry, You are not Eligible for vote....");

    }

    // Write an infinite loop using do while condition.
    public static void eligibleForVoteOrNot1(int age) {
        do {
            System.out.println("Hello!...");
        } while (age > 0);
    }

    // Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
    public static void count(int[] a) {
        int positive = 0, negative = 0, zero = 0;
        for (int i : a) {
            if (i > 0) {
                positive++;
            } else if (i < 0) {
                negative++;
            } else {
                zero++;
            }

        }
        System.out.println("Number of positive digit is: " + positive);
        System.out.println("Number of null digit is: " + zero);
        System.out.println("Number of negative digit is: " + negative);

    }

    // Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
    public static double calcutePower(int a, int b) {
        return Math.pow(a, b);
    }

    // Write a function that calculates the Greatest Common Divisor of 2 numbers. 
    public static int calculateGCD(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }

        return number1;
    }

    // Write a program to print Fibonacci series of n terms where n is input by user
    public static void calculateFibonacciSeries(int n) {
        int prev = 0;
        int curr = 1;
        
        for (int i = 0; i < n; i++) {
            int next=prev+curr;
            if (i == 0 || i == 1) {
                System.out.print(i+" ");
            } 
            else {
                System.out.print(next+" ");
                prev=curr;
                curr=next;

            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter first number: ");
        // int a=sc.nextInt();
        // System.out.print("Enter Second number: ");
        // int b=sc.nextInt();
        // System.out.print("Enter Third number: ");
        // int c=sc.nextInt();
        // System.out.print("The Average of "+a+","+ b+" and "+c+" is:"+calculateAverageOfThreeNumber(a, b, c));

        // System.out.println("Enter sum of odd number upto: ");
        // int n=sc.nextInt();
        // System.out.println("The sum if odd number is: "+calculateSumOfOddNumber(n));

        // System.out.print("Enter first number: ");
        // int a=sc.nextInt();
        // System.out.print("Enter Second number: ");
        // int b=sc.nextInt();
        // System.out.println("Greater number is :"+greaterBetweenTwoNumber(a, b));

        // System.out.print("Enter Radius of a circle: ");
        // int Radius=sc.nextInt();
        // System.out.print("The Circumference of a Circle is:"+calcuteCircumferenceOfCircle(Radius));

        // System.out.print("Enter your age: ");
        // int age=sc.nextInt();
        // eligibleForVoteOrNot(age);
        // eligibleForVoteOrNot1(age);

        // System.out.println("enter how many number you want to enter: ");
        // int n=sc.nextInt();
        // int[] a=new int[n];
        // for(int i=0;i<n;i++)
        // {
        // a[i]=sc.nextInt();
        // }
        // count(a);

        // System.out.println("enter first number: ");
        // int a=sc.nextInt();
        // System.out.println("Enter second number: ");
        // int b=sc.nextInt();
        // System.out.println(calcutePower(a, b));

        // System.out.print("Enter FIrst number: ");
        // int num1=sc.nextInt();
        // System.out.print("Enter Secong Number: ");
        // int num2=sc.nextInt();
        // System.out.print("The Greatest Common divisior of thsese numbers is:"+calculateGCD(num1, num2));

        // System.out.println("how many fibonacci series number you want: ");
        // int n = sc.nextInt();
        // calculateFibonacciSeries(n);

        sc.close();
    }
}
