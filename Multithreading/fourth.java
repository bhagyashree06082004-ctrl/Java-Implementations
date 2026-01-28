class MyThread extends  Thread{
    public  MyThread(String name){
        super(name);
        setDaemon(true);
        setPriority(Thread.MAX_PRIORITY);
        // Thread.yield();
    }
    public  void run(){
        int i=0;
        while(i <= 100){
            System.out.println("Thread :" +i);
            i++;
            try {
                System.out.println("Sleeping now...");
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("thread finished");
    }
}

class fourth{
    public static void main(String[] args) {
        MyThread my = new MyThread("Pranav");
        my.start();
        Thread mainThread = Thread.currentThread();
        Thread.yield();
        my.interrupt();
        for(int i=1 ;i<=100;i++){
            if(i == 100){
                System.out.println("main : " + i);
                System.out.println("main finished");
            }
            else{
                System.out.println("main : " + i);
            }
        }
        try {
            my.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}