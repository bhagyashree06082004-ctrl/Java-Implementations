class Data {
    private int value;
    private boolean available = false;

    // Producer will call this
    public synchronized void set(int v) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value = v;
        System.out.println("Produced: " + value);
        available = true;
        notify();
    }

    // Consumer will call this
    public synchronized int get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + value);
        available = false;
        notify();
        return value;
    }
}

class Producer extends Thread {
    Data d;

    public Producer(Data d) {
        this.d = d;
    }

    public void run() {
        int count = 1;
        while (true) {
            d.set(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    Data d;

    public Consumer(Data d) {
        this.d = d;
    }

    public void run() {
        while (true) {
            d.get();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class IPC {
    public static void main(String[] args) {
        Data d = new Data();

        Producer p = new Producer(d);
        Consumer c = new Consumer(d);

        p.start();
        c.start();
    }
}
