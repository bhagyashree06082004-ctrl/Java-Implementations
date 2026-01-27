

class MyThread implements Runnable{
    public void run(){
        System.out.println("MyThread is running");
    }
}

public class RunnableTest {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
    }
}
