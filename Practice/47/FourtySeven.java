import java.nio.file.*;
import java.util.stream.*;

//Path Demo
class FourtySeven {
    static public void main(String[] shruti) {
        Path p = Paths.get("E:\\Dummy1");
        // Path p = Paths.get("E:/Dummy/ABCD.txt");
        System.out.println(p.getRoot());
        try {
            Stream<Path> str = Files.list(p);
            str.forEach(x -> {
                String name = x.getFileName().toString();
                String[] tokens = name.split("\\.");
                String ext = tokens[tokens.length - 1];
                try {
                    Path d = Paths.get(x.getParent() + "\\" + ext);
                    Files.createDirectory(d);
                } catch (Exception e) {
                }
            });
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}