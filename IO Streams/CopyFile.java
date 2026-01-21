import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class CopyFile {
    public static void main(String[] args) {

        // try {
        //     FileInputStream fis = new FileInputStream("D:\\core java abdul bari\\IO Streams\\Source1.txt");
        //     byte b[] = new byte[fis.available()];
        //     fis.read(b);
        //     String str =new String(b);
        //     fis.close();

        //     FileOutputStream fos = new FileOutputStream("D:\\core java abdul bari\\IO Streams\\Source2.txt");
        //     fos.write(str.toLowerCase().getBytes());
        //     fos.close();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e);
        // }



        try {
            FileInputStream fis1 = new FileInputStream("D:\\core java abdul bari\\IO Streams\\Source1.txt");
            FileInputStream fis2 = new FileInputStream("D:\\core java abdul bari\\IO Streams\\Source2.txt");

            FileOutputStream fos = new FileOutputStream("D:\\core java abdul bari\\IO Streams\\Destination.txt");

            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

            int b;
            while ((b=sis.read())!=-1) {
                fos.write(b);
            }

            sis.close();
            fis1.close();
            fis2.close();
            fos.close();


        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
                

    }
}
