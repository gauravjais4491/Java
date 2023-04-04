import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//FileDelete
class FiftyOne {
    private static String file_path = "/home/noob/Downloads/hello.exe";

    private static void fileExists() {
        Path filePath = Paths.get(file_path);
        System.out.println("File Exists Before Delete?= " + Files.exists(filePath));
        try {
            System.out.println("! Deleting File From The Configured Path !");
            Files.delete(filePath);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println("File Exists After Delete?= " + Files.exists(filePath));
    }

    public static void main(String[] args) {
        fileExists();
    }
}