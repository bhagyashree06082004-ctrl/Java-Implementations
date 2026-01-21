class myclass extends Thread{
    public myclass(String name){
        super(name);//calling the constructor of the thread class 
    }
    public void run(){
        int count=1;
        while (true) { 
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.print(e);
            }
        }
    }
}

public class Threadtest {
    public static void main(String[] args) {
        myclass m = new myclass("MyThread 1");
        // System.out.println(m.getId());
        // System.out.println(m.getName());
        // System.out.println(m.getPriority());
        // System.out.println(m.getStackTrace());
        // System.out.println(m.getState());
        // System.out.println(m.isAlive());
        // System.out.println(m.isDaemon());
        m.setDaemon(true);//means when this thread ends quit dont wait till child process end 
        //meaning dont wait till other functions or threads 
        //join() is used to add a friend thread to the deamon so it will wait for that 
        //and yield() is used to give more time to some specific thread
        
        m.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.print(e);
        }



    }
}
