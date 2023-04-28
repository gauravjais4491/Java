public class FiftyEight extends Thread {
    public void run(){
        System.out.println("Thread 1 is running");
    }
    public static void main(String[] args) {
        FiftyEight t=new FiftyEight();
        t.start();
        System.out.println(t.getPriority());
        System.out.println(t.isAlive());
        System.out.println(t.getId());
        t.stop();
        System.out.println(t.isAlive());
    }
}
