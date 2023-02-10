// Lamda Expression
@FunctionalInterface
interface design {
    public void paint();
}

public class Eighteen {
    public static void main(String[] args) {
        int height = 67;
        design d1 = () -> {
            System.out.println("Painted area height is: " + height);
        };
        d1.paint();
    }
}
