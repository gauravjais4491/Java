import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class filedelete {
    
    private static void filedeletes(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Which type of file you want to delete \n 1 for .exe \n 2 for .class \n 3 for .zio");
        int extension=sc.nextInt();
        System.out.print("Enter the floder path: ");
        String path =sc.next();
        Path filePath = Paths.get(path);
        
        if(extension==1)
        {
            try {
                System.out.println("! Deleting File From The Configured Path !");
                Files.delete(filePath);
            }
            catch (IOException ioException) {
                ioException.printStackTrace();
            }
            System.out.println("File Exists After Delete?= " + Files.exists(filePath));
        }
        else if(extension==2)
        {
            try {
                System.out.println("! Deleting File From The Configured Path !");
                Files.delete(filePath);
            }
            catch (IOException ioException) {
                ioException.printStackTrace();
            }
            System.out.println("File Exists After Delete?= " + Files.exists(filePath));
        }
        else if(extension==3)
        {
            try {
                System.out.println("! Deleting File From The Configured Path !");
                Files.delete(filePath);
            }
            catch (IOException ioException) {
                ioException.printStackTrace();
            }
            System.out.println("File Exists After Delete?= " + Files.exists(filePath));
        }
        sc.close();
    }
    public static void main(String[] args) {
        filedeletes();
    }
}
