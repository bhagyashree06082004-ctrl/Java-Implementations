import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteDemo {
    public static void main(String[] args) {
        try {
            // byte b[] = {'a','b','c','d','e','f','g','h','i','j','k'};
            // ByteArrayInputStream bis = new ByteArrayInputStream(b);

            // String str = new String(bis.readAllBytes());

            // System.out.println(str);

            // bis.close();


            ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

            bos.write('V');
            bos.write('E');
            bos.write('D');
            bos.write('A');
            bos.write('N');
            bos.write('T');

            bos.writeTo(new FileOutputStream(" D:\\core java abdul bari\\IO Streams\\Test.txt"));


        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
    }
}
