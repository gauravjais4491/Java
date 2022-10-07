import java.util.Scanner;

class circle{
    float area_of_a_circle_by_computer,area_of_a_circle_by_user;
    float perimeter_of_a_circle_by_computer,perimeter_of_a_circle_by_user;
    int radius;
    float pie=3.14f;
    public void area_of_a_circle(){
        area_of_a_circle_by_computer=2*pie*radius;
        if(area_of_a_circle_by_computer==area_of_a_circle_by_user)
        {
            System.out.println("Your solution is correct!");
        }
        else{
            System.out.println("Answer is wrong! \n Please solve again");
        }
    }
    public void perimeter_of_a_circle(){
        perimeter_of_a_circle_by_computer=2*pie*radius;
        System.out.println("\n");
        if(perimeter_of_a_circle_by_computer==perimeter_of_a_circle_by_user)
        {
            System.out.println("Your solution is correct!");
        }
        else{
            System.out.println("Answer is wrong! \n Please solve again");
        }
    }
}

public class Modifiers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        circle c=new circle();
        System.out.print("Enter radius of a circle: ");
        c.radius=sc.nextInt();
        System.out.print("Enter area of a circle as per your solution: ");
        c.area_of_a_circle_by_user=sc.nextFloat();
        System.out.print("Enter perimetr of a circle as per your solution: ");
        c.perimeter_of_a_circle_by_user=sc.nextFloat();
        c.area_of_a_circle();
        c.perimeter_of_a_circle();

        sc.close();

    }
    
}
