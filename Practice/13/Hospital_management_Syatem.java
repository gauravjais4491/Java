import java.util.Scanner;
class Hospital_management_Syatem {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        int date_of_birth=sc.nextInt();
        sc.nextLine();
        String sex=sc.nextLine();
        String Specialization=sc.nextLine();
        int case_number=sc.nextInt();
        sc.nextLine();
        String disease=sc.nextLine();
        int date_of_submission=sc.nextInt();
        int date_of_discharge=sc.nextInt();
        int bill_number=sc.nextInt();
        sc.close();
        System.out.println(name+" "+date_of_birth+" "+sex+" "+Specialization+" "+case_number+" "+disease+" "+date_of_submission+" "+date_of_discharge+" "+bill_number);
    }
}


