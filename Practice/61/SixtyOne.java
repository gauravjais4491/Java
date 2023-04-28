import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SixtyOne {
    public static void main(final String[] args) throws InterruptedException {
        ExecutorService executor=Executors.newSingleThreadExecutor();
        try{
            executor.submit(new Task());
            System.out.println("Shutdowm executer");
            executor.shutdown();
            executor.awaitTermination(5, TimeUnit.SECONDS);

        }
        catch(InterruptedException e){
            System.err.println("tasks interrupted");
        }
        finally{
            if(!executor.isTerminated())
            {
                System.err.println("cancel non-finished tasks");
            }
            executor.shutdownNow();
            System.out.println("shutdowm finished");
            
        }
    }
    static class Task implements Runnable{
        public void run(){
            try{
                Long duration=(long)(Math.random()*20);
                System.out.println("Runnable Task!");
                TimeUnit.SECONDS.sleep(duration);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
