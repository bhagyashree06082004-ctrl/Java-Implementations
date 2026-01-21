import java.io.*;

class Student1 {
    int id;
    String name;
    String dept;
}

public class DataStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\core java abdul bari\\IO Streams\\Data1.txt");

            DataOutputStream dos = new DataOutputStream(fos);

            Student1 s = new Student1();
            s.id = 22005062;
            s.name = "VEdant";
            s.dept = "CSE";

            dos.writeInt(s.id);
            dos.writeUTF(s.name);
            dos.writeUTF(s.dept);

            dos.close();
            fos.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
