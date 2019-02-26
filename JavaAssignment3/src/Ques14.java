class Ques14 {
    void worker1() {
        synchronized (this) {
            System.out.println("Worker1 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker1 Done");
        }
    }

    void worker2() {
        synchronized (this) {
            System.out.println("Worker 2 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 2 Done");
        }
    }

    void worker3() {
        synchronized (this) {
            System.out.println("Worker 3 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 3 Done");
        }
    }


    void worker4() {
        synchronized (this) {
            System.out.println("Worker 4 Started");
            System.out.println("Worker 4 Done");
            notifyAll();
        }
    }
}