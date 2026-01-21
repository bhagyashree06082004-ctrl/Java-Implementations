import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        File f = new File("D:\\core java abdul bari\\IO Streams");
        System.out.println(f.isDirectory());
        File str[] = f.listFiles();
        for (File s : str) {
            System.out.println(s.getName()+ " ");    
        }
        
    }
}
