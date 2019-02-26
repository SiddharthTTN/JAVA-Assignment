import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

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
                    Thread.sleep(00L);
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
                    Thread.sleep(000L);
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
            // exec.shutdownNow();
            exec.shutdown();
            System.out.println("");
        }

        //Ques5
        System.out.println(exec.isShutdown());
        System.out.println(exec.isTerminated());
        System.out.println("");

        //Ques6
        ExecutorService exec1 = Executors.newSingleThreadExecutor();
        Future<Integer> integerFuture = exec1.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("call() method is called.");
                return 2;
            }
        });
        //while (!integerFuture.isDone());
        System.out.println(integerFuture.isDone());
        System.out.println(integerFuture.get());
        System.out.println(integerFuture.isDone());
        exec1.shutdown();

        if (integerFuture.isCancelled()) {
            System.out.println("Your task has been cancelled");
        }

        //Ques7
        List<Callable<Integer>> eventList = new ArrayList<>();

        eventList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });
        eventList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        eventList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        });
        ExecutorService exec2 = Executors.newSingleThreadExecutor();
        List<Future<Integer>> outFuture = exec2.invokeAll(eventList);
        outFuture.forEach((e) -> {
            if (e.isDone()) {
                try {
                    System.out.println(e.get());
                } catch (InterruptedException | ExecutionException e1) {
                    e1.printStackTrace();
                }
            }
        });
        exec2.shutdown();
        exec2.awaitTermination(3000L, TimeUnit.MILLISECONDS);
        System.out.println("");

        //Ques8
        ScheduledExecutorService exec3 = Executors.newSingleThreadScheduledExecutor();
        exec3.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task executed after 2 seconds");
            }
        }, 1000, TimeUnit.MILLISECONDS);
        exec3.shutdown();
        ScheduledExecutorService exec4 = Executors.newSingleThreadScheduledExecutor();
        exec4.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task Executed after a fixed rate of 2 seconds");
            }
        }, 2, 2, TimeUnit.SECONDS);
        exec4.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task Executed with a fixed delay of 2 seconds");
            }
        }, 2, 2, TimeUnit.SECONDS);
        exec4.shutdown();

        //Ques9
        ExecutorService exec5 = Executors.newCachedThreadPool();
        //ExecutorService exec5 = Executors.newFixedThreadPool(3);
        for (int i = 0; i <= 10; i++) {
            exec5.submit(new Ques9(i));
        }
        exec5.shutdown();

        //Ques10 & Ques11
        Ques10 q10 = new Ques10();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                q10.worker1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                q10.worker2();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                q10.worker3();
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                q10.worker4();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println("Value of Count is : " + q10.count);
        System.out.println("Value of Count1 is : " + q10.count1);

        //Ques12
        Ques12 q12 = new Ques12();
        Thread t6 = new Thread(new Runnable() {
            @Override
            public void run() {
                q12.worker1();
            }
        });
        Thread t7 = new Thread(new Runnable() {
            @Override
            public void run() {
                q12.worker2();
            }
        });
        t6.start();
        t7.start();
        t6.join();
        t7.join();
        System.out.println("Value of count using atomic class is: " + q12.count);

        //Ques13
        Ques13 q13 = new Ques13();
        new Thread(new Runnable() {
            @Override
            public void run() {
                q13.worker1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                q13.worker4();
            }
        }).start();

        //Ques14
        Ques14 q14 = new Ques14();
        new Thread(new Runnable() {
            @Override
            public void run() {
                q14.worker1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                q14.worker2();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                q14.worker3();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                q14.worker4();
            }
        }).start();

        //Ques15
        Ques15 q15 = new Ques15();
        new Thread(new Runnable() {
            @Override
            public void run() {
                q15.worker1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                q15.worker2();
            }
        }).start();
        thread1.join();
        thread2.join();

        System.out.println("Value of count using reentrant lock:  " + q15.count);

        //Ques16
        Ques16 q16 = new Ques16();
        new Thread(new Runnable() {
            @Override
            public void run() {
                q16.worker1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                q16.worker2();
            }
        }).start();
        thread1.join();
        thread2.join();
    }

}



