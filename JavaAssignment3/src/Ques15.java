import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ques15 {
    private Lock lock = new ReentrantLock(true);
    int count;

    private void increment() {
        lock.lock();
        count++;
        lock.unlock();
    }

    void worker1() {
        for (int i = 1; i <= 1000; i++) {
            increment();
        }
    }

    void worker2() {
        for (int i = 1; i <= 1000; i++) {
            increment();
        }
    }
}
