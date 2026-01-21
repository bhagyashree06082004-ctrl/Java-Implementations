class mydata{
    public void display(String str){
        synchronized (this) {
            //this block will be like a shared resource also we can make a whole method synchronized
        
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt((i)));
            try {
                            Thread.sleep(100);

            } catch (InterruptedException e) {
            }
        }
    }
    }
}

class thread1 extends Thread{
    mydata m1;
    public thread1(mydata m1){
        this.m1 =m1;
    }
    public void run(){
        m1.display("hello world new line");
    }
}

class thread2 extends Thread{
    mydata m1;
    public thread2(mydata m1){
        this.m1 =m1;
    }
    public void run(){
        m1.display("Welocome the people");
    }
}


public class SyncDemo {
    public static void main(String[] args) {
        mydata data = new mydata();
        thread1 t1 = new thread1(data);
        thread2 t2 = new thread2(data);

        t1.start();
        t2.start();
    }
}
