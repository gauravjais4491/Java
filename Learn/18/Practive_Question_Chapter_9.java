import java.util.Scanner;

class Cylinder {
    private int radius;
    private int height;

    public void setradius(int r) {
        radius = r;
    }
    public void setheight(int h)
    {
        height = h;
    }

    public float getVolumeOfCylinder() {
        return ((float)(Math.PI * radius * radius * height));
    }

    public float getSurface_Area_Of_Cylinder() {
        return (float)((2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height));
    }
    

}

public class Practive_Question_Chapter_9 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of a Cylinder: ");
        int radius = sc.nextInt();
        System.out.println("Enter Height of a Cylinder: ");
        int height = sc.nextInt();
        c.setradius(radius);
        c.setheight(height);
        System.out.println(c.getVolumeOfCylinder());
        System.out.println(c.getSurface_Area_Of_Cylinder());
        sc.close();
    }

}
