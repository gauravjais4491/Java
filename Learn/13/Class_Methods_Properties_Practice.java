

import java.util.Scanner;

class Job{
    int salary;
    String Name;

    public int getsalary(){
       return salary;
    }
    public String getname(){
        return Name;

    }
    public String setname(){
        Name="Netra Kashyap";
        return Name;

    }

}
class Square{
    int area_of_a_square;
    int perimeter_of_a_square;
    int side_of_a_square;
    
    public void side(int side)
    {
        side_of_a_square=side;
        
    }
    public int area_of_a_square()
    {
        area_of_a_square=side_of_a_square*side_of_a_square;
        return area_of_a_square;
    }
    public int perimeter_of_a_square(){
        perimeter_of_a_square=4*side_of_a_square;
        return perimeter_of_a_square;
    }

}
class Rectangle{
    int length,breadth;
    public int area_of_a_rectangle()
    {
        return length*breadth;
    }
    public int perimeter_of_a_rectangle()
    {
        return length+breadth;
    }


}
class Circle{
    int radius;
    float pie=3.14f;
    public float area_of_a_circle(){
        return pie*radius*radius;
    }
    public float perimeter_of_a_circle(){
        return 2*pie*radius;
    }

}

public class Class_Methods_Properties_Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* 
        Job Gaurav=new Job();
        Gaurav.salary=24;
        Gaurav.Name="Gaurav Kumar Jaiswal";
        System.out.println("\n");
        System.out.println("The Name of Employee is "+Gaurav.getname());
        System.out.println("The salary of this employee is "+Gaurav.getsalary());
        System.out.println("Name after changed is "+Gaurav.setname());
        */

        
        /* 
        Square ABCD=new Square();
        
        System.out.print("Enter side of a square: ");
        int side_of_a_square;
        side_of_a_square=sc.nextInt();
        ABCD.side(side_of_a_square);
        
        System.out.println("The area of Square ABCD is "+ABCD.area_of_a_square());
        System.out.println("The perimeter of Square ABCD is "+ABCD.perimeter_of_a_square());
        */
        /* 
        Rectangle ABCD=new Rectangle();
        System.out.print("Enter length of a square: ");
        ABCD.length=sc.nextInt();
        System.out.print("Enter breadth of a square: ");
        ABCD.breadth=sc.nextInt();
        System.out.println("The area of rectangle is: "+ABCD.area_of_a_rectangle());
        System.out.println("The perimeter of rectangle is "+ABCD.perimeter_of_a_rectangle());
        */
        Circle c=new Circle();
        System.out.print("Enter the radius of a circle ");
        c.radius=sc.nextInt();
        System.out.println("The area od circle is "+c.area_of_a_circle());
        System.out.println("The perimeter of circle is "+c.perimeter_of_a_circle());
        sc.close();
    }
    
}
