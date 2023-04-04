import java.nio.file.*;
import java.nio.charset.*;
import java.util.stream.*;
import java.util.*;

//NormalizeDemo
class FiftyTwo {
    static public void main(String[] shruti) throws Exception {
        HashSet<Path> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Directory to be searched:\t");
        String dir = sc.next();
        System.out.print("Enter the KEYWORD to be searched:\t");
        String key = sc.next();
        Path p = Paths.get(dir);
        Stream<Path> pstr = Files.walk(p);
        pstr.forEach(
                pt -> {
                    try {
                        if (!Files.isDirectory(pt)) {
                            Stream<String> str = Files.lines(pt);
                            str.forEach(s -> {
                                if (s.contains(key))
                                    set.add(pt);
                            });
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                });
        for (Path p11 : set)
            System.out.println(p11);
    }
}