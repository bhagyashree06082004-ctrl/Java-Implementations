import java.io.*;

public class newDemo {
    public static void main(String[] args) {

        // try {
        //     float list[] = {1.2f, 3.4f, 6.7f, 7.8f, 5.6f, 7.8f};

        //     FileOutputStream fos = new FileOutputStream("List.txt");
        //     DataOutputStream dos = new DataOutputStream(fos);

        //     dos.writeInt(list.length);
        //     for (float f : list) {
        //         dos.writeFloat(f);
        //     }
        //     dos.close();
        //     fos.close();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e);
        // }

        try {
            float list[] = {1.2f, 3.4f, 6.7f, 7.8f, 5.6f, 7.8f};

            FileInputStream fis = new FileInputStream("List.txt");
            DataInputStream dis = new DataInputStream(fis);
            int length = dis.readInt();
            float data;

            for (int i=0; i<length; i++) {
                data = dis.readFloat();
                System.out.println(data);
            } 
            dis.close();
            fis.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
    }
}
