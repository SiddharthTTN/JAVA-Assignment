import java.util.concurrent.atomic.AtomicInteger;

public class Ques12 {
    AtomicInteger count= new AtomicInteger();

    public void incrementCount() {
        synchronized (this) {
            count.incrementAndGet();
        }
    }

    void worker1() {
        for (int i = 1; i <= 1000; i++) {
            count.incrementAndGet();
        }
    }

    void worker2() {
        for (int i = 1; i <= 1000; i++) {
            count.incrementAndGet();
        }
    }
}
