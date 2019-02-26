class Ques10 {
    int count;
    int count1;


    private void incrementCount1() {
        synchronized (this) {
            count1++;
        }
    }

    private synchronized void incrementCount() {
        count++;
    }

    void worker1() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount();
        }
    }

    void worker2() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount();
        }
    }
    void worker3() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount1();
        }
    }

    void worker4() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount1();
        }
    }
}
