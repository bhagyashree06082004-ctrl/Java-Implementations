import java.io.*;

class Student2 implements Serializable {
    int id;
    String name;
    String dept;
    Student2(){} // must have non parameterized constructor
}

public class SerializationDemo {
    public static void main(String[] args) {
        // try {
        //     FileOutputStream fos = new FileOutputStream("D:\\core java abdul bari\\IO Streams\\Data2.txt");

        //     ObjectOutputStream oos = new ObjectOutputStream(fos);

        //     Student2 s = new Student2();
        //     s.id = 22005062;
        //     s.name = "VEdant";
        //     s.dept = "CSE";

        //     oos.writeObject(s);

        //     oos.close();
        //     fos.close();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e);
        // }  
        
        try {
            FileInputStream fis = new FileInputStream("D:\\core java abdul bari\\IO Streams\\Data2.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student2 s = (Student2) ois.readObject();

            System.out.println(s);

            ois.close();
            fis.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
