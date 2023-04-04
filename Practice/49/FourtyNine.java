import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

//MoveDemo
class FourtyNine {
    public static void main(String[] args) {
        File from = new File("D:\\src.txt");
        File to = new File("D:\\dest.txt");
        try {
            Files.move(from.toPath(), to.toPath(),

                    StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}