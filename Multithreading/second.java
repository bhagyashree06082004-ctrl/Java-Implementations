class test implements  Runnable{
    @Override
    public  void run(){
        int i=0;
        while (true) { 
            System.err.println(i+" yaaa");
            i++;
        }
    }
}

class second {
    public static void main(String[] args) {
        test t = new test();
        Thread th = new Thread(t);
        th.start();
            int i=0;
        while (true) { 
            System.out.println(i+" huuu");
            i++;   
        }
    }
}