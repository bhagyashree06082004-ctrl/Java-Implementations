import java.io.*;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("D:\\core java abdul bari\\IO Streams\\Data.txt", "rw");

            System.out.println((char)raf.read());
            System.out.println((char)raf.read());
            System.out.println((char)raf.read());
            System.out.println((char)raf.read());
            raf.write('V');
            System.out.println((char)raf.read());
            System.out.println((char)raf.read());

            raf.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }    
}
