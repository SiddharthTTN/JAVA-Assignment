import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Ques1 q1 = new Ques1();
        q1.start();
        Thread obj = new Thread(new Ques01());
        obj.start();
        System.out.println("");

        //Ques2
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Running 1st Thread");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000L);
                    thread1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Running 2nd Thread");
            }
        });

        thread2.start();
        thread1.start();
      //  thread1.join();
      //  thread2.join();
        System.out.println("");

        //Ques3
        ExecutorService exec = Executors.newSingleThreadExecutor();
        try {
            exec.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1");
                }
            });

            exec.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2");
                }
            });
        } finally {
        //Ques4
            exec.shutdownNow();
            //exec.shutdown();
            System.out.println("");
        }

        //Ques5
        System.out.println(exec.isShutdown());
        System.out.println(exec.isTerminated());
        System.out.println("");

        //Ques6



    }




}

