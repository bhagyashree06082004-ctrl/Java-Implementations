import java.io.*;

class Student {
    int roll;
    String name;
    String dept;
}

public class PrintStreamDemo {
    public static void main(String[] args) {
        try {
            // FileOutputStream fos = new FileOutputStream("D:\\core java abdul bari\\IO Streams\\Data.txt");

            // PrintStream ps = new PrintStream(fos);

            // Student s = new Student();
            // s.roll = 22005062;
            // s.name = "Vedant";
            // s.dept = "CSE";

            // ps.println(s.roll);
            // ps.println(s.name);
            // ps.println(s.dept);

            // ps.close();
            // fos.close();


            FileInputStream fis = new FileInputStream("D:\\core java abdul bari\\IO Streams\\Data.txt");

            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            Student s = new Student();
            s.roll = Integer.parseInt(br.readLine());
            s.name = br.readLine();
            s.dept = br.readLine();

            System.out.println("Roll No. : "+ s.roll);
            System.out.println("Name : "+ s.name);
            System.out.println("Department : "+ s.dept);

            br.close();
            fis.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }        
    }
}
