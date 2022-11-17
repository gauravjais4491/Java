import java.util.Scanner;
import java.lang.Math;
import java.lang.*;

abstract class shape {
    Scanner sc = new Scanner(System.in);

    public void declaration() {
        System.out.print("Enter radius of circle: ");
        int radius = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter side of square: ");
        int side= sc.nextInt();
    }

    abstract public void circle();

    abstract void rectangle(int length, int breadth);

    abstract void square(int side);
}


class area extends shape {
    void circle(int radius) {
        double area_of_circle = Math.PI * radius * radius;
        System.out.print("Area of circle is: " + area_of_circle);
    }

    void rectangle(int length, int breadth) {
        int area_of_rectangle = length * breadth;
        System.out.print("Area of rectangle is: " + area_of_rectangle);
    }

    void square(int side) {
        int area_of_square = side * side;
        System.out.print("Area os square is: " + area_of_square);
    }
}

public class ten {
    public static void main(String[] args) {
        area a = new area();
    }
}
