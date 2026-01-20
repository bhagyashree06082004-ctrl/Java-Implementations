

class StudentTest {
   private int rollNo;
   private String name;
   private String course;
   private int total_marks;

   StudentTest(int rollNo, String name, String course, int total_marks) {
      this.rollNo = rollNo;
      this.name = name;
      this.course = course;
      this.total_marks = total_marks;
   }

   public String grade() {
      return this.total_marks > 60 ? "Your grade is A" : "Your grade is B";
   }
}

public class Student {
   public Student() {
   }

   public static void main(String[] args) {
      StudentTest s = new StudentTest(10, "Betu", "CSE", 90);
      System.out.println(s.grade());
   }
}