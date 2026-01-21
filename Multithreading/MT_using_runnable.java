/**
 * @author Amey Medewar
 *
 */
public class MT_using_runnable implements Runnable {
    public void run(){
        while (true) { 
            System.out.println("Hello");
        }
    }
/**
 * Main Method for the runnable and MT class
 * @param args
 */
    public static void main(String[] args) {
        MT_using_runnable m = new MT_using_runnable();
        Thread th = new Thread(m);
        th.start();
        while (true) { 
            System.out.println("World");
        }
    }
}

    

