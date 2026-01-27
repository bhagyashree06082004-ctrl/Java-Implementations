import java.util.Date;

class Student{
    private String rollNo;
    private static int autoRollNo = 1;

    public String generateRollNo(){
        Date d = new Date();
        rollNo = "Univ-"+ (d.getYear()+1900) + "-" + autoRollNo;
        autoRollNo++;

        return rollNo;
    }

    Student(){
        this.rollNo = generateRollNo();
    }

    public String getRollNo(){
        return this.rollNo;
    }


}

public class AutomatedRollNo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("Student 1 Roll No: " + s1.getRollNo());
        System.out.println("Student 2 Roll No: " + s2.getRollNo());
    }
    
}
