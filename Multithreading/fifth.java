class Monitor{
    int i=0;
    synchronized  public  void increase(){
        i++;
    }
}

class MyThread1 extends  Thread{
    Monitor m = new Monitor();
    public  MyThread1(Monitor m){
        this.m = m;
    }
    public  void run(){
        for(int i=0;i<100;i++){
            this.m.increase();
            System.out.println("i (th1)is: " + this.m.i);
        }
    }
}

class  MyThread2 extends  Thread{
    Monitor m = new Monitor();
    public  MyThread2(Monitor m){
        this.m = m;
    }
    public  void run(){
        for(int i=0;i<100;i++){
            this.m.increase();
            System.out.println("i (th2)is: " + this.m.i);
        }
    }
}

class fifth{
    public static void main(String[] args) {
        Monitor m = new Monitor();
        MyThread1 th1 = new MyThread1(m);
        MyThread2 th2 = new MyThread2(m);
        th1.start();
        th2.start();
    }
}