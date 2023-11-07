package phase1module2;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

public class SyncExample {
    public static void main(String[] args) {
        Counter counterobj = new Counter();

        Thread thread1obj = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
            	counterobj.increment();
            }
        });

        Thread thread2obj = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
            	counterobj.increment();
            }
        });

        thread1obj.start();
        thread2obj.start();

        try {
        	thread1obj.join();
        	thread2obj.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count Value: " + counterobj.getCount());
    }
}
