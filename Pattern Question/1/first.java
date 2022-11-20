import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int row=sc.nextInt();
        System.out.print("Enter no. of column: ");
        int column=sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
