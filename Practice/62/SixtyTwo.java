public class SixtyTwo {
    public static void main(String[] args) {
        int a = 64;
        int b = 1;
        while (b <= 26) {
            System.out.println((char) (a + b));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            if (b <= 10) {
                System.out.println(b);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            b++;
        }
    }
}
