import java.util.Scanner;

class Solution {
    float[][] arr = { { 2.5f, 2.5f, 2.5f, 2.5f, 2.5f, 4, 4 }, { 2, 2, 2, 2, 2, 2, 10 },
            { 1.5f, 1.5f, 1.5f, 1.5f, 1.5f, 1.5f, 1.5f },
            { 3, 3, 3, 3, 3, 5, 6 }, { 2, 2, 2, 2, 2, 4, 4 } };
    float total_expenses = 0;
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println(
                "Enter which newspaper you want to purchase: \n 1 for Hindu \n 2 for ET \n 3 for BM \n 4 for TOI \n 5 for HT ");
        int newspaper = sc.nextInt();
        int again;
        if (newspaper == 1) {
            System.out.println("The total expenses for the montly premium is: " + Hindu());
            total_expenses = 0;
            System.out.println("Want to purchases more: \n 1 for Yes \n 2 for No");
            again = sc.nextInt();
            if (again == 1) {

                start();
            } else {
                System.out.println("Thank You for purchasing!");
            }
        } else if (newspaper == 2) {
            System.out.println("The total expenses for the montly premium is: " + ET());
            total_expenses = 0;
            System.out.println("Want to purchases more: \n 1 for Yes \n 2 for No");
            again = sc.nextInt();
            if (again == 1) {
                start();
            } else {
                System.out.println("Thank You for purchasing!");
            }
        } else if (newspaper == 3) {
            System.out.println("The total expenses for the montly premium is: " + BM());

            System.out.println("Want to purchases more: \n 1 for Yes \n 2 for No");
            again = sc.nextInt();
            if (again == 1) {
                start();
            } else {
                System.out.println("Thank You for purchasing!");
            }
        } else if (newspaper == 4) {
            System.out.println("The total expenses for the montly premium is: " + TOI());
            total_expenses = 0;
            System.out.println("Want to purchases more: \n 1 for Yes \n 2 for No");
            again = sc.nextInt();
            if (again == 1) {
                start();
            } else {
                System.out.println("Thank You for purchasing!");
            }

        } else if (newspaper == 5) {
            System.out.println("The total expenses for the montly premium is: " + HT());
            total_expenses = 0;
            System.out.println("Want to purchases more: \n 1 for Yes \n 2 for No");
            again = sc.nextInt();
            if (again == 1) {
                start();
            } else {
                System.out.println("Thank You for purchasing!");
            }

        } else {
            System.out.println("please enter as per mentioned newspaper\n\n");
            start();
        }

    }

    public float Hindu() {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total_expenses += arr[i][j];
            }
        }
        return 4 * total_expenses;
    }

    public float ET() {
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total_expenses += arr[i][j];
            }
        }
        return 4 * total_expenses;
    }

    public float BM() {
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total_expenses += arr[i][j];
            }
        }
        return 4 * total_expenses;
    }

    public float TOI() {
        for (int i = 3; i < 4; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total_expenses += arr[i][j];
            }
        }
        return 4 * total_expenses;
    }

    public float HT() {
        for (int i = 4; i < 5; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total_expenses += arr[i][j];
            }
        }
        return 4 * total_expenses;
    }

}

public class Testvagent {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.start();
    }
}
