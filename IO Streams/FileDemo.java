import java.io.*;

public class FileDemo {
    public static void main(String[] args) {

        // File output stream

        try {
            FileOutputStream fos =  new FileOutputStream("D:\\core java abdul bari\\IO Streams\\Test.txt");
            String str = "HEllo Vedant!!!!!!!";

            //method 1 :---
            fos.write(str.getBytes()); 

        //     //method 2:--
        //     byte by[] = str.getBytes();
        //     // for (byte b : by) {
        //     //     fos.write(b);
        //     // }

        //     //fos.write(by, 6, str.length()-6);

            fos.close();

        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        // try {
        //     FileWriter fw =  new FileWriter("D:\\core java abdul bari\\IO Streams\\Test.txt");
        //     String str = "HEllo Vedant!!!!!!!";

        //     // method 1 :---
        //     fw.write(str);

        //     //method 2:--
        //     // byte by[] = str.getBytes();
        //     // for (byte b : by) {
        //     //     fos.write(b);
        //     // }

        //     //fos.write(by, 6, str.length()-6);

        //     fw.close();


        // } catch (FileNotFoundException e) {
        //     // TODO: handle exception
        //     System.out.println(e);
        // } catch (IOException e) {
        //     System.out.println(e);
        // }


        // file input stream

        // try {
        //     FileInputStream fis = new FileInputStream("D:\\core java abdul bari\\IO Streams\\Test.txt");

        //     //method 1
        //     // byte b[] = new byte[fis.available()];
        //     // fis.read(b);
        //     // String str = new String(b);
        //     // System.out.println(str); 

        //     //method 2 
        //     // int x;
        //     // do {
        //     //     x = fis.read();
        //     //     if (x!=-1) {
        //     //         System.out.print((char)x);
        //     //     }
        //     // } while (x!=-1);

        //     //method 3
        //     int x;
        //     while ((x = fis.read())!=-1) {
        //         System.out.print((char)x);
        //     }

        //     // file input stream is same as filereader
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e);
        // }
    }
}
