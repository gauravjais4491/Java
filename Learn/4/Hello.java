import java.util.Scanner;

public class Hello {
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     // System.out.println("Enter First Number: ");
    //     // int num1=sc.nextInt();
    //     // System.out.println("Enter Second Number: ");
    //     // int num2=sc.nextInt();
    //     // int c=num1/num2;
    //     // System.out.println(c);
    //     // System.out.printf("hello");
    //     // System.out.format("World");

    //     // String name="Gaurav";
    //     // name=name.toUpperCase();
    //     // System.out.println(name.toUpperCase());
    //     // System.out.println(name);
    //     // System.out.println(name.substring(1,4));
    //     // System.out.println(name.replace('a' , 'w'));
    //     // System.out.println(name.endsWith("Gaurav"));
    //     // System.out.println(name.equalsIgnoreCase("Gaurav "));

    //     String s = scan.nextLine();
    //     System.out.println("String: " + s);



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter: ");
        String s = scan.nextLine();
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
    


       
        scan.close();
    }
}
