class MyThread implements Runnable {
    int i=0;
    int j=0;
    @Override
    public  void run(){
        try {
            func1();
            func2();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    private void func1() throws  InterruptedException{
        while(i < 1000000){
            i++;
            Thread.sleep(200);
        }
    }
    private void func2() throws  InterruptedException{
        while (j < 1000000) {  
            j++;
            Thread.sleep(200);
        }
    }
}
class third{
    public static void main(String[] args) {
        try {
            MyThread my = new MyThread();
            Thread th = new Thread(my, "MyThread");
            th.setPriority(10);
            th.setDaemon(true);
            th.start();
            System.out.println("Thread Name: " + th.getName());
            System.out.println("Thread Priority: " + th.getPriority());
            System.out.println("Is Daemon: "+ th.isDaemon());
            Thread.State ThSte  = th.getState();
            System.out.println("Thread State: "+ ThSte.toString());
            ThreadGroup ThGrp = th.getThreadGroup();
            System.out.println("Thread Group: "+ ThGrp.toString());
            System.out.println("Is Alive: "+ th.isAlive());
            System.out.println("Is Interupted: "+ th.isInterrupted());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}