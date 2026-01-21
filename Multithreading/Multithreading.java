class Mythread extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println("Hello");
        }
    }
}

public class Multithreading{
    public static void main(String[] args) {
        Mythread m = new Mythread();
        m.start();
        int j=1;
        while(true){
            System.out.println("World");
        }
    }
}